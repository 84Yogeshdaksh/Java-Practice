import java.util.Scanner;

public class factorial {
    public class fact{
        int factmethod(int n){
            if(n==0 || n==1){
                return 1;
              
            }
            else
                return n*factmethod(n-1);
        }
    }
    public static void main(String[] args) {
        factorial outer = new factorial();
        fact obj = outer.new fact();
        System.out.println("Enter a integar value you want: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is "+n+" is: "+obj.factmethod(n));
        
    }
    
}
