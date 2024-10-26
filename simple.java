//simple hello world program using class and object
public class simple {

    public class printhello{
        void display(){
            System.out.println("Hello World!...");
        }
    }

    public static void main(String[] args) {
        //creating outer class (simple) object
        simple outer = new simple();
        //creating innter class (printhello) object
        printhello obj = outer.new printhello();

        obj.display();
    }
}