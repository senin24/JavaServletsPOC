package controller;

import dao.UserDao;
import model.User;
import utils.InitTestsData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    public void init() throws ServletException {
        getServletContext().setAttribute("app", InitTestsData.getInitData());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        getServletContext().setAttribute("path",request.getContextPath());
        out.print("<p style=\"color:red\">" + request.getContextPath() + "</p>");



        try {
            User user = new User();
            user.setLogin(request.getParameter("username"));
            user.setPassword(request.getParameter("userpass"));

            if (UserDao.isValid(user)) {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/homepage.jsp");

                HttpSession session = request.getSession();
                session.setAttribute("currentSessionUser", user);

//                getServletContext().setAttribute("currentSessionUser",user);
//                request.setAttribute("currentSessionUser", user);
                dispatcher.forward(request, response);

//                out.print("<p style=\"color:red\">USER VALID!</p>");
//                HttpSession session = request.getSession(true);
//                session.setAttribute("currentSessionUser",user.getName());
//                response.sendRedirect("/WEB-INF/homepage.jsp");
            }
            else
                out.print("<p style=\"color:red\">Sorry username or password error! Please try again!</p>");
                RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
                rd.include(request,response);
        } catch (Throwable theException) {
            out.print("<p style=\"color:red\">" + theException + "</p>");
        }
            out.close();
    }
}
