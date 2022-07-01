package com.example.springrest.controller;

import com.example.springrest.model.Book;
import com.example.springrest.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/testString/")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String hello(){
        return "Hello world";
    }

    @GetMapping(path= "/getbooks")
    public Book getBooks(){
        Book book = new Book();
        book.setBookId(123);
        book.setBookName("JavaBook");
        book.setAuthorName("Ahmed");
        book.setOpString("Go Study");
        return book;
    }

    @GetMapping(path="/allbooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

  /*  @GetMapping(path = "api/v1/testString/{id}")
    public Book getBookById(@PathVariable("id") String id){
        System.out.println("Id: "+id);
        return this.bookService.getBookById(Integer.parseInt(id));
    }*/

    //Path Variable Name & Id //
    @GetMapping(path = "/{name}")
    public Book getBookById(@PathVariable(name="name") String id){
        return this.bookService.getBookById(Integer.parseInt(id));
    }

   /* @GetMapping("/{id}/{name}")
    public Book getBookIDAndName(@PathVariable String id, @PathVariable String name){
        System.out.println("Id: "+id+" "+"Name: "+name);
        return this.bookService.getBookIDAndName(Integer.parseInt(id), name);
    }*/

   /* @GetMapping("/{name}")
    public Book getBookNamee( @PathVariable String name){
        System.out.println("Name: "+name);
        return this.bookService.getBookName(name);
    }*/
    /*@GetMapping(path={"/{id}","/{id}/{name}"})
    public Book getBookByIdOrName(@PathVariable String id, @PathVariable Optional <String> name){
        System.out.println("Id: "+id+" "+"Name: "+name+" "+"get from optional"+name.get());
        Book b = null;
        if(name.isPresent()){
            b = bookService.getBookIDAndName(Integer.parseInt(id),name.get());
        }else {
            b = bookService.getBookById(Integer.parseInt(id));
        }
        return b;
    }*/
    @PostMapping(path="books")

    public List<Book> addBook(@RequestBody Book book){
        System.out.println(book);
        return this.bookService.addBook(book);
    }

}
