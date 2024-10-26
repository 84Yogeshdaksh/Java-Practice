import java.util.Scanner;

public class inheritance {
    public class Marks{
        int JAVA,DBMS,E_Commerce,communication_Skill;
        void showmarks(){
           
            System.out.println("dbms: "+DBMS);
            System.out.println("java: "+JAVA);
            System.out.println("E_commerce: "+E_Commerce);
            System.out.println("Communication skill: "+communication_Skill);
    
            }
        }
    public class students extends Marks{
        void student1(){
            System.out.println("Roll No: E22113835500001");
            showmarks();
        }
    
        void student2(){
            System.out.println("Roll No: E22113835500033");
            showmarks();
        }
    }
    public static void main(String[] args) {
        inheritance outer = new inheritance();
        students d = outer.new students();
        System.out.println("Enter your Enrollment No. ");
        Scanner input = new Scanner(System.in);
        String Er = input.nextLine();
        switch (Er) {
            case "E22113835500001":
                d.JAVA=33;
                d.DBMS=35;
                d.communication_Skill=45;
                d.E_Commerce=23;
                d.student1();
                  break;
            case "E22113835500033":
                d.JAVA=33;
                d.DBMS=25;
                d.communication_Skill=29;
                d.E_Commerce=36;
                d.student2();
            
            default:
            System.out.println("Invalid Enrollment Number......!");
                break;
        }
       

    }
    
}
