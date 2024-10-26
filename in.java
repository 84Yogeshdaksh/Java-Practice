import java.util.Scanner;



public class in {
    public class percentage{
        void show(){ System.out.println("Enter you marks here: ");
        Scanner input = new Scanner(System.in);
        int take = input.nextInt();
        System.out.println("parcentage: "+take/100f);
    }
       
    }
    
    public static void main(String[] args) {
        in outer = new in();
        percentage obj = outer.new percentage();

        obj.show();
    }
    
}
