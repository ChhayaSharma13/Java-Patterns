import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        int i, j , n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        /* outer loop to print rows*/
        for(i=1; i<= n; i++){
            /* print spaces*/
            for(j=(n-i); j>=1; j--) {
                System.out.print(" ");
            }
            /* print star after spaces*/
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            /*break the line after printing spaces and star in a line*/
            System.out.println(" ");
        }
    }
}

