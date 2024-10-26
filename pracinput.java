import java.util.Scanner;

public class pracinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter something:");
        String name = input.nextLine();
        System.out.println("your name is: "+name);

        System.out.println("enter you age:");

        int age = input.nextInt();
       
        System.out.println("age: "+age);

        System.out.println("Enter you parcentage:");

        float Condition = input.nextFloat();

        System.out.println("your parcentage is: "+Condition);

    }
    
}
