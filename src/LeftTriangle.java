import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        int i, j , n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        for(i=1; i<= n; i++){
            for(j=(n-i); j>=1; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

