interface anima{
    String categore = "Animal";
}

interface behavoiur{
    void legs();
    void color();
}

class dog implements anima, behavoiur{
    void name(){
        System.out.println("categore: "+categore);
    }
    public void legs (){
        System.out.println("4 Legs");
    }
    public void color(){
        System.out.println("Color Black");
    }
}

public class multiinheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.name();
        d.legs();
        d.color();
    }
    
}
