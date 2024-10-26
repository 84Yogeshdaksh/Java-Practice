import java.util.Scanner;

public class evenorodd {
    public class logic{
        void checker(int n){
            if(n%2==0){
                System.out.println("Number "+n+" is ever");
            }
            else
                System.out.println("Number "+n+" is odd");
        }
    }
    public static void main (String args[]){
        evenorodd outer = new evenorodd();
        logic obj = outer.new logic();
        System.out.println("Eneter a integer number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.checker(n);


    }
    
    
}
