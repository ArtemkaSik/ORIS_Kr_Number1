package repository;

import model.Gifts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftRepository {

    public List<Gifts> getAllGifts() {
        List<Gifts> gifts = new ArrayList<>();
        try (Connection conn = DbWork.getInstance().getConnection()) {
            String query = "SELECT * FROM gifts";
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    gifts.add(new Gifts(
                            rs.getLong("id"),
                            rs.getString("title"),
                            rs.getString("giver"),
                            rs.getString("receiver"),
                            rs.getDate("delivery_date")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gifts;
    }

    public Gifts getGiftById(Long id) {
        try (Connection conn = DbWork.getInstance().getConnection()) {
            String query = "SELECT * FROM gifts WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setLong(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Gifts(
                            rs.getLong("id"),
                            rs.getString("title"),
                            rs.getString("giver"),
                            rs.getString("receiver"),
                            rs.getDate("delivery_date")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
