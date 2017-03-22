//author: Brad Kai

import java.io.*;
import java.util.*;
import java.text.*;

public class BookStore{

   public static void main(String arg[ ]) throws Exception{
   
     Scanner read = new Scanner(System.in);
     Book onebook;
     List<Book> ArrayList = new ArrayList<Book>( );
     String title = " ";
     int isbn = 0;
     int quantity = 0;
     
     while(true){
     
      try{
      
        System.out.print("Enter title: ");
        title = read.nextLine( );
        read = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Enter isbn: ");
        isbn = read.nextInt( );
        read = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Enter quantity: ");
        quantity = read.nextInt( );
        read = new Scanner(System.in);
        System.out.println();
       
        if (title.length() >= 0 || title != " " && isbn >= 1 && quantity >= 0){
         onebook = new Book(title, isbn, quantity);
         ArrayList.add(onebook);
            System.out.println("Book is added to the list.\n");
        }//end book add
      
      }//end try
      
      catch(BookException bk){
         System.out.println("Book not added to list.\n" + bk.getMessage());//call message from BookException
      }//end exception message catch  
      
      catch(InputMismatchException ime){ 
         System.out.println("You did not enter a number value that meets criteria.\n");
      }//end mismatch catch
     
     if (title.length( ) == 0 || title == " " && isbn == 0 && quantity == 0){
         System.out.println("No valid values to Title, ISBN, and Quantity. Printing any books entered in this session.\n");
            Collections.reverse(ArrayList);//reverses order of ArrayList
            for(int i=0; i<ArrayList.size( ); i++){
               System.out.println(ArrayList.get(i)+"\n");
            }//end for ArrayList print
         System.out.println("Session ending. Goodbye.\n");
        break;      
        }//end if for no valid values 
         
     }//end while
      
   }//end method
   
}//end class
