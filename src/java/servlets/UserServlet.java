
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.RoleService;
import services.UserService;


public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

        RoleService rs = new RoleService();
        UserService us = new UserService();

        try {

     
            List<User> users = us.getAll();
            request.setAttribute("users", users);
             getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
             return;
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("message", "error");
        }
     getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
             return;

    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }
}
