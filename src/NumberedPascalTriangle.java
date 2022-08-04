   import java.util.Scanner;

public class NumberedPascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j, k, temp=1;
        for (i=1;i<=n;i++){
            for (j=n-i+1;j>=1;j--){
                System.out.print(" ");
            }

        }
    }
}
