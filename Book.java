//author: Brad Kai

import java.io.*;
import java.util.*;
import java.text.*;

public class Book{
   //instance variables
   private String title = "";
   private int isbn = 0;
   private int quantity = 0;
   
   //constructor
   public Book(String title, int isbn, int quantity)throws BookException{
      //this.title = title;
      //this.isbn = isbn;
      //this.quantity = quantity;
      setTitle(title);
      setIsbn(isbn);
      setQuantity(quantity);
   }
   
    //toString Method
   public String toString( ){
      String a = " ";
      a = a+"\nBook name: "+this.title;
      a = a+"\nisbn: "+this.isbn;
      a = a+"\nquantity: "+this.quantity+"\n";
      return a;
   }
   
   //get method
   public String getTitle( ){
      return this.title;
   }
   public int getIsbn( ){   
      return this.isbn;
   }
   public int getQuantity( ){ 
      return this.quantity;
   }
      
   //set method
   //public void settitle(String newtitle)throws Exception{
      //this.title = title;
   //}
   //public void setisbn(String newisbn){   
      //this.isbn = isbn;
   //}
   //public void setquantity(String newquantity){ 
      //this.quantity = quantity;
   //}

   //set method Exception
   public void setTitle(String newTitle)throws BookException{
	   if(newTitle.length( ) > 0){
        this.title = newTitle;
      }
      else{
		  BookException be = new BookException( );
		  be.setMessage("Title cannot be blank.\n");//title exception
		  throw be;
		 }
   }    
   public void setIsbn(int newIsbn)throws BookException{
	   if(newIsbn > 0){
		   this.isbn = newIsbn;
	   }
		else{
			BookException be = new BookException( );
			be.setMessage("The ISBN number cannot be zero or a negative number.\n");//isbn 0 or negative exception
			throw be;
		}	
   }
   //public void setIsbn(int newIsbn)throws BookException{
	   //if(newIsbn == ArrayList.isbn){
		   //this.isbn = newIsbn;
	   //}
		//else{
			//BookException be = new BookException( );
			//be.setMessage("The ISBN number is already registered in this session.\n");//isbn duplicate match exception
			//throw be;
		//}	
   //}
   public void setQuantity(int newQuantity)throws BookException{
	   if(newQuantity < 0){
			BookException be = new BookException( );
			be.setMessage("Quantity cannot be negative or null.\n");//quantity exception
			throw be;
      }
      else{
         this.quantity = newQuantity;
		}
   }	
}//end class 