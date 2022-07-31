import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k,m,l,p;

        for (i = 1; i<=n; i++){
            for (j = (n-i); j>=1; j--){
                System.out.print(" ");
            }
            for (k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (m = n+1; m < 2*n; m++){
            for (l =1; l <=m-n; l++){
                System.out.print(" ");
            }
            for (p=2*n-m; p>=1;p--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
