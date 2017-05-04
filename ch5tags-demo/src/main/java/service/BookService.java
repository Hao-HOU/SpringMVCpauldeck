package service;

import domain.Book;
import domain.Category;

import java.util.List;

/**
 * Created by Hao on 2017/5/4.
 */
public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();
}
