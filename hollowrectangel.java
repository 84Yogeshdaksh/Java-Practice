public class hollowrectangel {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            if(i==1 || i==5){
                for (int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
                for(int s=0;s<n-2;s++){
                    System.out.print(" ");
                }
                for(int l=0;l<1;l++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
