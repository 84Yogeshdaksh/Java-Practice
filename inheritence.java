
public class inheritence {
    public class Animal{
        void eat(){
            System.out.println("Eating.....");
        }
    }

    public class Dog extends Animal{
        void bark(){
            System.out.println("Barking.....");
        }
    }

    public static void main(String[] args) {
        inheritence outterclass = new inheritence();
        inheritence.Dog d = outterclass.new Dog();

        d.bark();
        d.eat();
        
    }



    
}