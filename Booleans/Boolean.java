import java.util.Scanner;

public class Boolean {


      public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age= scanner.nextInt();
        // boolean isOldEnough=age>18;
        // scanner.close();
      
      
       
        // if (isOldEnough){
        //   System.out.println("You are Allowed to vote: ");
        // } else{
        //   System.out.println("You are too young to vote");
        // }
    
                Scanner scanner = new Scanner(System.in);
        
                // Question 1: Do you have a license?
                System.out.print("Do you have a license? (Yes/No): ");
                String licenseInput = scanner.nextLine();
                boolean hasLicense = "Yes".equalsIgnoreCase(licenseInput);
        
                // Question 2: Do you have an insurance cover?
                System.out.print("Do you have an insurance cover? (Yes/No): ");
                String insuranceInput = scanner.nextLine();
                boolean hasInsurance = "Yes".equalsIgnoreCase(insuranceInput);
        
                // Close the scanner
                scanner.close();
        
                // Display the information
                System.out.println("\nUser Input Summary:");
                System.out.println("1. Do you have a license? " + (hasLicense ? "Yes" : "No"));
                System.out.println("2. Do you have an insurance cover? " + (hasInsurance ? "Yes" : "No"));
            }
        }
        
    
    
    
    
  
      
      
    
    //1.  Basic Boolean Declaration and assignment
    // boolean isStudent = true;
    // System.out.println("Is the person a student? " + isStudent);

    //2.  Boolean Comparison
    // int age = 25;
    //   boolean isAdult = age >= 18;
    //   System.out.println("Is the person an adult? " + isAdult);

    //3.  Boolean Logic
      // boolean hasLicense = true;
      // boolean hasInsurance = false;

      //   boolean canDrive = hasLicense && hasInsurance;
      //   System.out.println("Can the person drive? " + canDrive);


      //4.  Using a Boolean Method
    //   boolean isPrimeNumber(int number) {
    //     if (number <= 1) {
    //         return false;
    //     }
    
    //     for (int i = 2; i <= Math.sqrt(number); i++) {
    //         if (number % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    //     int num = 17;
    //     System.out.println(num + " is a prime number: " + isPrimeNumber(num));


    //5.  Boolean as a Return Type
    // boolean isValidEmail(String email) {
    //   // Check if the email follows a basic format
    //   return email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    // }
  
    // String emailAddress = "user@example.com";
    // System.out.println("Is the email address valid? " + isValidEmail(emailAddress));
  
    
    
    
    
    
    

    
  