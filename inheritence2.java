import java.util.Scanner;

/**
 * inheritence2
 */
public class inheritence2 {

    public class information {
        String name;
        int age;
        int rollno;

        void display(){
            System.out.println("Welcome "+name);
            System.out.println("Roll No.: "+rollno);
            System.out.println("Age: "+age);
        }        
    }

    public class Marks extends information{
        int Database_management_sysstem;
        int OOPS_Using_Java;
        int Energy_Conservation;
        int Universal_Human_values;
        int communication_Skill_2;
        int E_Commerce;

        void DisplayMarks(){
            System.out.println("Database managemenet System\t\t\t"+ Database_management_sysstem);
            System.out.println("OOPS Using Java\t\t\t\t\t"+OOPS_Using_Java);
            System.out.println("Energy conservation\t\t\t\t"+Energy_Conservation);
            System.out.println("Universal Human Values\t\t\t\t"+Universal_Human_values);
            System.out.println("Communication Skills 2ndt\t\t\t"+communication_Skill_2);
            System.out.println("E-Commerce\t\t\t\t\t"+E_Commerce);
            
        }
    }

    public static void main(String args[]) {
        inheritence2 outterclass = new inheritence2();
        inheritence2.Marks d = outterclass.new Marks();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String Username = input.nextLine();
        System.out.println("Enter you age here: ");

        int age = input.nextInt();

        d.name = Username;
        d.rollno=33;
        d.age= age;

        d.Database_management_sysstem=33;
        d.E_Commerce=22;
        d.E_Commerce=38;
        d.OOPS_Using_Java=99;
        d.Universal_Human_values=88;
        d.communication_Skill_2=74;

        d.display();
        d.DisplayMarks();

        double par = (d.Database_management_sysstem+d.E_Commerce+d.Energy_Conservation+d.OOPS_Using_Java+d.Universal_Human_values+d.communication_Skill_2)/6;
        System.out.println("Parcentae="+par);

        if (par>=33) {
            System.out.println("pass");
            
        }
        else
        System.out.println("fail");
    }
}