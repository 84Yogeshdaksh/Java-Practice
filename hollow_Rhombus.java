public class hollow_Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<=n;i++){
            if(i==1 || i==5){
                for(int s = 0; s<n;s++){
                    for(int p=1;p<=i;p++){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println("");
            }
            else{
                for(int s=0;s<n-i;s++){
                    for(int p=0;p<1;p++){
                        System.out.print("*");
                    }
                    for(int IS=1;IS<3;IS++){
                        System.out.print(" ");
                    }
                    for(int OP=0;OP<1;OP++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
