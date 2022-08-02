import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
