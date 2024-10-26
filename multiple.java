interface mark{
    int age=30;
    int showmarks();
}

interface parcentage{
    String name = "Yogesh";
    float showparcent();
}

class student implements mark,parcentage{
    public int showmarks(){
        return 1004;
    }

    public float showparcent(){
        return 70.2f;
    }

    void showname(){
        System.out.println("age: "+age);
        System.out.println("name: "+name);
    }

}

public class multiple{
    public static void main(String[] args) {
        student obj = new student();
        System.out.println("mark: "+obj.showmarks());
        System.out.println("parcentage: "+obj.showparcent());
        obj.showname();
    }
}