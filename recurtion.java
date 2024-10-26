import java.util.Scanner;

public class recurtion {
    public class ine{
        int fact(int n){
            if (n==0 || n==1) {
                return 1;
            }
            else{
                return (n*fact(n-1));
            }
        }
    }
    public static void main(String[] args) {
        recurtion outer = new recurtion();
        ine d = outer.new ine();

        System.out.println("Enter a number: ");
        Scanner f = new Scanner(System.in);
        int input = f.nextInt();

        
        System.out.println("factorial is: "+d.fact(input));


    }
    
}
