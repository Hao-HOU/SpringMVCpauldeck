package servlet;

import domain.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hao HOU on 2017/5/10.
 */
@WebServlet(urlPatterns = {"/books"})
public class BooksServlet extends HttpServlet{

    private static final long serialVersionUID = -8103638979506414569L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("978-0980839616", "Java 8", BigDecimal.valueOf(45.00));
        Book book2 = new Book("978-1223648378", "Struts", BigDecimal.valueOf(39.95));
        Book book3 = new Book("978-2134523435", "Mysql", BigDecimal.valueOf(49.95));

        books.add(book1);
        books.add(book2);
        books.add(book3);

        request.setAttribute("books", books);
        RequestDispatcher rd = request.getRequestDispatcher("books.jsp");
        rd.forward(request, response);
    }
}
