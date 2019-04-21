package customTag;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "MyServlet")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");

        List<String> beers = Arrays.asList("Bud Light", "Coors Light", "Budweiser", "Miller Lite", "Corona Extra");
        request.setAttribute("beers", beers);
        request.getRequestDispatcher("foreach.jsp").forward(request,response);
    }
}
