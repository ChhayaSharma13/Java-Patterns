import java.util.Scanner;

public class DiamondHollow {
    public static void main(String[] args) {
        System.out.println("Please enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for(i=1;i <= n;i++){
            for(j=1;j<=2*n-1;j++) {
                if (j == n - i + 1 || j == n + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(i=n+1;i<=2*n-1;i++){
            for(j=1;j<=2*n-1;j++){
                if(j==i-n+1 || j== 3*n-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
