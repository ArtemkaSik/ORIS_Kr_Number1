package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Gifts;
import repository.GiftRepository;
import service.GiftService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/")
public class GiftServlet extends HttpServlet {
    private final GiftService service = new GiftService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Gifts> gifts = service.getAllGifts();
            request.setAttribute("gifts", gifts);
            request.getRequestDispatcher("WEB-INF/template/gifts.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            System.out.println(e);
        }
    }
}