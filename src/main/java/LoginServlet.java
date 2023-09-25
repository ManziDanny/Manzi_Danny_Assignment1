/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Danny
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(uname.equals("admin") && pass.equals("123")){
            
            HttpSession session = request.getSession();
            session.setAttribute("username",uname);
           
            response.sendRedirect("Welcome.jsp");
        }else {
            
            HttpSession session = request.getSession();
            session.setAttribute("username",uname);
            
            response.sendRedirect("ForgetPassword.jsp");
        }
    }     
   
}
