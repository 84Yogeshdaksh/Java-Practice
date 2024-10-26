
public class interf{
    public interface show{
        int age=10;
        String name="Yogesh Kumar";
        String RollNo="E22113835500033";
        void showage();
        void showname();
        void showRollNo();
    }
    class showinformation implements show{
        public void showname(){
            System.out.println("Name: "+name);
        }
        public void showage(){
            System.out.println("Age: "+age);
        }
        public void showRollNo(){
            System.out.println("Roll Number: "+RollNo);
        }
    
    }
    
    public static void main(String[] args) {
        interf outer = new interf();
        showinformation obj = outer.new showinformation();
        obj.showname();
        obj.showRollNo();
        obj.showage();
    }
    
}
