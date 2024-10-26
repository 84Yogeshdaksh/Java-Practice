interface marks{
    String Name = "Yogesh";
    int showmarks();
}

interface par{
    int age = 20;
    float showpar();
}

class multi implements mark,par{
    public int showmarks(){
        return 1004;
    }

    public float showpar(){
        return 70.2f;
    }

    void personalinfo(){
        System.out.println("name: "+Name);
        System.out.println("Age: "+age);
    }
}

public class interprac {

    public static void main(String[] args) {
        multi obj = new multi();
        System.out.println("Total marks: "+obj.showmarks());
        System.out.println("Show Parcentage: "+obj.showpar());
        obj.personalinfo();
    }
}