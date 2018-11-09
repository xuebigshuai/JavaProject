package com.services.impl;

import com.model.Book;
import com.model.Category;
import com.services.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
@Service
public class BookServiceImpl implements BookService {
    private List<Category> categories;
    private List<Book> books;

    public BookServiceImpl() {
        categories=new ArrayList<Category>();
        Category category1=new Category(1,"Computing");
        Category category2=new Category(2,"Travel");
        Category category3=new Category(3,"Health");
        Category category4=new Category(4,"Animal");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        Book book1=new Book(1L,"0215412512","Servlet&JSP",category1,"ddd");
        Book book2=new Book(2L,"0215412513","HHH",category2,"mmm");
        Book book3=new Book(3L,"0215412514","NEW",category3,"nnn");
        Book book4=new Book(4L,"0215412515","ahsdh",category4,"vvv");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }


    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        for (Category category:categories)
        {
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooked() {
        return books;
    }

    @Override
    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    @Override
    public Book get(Long id) {
        for (Book book:books) {
            if(id==book.getId()){
                return book;
            }
        }
        return null;
    }

    @Override
    public Book update(Book book) {
        int bookCount=books.size();
        for (int i = 0; i <bookCount ; i++) {
            Book saveBook=books.get(i);
            if(saveBook.getId()==book.getId()){
                books.set(i,book);
                return book;
            }
        }
        return null;
    }

    @Override
    public Long getNextId() {
        long id=0L;
        for (Book book:books){
            long bookId=book.getId();
            if(id<bookId){
                id=bookId;
            }
        }
        return id+1;
    }
}
