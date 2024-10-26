class Animal{
    void printdata(){
        System.out.println("Some Sound..");
    }
}

class Dog extends Animal{
    @Override
    void printdata(){
        System.out.println("Woof");
    }
}

class cat extends Animal{
    @Override
    void printdata(){
        System.out.println("Meow");
    }
}
public class downcasting {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        dog.printdata();
        animal.printdata();

        Animal animal2 = new cat();
        animal2.printdata();
    }
    
}
