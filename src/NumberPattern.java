import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;

        // print rows
        for (i=1;i<=n;i++){
            /*increase j up to i and print*/
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
