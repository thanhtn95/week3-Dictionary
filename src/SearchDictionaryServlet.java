import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/search")
public class SearchDictionaryServlet extends javax.servlet.http.HttpServlet {
    private static final String[][] dictionary = {{"pen", "but"}, {"apple", "táo"}, {"condom", "Bcs"}, {"house", "ngôi nhà"}};

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String input = request.getParameter("input");
        request.setAttribute("input", input);
        boolean flag = true;
        for (String[] word : dictionary) {
            if (input.equalsIgnoreCase(word[0])) {
                request.setAttribute("result", word[1]);
                flag = false;
                break;
            }
        }
        if (flag) request.setAttribute("result", "That word isn't in this dictionary");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
