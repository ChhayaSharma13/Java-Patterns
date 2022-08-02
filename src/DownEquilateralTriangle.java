import java.util.Scanner;

public class DownEquilateralTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (int x =1; x<= 2*n-1; x++){
            System.out.print("*");
        }
        System.out.println();
        for(i = 2;i<=n;i++){
            for (j=1;j<=2*n;j++){
                if (j == i || j == (2*n)-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
