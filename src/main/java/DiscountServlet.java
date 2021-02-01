import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountServlet", urlPatterns = "/calculate")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String desc = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("percent"));
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("Description: " + desc);
        writer.println("List Price: " + listPrice);
        writer.println("Discount Amount: " + discountAmount);
        writer.println("Discount Price: " + discountPrice);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
