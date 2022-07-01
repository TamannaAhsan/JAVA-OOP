package com.example.springrest.services;

import com.example.springrest.model.Book;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    public List<Book> list = new ArrayList<Book>();


    public BookService() {
        list.add(new Book(123, "JavaBook", "XYZ", "Hi!"));
        list.add(new Book(124, "PythonBook", "XZ", "Hello!"));
        list.add(new Book(125, "JavaBook", "YZ", "Hey!"));
    }

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBookById(int id) {
      Book b = null;
        for (Book books : list
        ) {
            if(books.getBookId()==id){
                 b = books;
                 break;
            }
        }
        return b;
    }
    public Book getBookIDAndName(int id, String name){
        Book b = null;
        for (Book books: list
             ) {
            if(books.getBookId()==id && books.getBookName().equalsIgnoreCase(name)){
                b = books;
                break;
            }
        }
        return b;
    }
    public Book getBookName(String name){
        Book b = null;
        for (Book books: list
        ) {
            if(books.getBookName().equalsIgnoreCase(name)){
                b = books;
                break;
            }
        }
        return b;
    }
    public List<Book> addBook(Book b){
        list.add(new Book(200, "JavaBook", "XYZi", "Hi!"));
        list.add(new Book(201, "JavaSriptBook", "XYZip", "Hi!"));
        return list;
    }
}
