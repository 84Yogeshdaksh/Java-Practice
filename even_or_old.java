import java.util.Scanner;

public class even_or_old {
    public class check{
        void checker(int n){
            if(n%2==0){
                System.out.println("The Number is Even....");
            }
            else
            System.out.println("The Number is old.....");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a integer Number: ");
        int input = s.nextInt();
        even_or_old outer = new even_or_old();
        check d = outer.new check();
        d.checker(input);
    }
    
}
