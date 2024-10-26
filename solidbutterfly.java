public class solidbutterfly {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int f=0;f<i;f++){
                System.out.print("*");
            }
            for(int s=1;s<=8-2*i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=4;i>=1;i--){
            for(int f=0;f<i;f++){
                System.out.print("*");
            }
            for(int s=1;s<=8-2*i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
