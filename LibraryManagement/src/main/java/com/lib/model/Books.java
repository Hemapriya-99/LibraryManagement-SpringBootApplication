package com.lib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table (name="library")
public class Books  
{  
   @Id  
   @Column  
   private int bookid;  
   @Column  
   private String bookname;  
   @Column  
   private String genre;  
   @Column  
   private int quantity;  
   
   public int getBookid()   
   {  
     return bookid;  
   }  
   public void setBookid(int bookid)   
   {  
     this.bookid = bookid;  
   }  
   public String getBookname()  
   {  
     return bookname;  
   }  
   public void setBookname(String bookname)   
   {  
     this.bookname = bookname;  
   }
   public String getGenre()
   {
	  return genre;
   }
   public void setGenre(String genre)
   {
	  this.genre = genre;
   }
   public int getQuantity() 
   {
	 return quantity;
   }
   public void setQuantity(int quantity)
   {
	  this.quantity = quantity;
   }  
}  