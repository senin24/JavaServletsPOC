package controller;

import utils.InitTestsData;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

public class HomePageServlet extends HttpServlet {

    public void init() {
        getServletContext().setAttribute("app", InitTestsData.getInitData());
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/homepage.jsp");
        dispatcher.forward(request, response);
    }
}
