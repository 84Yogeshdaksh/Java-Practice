public class methodoverloading {
    public class maths{
        void sum(int a, int b){
            System.out.println("Sum of a and b is: "+(a+b));
        }
        void sum(int a, int b, int c){
            System.out.println("Sum of a, b and c is: "+(a+b+c));
        }
        void sum(int a, int b, int c, int d){
            System.out.println("Sum of a, b, c and d is: "+(a+b+c+d));
        }
    }
    public static void main(String[] args) {
        methodoverloading outer = new methodoverloading();
        maths obj = outer.new maths();
        obj.sum(2,2,2);
    }
    
}
