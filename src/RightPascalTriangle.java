import java.util.Scanner;

public class RightPascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n, please");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k,l;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(k = n+1; k<=2*n-1;k++){
            for(l=2*n-k;l>=1;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
