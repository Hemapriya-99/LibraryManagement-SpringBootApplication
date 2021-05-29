package com.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lib.model.Books;
import com.lib.service.BooksService;

@RestController  
public class BooksController   
{  
   @Autowired  
   BooksService booksService;  

   @GetMapping("/getBook")  
   private List<Books> getAllBooks()   
   {  
      return booksService.getAllBooks();  
   }  
   @PostMapping("/getBook/{bookid}")  
   private Books getBooks(@PathVariable("bookid") int bookid)   
   {  
      return booksService.getBooksById(bookid);  
   }  
   @PostMapping("/deleteBook/{bookid}")  
   private String deleteBook(@PathVariable("bookid") int bookid)   
   {  
      booksService.delete(bookid);  
      return "Deleted Successfully";
   }  
   @PostMapping("/saveBook")  
   private String saveBook(@RequestBody Books books)   
   {  
     booksService.saveOrUpdate(books);
     //return books.getBookid();  
     return "Added Successfully";
   }  
   @PostMapping("/editBook/{bookid}")  
   private Books update(@RequestBody Books books)   
   {  
     booksService.saveOrUpdate(books);  
     return books;  
   }  
}  