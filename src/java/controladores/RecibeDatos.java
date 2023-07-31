package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecibeDatos
 */
public class RecibeDatos extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Recuperar los parámetros del formulario utilizando el método "GET"
            String nombre = request.getParameter("nombre");
            String contrasena = request.getParameter("contrasena");
            
            // Mostrar los datos recibidos en la página
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulario Recibido</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos Recibidos:</h1>");
            out.println("<p>Nombre de usuario: " + nombre + "</p>");
            out.println("<p>Contraseña: " + contrasena + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Recuperar los parámetros del formulario utilizando el método "POST"
            String nombre = request.getParameter("nombre");
            String contrasena = request.getParameter("contrasena");
            
            // Mostrar los datos recibidos en la página
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulario Recibido</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos Recibidos:</h1>");
            out.println("<p>Nombre de usuario: " + nombre + "</p>");
            out.println("<p>Contraseña: " + contrasena + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
