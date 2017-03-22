//author: Brad Kai

public class BookException extends Exception{

	private String message = " ";
   
	   public BookException( ){
	   }
      public String getMessage( ){
         return this.message;
      }   
      public void setMessage(String message){
         this.message = message;
      }
}