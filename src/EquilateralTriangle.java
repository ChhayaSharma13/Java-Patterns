import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (i = 1;i<n;i++){
            for (j=1;j<=2*n;j++){
                if (j == n-i+1 || j== n+i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k=1;k<=2*n-1;k++){
            System.out.print("*");
        }
    }
}
