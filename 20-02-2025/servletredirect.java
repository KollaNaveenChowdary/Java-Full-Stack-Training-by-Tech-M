import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect")
public class ServletRedirect extends HttpServlet { 
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException { 
        resp.sendRedirect("https://www.geeksforgeeks.org/url-rewriting-using-java-servlet/");
    }
}
