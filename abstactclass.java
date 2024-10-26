public class abstactclass {
    public abstract class marks {
        abstract void start();
        void stop(){
            System.out.println("Car Stop");
        }
    }
    
    public class ManiClass extends marks{
        public void start(){
            System.out.println("Car is running");
        }
    }
    public static void main(String[] args) {
        abstactclass outerobj = new abstactclass();
        ManiClass obj = outerobj.new ManiClass();
        obj.start();
        obj.stop();
    }
    
}
