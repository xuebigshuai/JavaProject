package com.services;

import com.model.Book;
import com.model.Category;

import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooked();
    Book save(Book book);
    Book get(Long id);
    Book update(Book book);
    Long getNextId();

}
