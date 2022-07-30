import java.util.Scanner;

public class PyramidTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k;
        for(i = 1; i<=n;i++){
            for(j = (n-i); j >=1; j--){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
