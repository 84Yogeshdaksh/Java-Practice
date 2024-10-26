import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        System.out.println("Enter Your name:");

        String Unsername = Myobj.nextLine();
        System.out.println("Welcome "+Unsername);

        System.out.println("enter your age:");
        int age = Myobj.nextInt();
        if (age>=18) {
            System.out.println("You're eligibil for this contest "+Unsername);
        }
        else{
            System.out.print("Sorry "+Unsername);
            System.out.println(" You're not eligibil for this contest");
        }
           
    }
    
}
