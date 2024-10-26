class value{
    int n =10;
    void showvalue(){
        System.out.println("vlaue of n is: "+n);
    }
}
class values extends value{
    float f = n;
    void showvalue(){
        System.out.println("Value of n is: "+f);
    }
}


public class typecasting {
    public static void main(String[] args) {
   value obj = new value();
   values obj2 = new values();
    obj.showvalue();
    obj2.showvalue();
    
    }
    

    
}
