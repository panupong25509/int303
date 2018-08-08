/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prime.number.model.SimpleCalculator;

/**
 *
 * @author INT303
 */
public class VerySimpleCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                String xStr = request.getParameter("x");
                String yStr = request.getParameter("y");
                String operator = request.getParameter("operator");

                double x = Double.valueOf(xStr);
                double y = Double.valueOf(yStr);
                SimpleCalculator sc = new SimpleCalculator(x,y,operator);
                request.setAttribute("calculator", sc);
                getServletContext().getRequestDispatcher("/SimpleCalculatorView.jsp").forward(request, response);
//                double result = 0;
//                if (operator.equalsIgnoreCase("+")) {
//                    result = x + y;
//                    operator = "+";
//                } else if (operator.equalsIgnoreCase("-")) {
//                    result = x - y;
//                } else if (operator.equalsIgnoreCase("*")) {
//                    result = x * y;
//                } else if (operator.equalsIgnoreCase("/")) {
//                    result = x / y;
//                }
//                out.println("<!DOCTYPE html>");
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet VerySimpleCalculatorServlet</title>");
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<h1> "+sc.toString()+"</h1>\n");
//                out.println("</body>");
//                out.println("</html>");
            } catch (Exception e) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet VerySimpleCalculatorServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println(String.format("<h1> กรอกผิดอะครับ กลับไปกรอกใหม่นะครับ</h1>"));
                out.println("</body>");
                out.println("</html>");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
