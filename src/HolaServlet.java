package com.ejemplo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class HolaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("mensaje", "¡Hola desde el Servlet de rodrigo modificando WAR desde la práctica 04-06.07!");
        request.getRequestDispatcher("/hola.jsp").forward(request, response);
    }
}
