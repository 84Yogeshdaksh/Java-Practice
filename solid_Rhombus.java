public class solid_Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
