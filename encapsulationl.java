public class encapsulationl {
    public class TestEncapsulation{
        private int age;
        private String name;
        private int RollNo;
    
        int getAge (){
            return age;
        }
        int getRollNo(){
            System.out.println("rollno: "+ RollNo);
            return RollNo;
        }
        String getName (){
            System.out.println("Name: "+ name);
            return name;
        }
    
        void setAge(int newage){
            System.out.println("Age: "+ age);
            age = newage;
        }
        void setRollNo(int newrollno){
            RollNo = newrollno;
        }
        void setName(String newName){
            name = newName;
        }
    
    
    }
    
    public static void main(String[] args) {
        encapsulationl outer = new encapsulationl();
        TestEncapsulation obj = outer.new TestEncapsulation();

    //     obj.setAge(13);
    //     obj.setName("Rohit");
    //     obj.setRollNo(33);

    //     System.out.println("Name: "+ obj.getName());
    //     System.out.println("Roll No: "+ obj.getRollNo());
    //     System.out.println("Age: "+ obj.getAge());
        obj.name="rohit";
        obj.RollNo=33;
        obj.age=43;

        obj.getAge();
        obj.getName();
        obj.getRollNo();
    }
    
}
