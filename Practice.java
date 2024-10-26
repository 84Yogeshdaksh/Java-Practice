

public class Practice {
    public class student{
        String Branch;
        int RollNo;
        String Name;
        int Database_management_sysstem;
        int OOPS_Using_Java;
        int Energy_Conservation;
        int Universal_Human_values;
        int communication_Skill_2;
        int E_Commerce;

      
    
        void info(){
            System.out.println("Name: "+ Name);
            System.out.println("RollNo: "+ RollNo);
            System.out.println("Branch: "+ Branch);
            System.out.println("Subject\t\t\t\t\t Obtain Marks");
        }

        void DisplayMarks(){
            System.out.println("Database managemenet System\t\t\t"+ Database_management_sysstem);
            System.out.println("OOPS Using Java\t\t\t\t\t"+OOPS_Using_Java);
            System.out.println("Energy conservation\t\t\t\t"+Energy_Conservation);
            System.out.println("Universal Human Values\t\t\t\t"+Universal_Human_values);
            System.out.println("Communication Skills 2ndt\t\t\t"+communication_Skill_2);
            System.out.println("E-Commerce\t\t\t\t\t"+E_Commerce);
            
        }
    }

    public static void main(String[] args) {
        Practice outerObject = new Practice();
        Practice.student innerObject = outerObject.new student();

        innerObject.Name = "Yogesh";
        innerObject.Branch = "cs";
        innerObject.RollNo = 33;
        innerObject.Database_management_sysstem=93;
        innerObject.E_Commerce=87;
        innerObject.Energy_Conservation=99;
        innerObject.OOPS_Using_Java=85;
        innerObject.Universal_Human_values=73;
        innerObject.communication_Skill_2=78;

        
        innerObject.info();
        innerObject.DisplayMarks();

        


    }
    
}


