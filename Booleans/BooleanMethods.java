public class BooleanMethods {
  public static void main(String[] args) {
   
      
      String emailAddress = "user@example.com";
    System.out.println("Is the email address valid? " + isValidEmail(emailAddress));
  }
  
  public static boolean isValidEmail(String email){
    // Check if the email follows a basic format
    return email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

  }
  
    
  }
  
  

