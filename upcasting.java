class parent{
    void printdata(){
        System.out.println("Method of parent class");
    }
}

class child1 extends parent{
    void printdata(){
        System.out.println("Method of child1 class");
    }
}


public class upcasting {
    public static void main(String[] args) {
        parent obj1 = (parent) new child1();
        parent obj2 = (parent) new child1();

        // parent d = new child1();
//The commanted two lines is the example of downcastin
        // d.printdata();

        obj1.printdata();
        obj2.printdata();
        int n = 10;
        float f =n;
        System.out.println("Bnefore typecasting the value is : "+n);
        System.out.println("After typecasting the value is : "+f);
        
        
    }
}
