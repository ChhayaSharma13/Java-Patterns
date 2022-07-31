import java.util.Scanner;

public class DownPyramid {
    public static void main(String[] args) {
        System.out.println("Enter n, please");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k;
        for (i = 1; i<=n;i++){
            for (j=1; j<= i-1; j++){
                System.out.print(" ");
            }
            for (k=2*n-i;k>=n;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
