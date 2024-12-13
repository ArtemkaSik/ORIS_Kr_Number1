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
import java.sql.*;

@WebServlet("/gift")
public class GiftDetailServlet extends HttpServlet {

    private final GiftService giftService = new GiftService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            Gifts gift = giftService.getGiftById(id);
            request.setAttribute("gift", gift);
            request.getRequestDispatcher("WEB-INF/template/giftDetail.jsp").forward(request, response);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ServletException e) {
            System.out.println(e);
        }
    }
}
