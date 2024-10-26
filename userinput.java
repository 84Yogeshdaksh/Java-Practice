import java.util.Scanner;

public class userinput {
    
    public class input{
        void logic(){
        System.out.println("Enter which type of data you want to insert(string,integer,float): ");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        switch(check){
            case "string":
                System.out.println("Enter Your String value here: ");
                String any = sc.nextLine();
                System.out.println("Your string type value is : "+any);
                break;
            case "integer":
                System.out.println("Enter Your Integer value here: ");
                int n = sc.nextInt();
                System.out.println("Your Integer type value is : "+n);
                break;
            case "float":
            System.out.println("Enter Your Float value here: ");
                float m = sc.nextFloat();
                System.out.println("Your Float point value is : "+m);
                break;
            default:
                System.out.println("Sorry! Right now I'm unavilable to take this type of value.....");

        }
        
    }
}
    public static void main(String[] args) {
        userinput outer = new userinput();
        input in = outer.new input();
        in.logic();


    }
    
}
