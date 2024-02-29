import java.util.Scanner;
public class UserInputForm {
  public static void main(String[] args) {
    canDrive();
    
    
  }
  public class Driver{
    boolean hasLicense ;
    boolean hasInsurance;
    int hasageLimit18;
    public Driver (boolean hasLicense, boolean hasInsurance, int hasageLimit18){
      this.hasInsurance=hasInsurance;
      this.hasLicense=hasLicense;
      this.hasageLimit18=hasageLimit18;
    }

  }
  public static void canDrive(){
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you have a License? Yes/No ");
    boolean hasLicense ="Yes".equalsIgnoreCase(scanner.nextLine());
    System.out.println("Do you have an Insurance Cover? Yes/No ");
    boolean hasInsurance= "Yes".equalsIgnoreCase(scanner.nextLine());
    System.out.println("Enter Age: ");
    int hasageLimit18= scanner.nextInt();
    scanner.close();
   
    
    if(hasInsurance&&hasLicense&&hasageLimit18>=18){
      System.out.println(" You can Drive");
    } else{
      System.out.println(" You are not eligible to Drive");
    }



  }
}
