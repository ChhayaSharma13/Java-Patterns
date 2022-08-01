import java.util.Scanner;

public class LeftPascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int i,j,k,l,m,p;
        for (i=1;i<=n;i++){
            for (j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(l=n+1;l<=2*n-1;l++){
            for (m=1;m<=l-n;m++){
                System.out.print(" ");
            }
            for (p=2*n-l;p>=1;p--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
