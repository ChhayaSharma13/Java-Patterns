import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        int i, j=1 , n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            for(j=1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
