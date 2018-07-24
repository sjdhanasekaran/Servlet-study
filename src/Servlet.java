import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;


@WebServlet(name = "actionpage")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        out.print("\nName"+request.getParameter("n1")+"\nAge"+request.getParameter("n2")+"\nEmail"+request.getParameter("e1"));
    }

}
