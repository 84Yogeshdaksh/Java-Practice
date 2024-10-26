import java.util.Scanner;

class check{
    void checker(char n){
        if(n=='a' || n=='A' || n=='e' || n=='E' || n=='i' || n=='I' || n=='o' || n=='O' || n=='u' || n=='U'){
            System.out.println("Character is a Vowel");
        }
        else{
            System.out.println("Charcter is a consonent");
        }
        
    }
}
public class alpha {
    public static void main(String args[]){
       
        check obj = new check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charactor : ");
        char n = sc.nextLine();

        obj.checker(n);

    }
    
    }
   
    
