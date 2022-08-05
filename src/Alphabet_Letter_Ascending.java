import java.util.Scanner;

public class Alphabet_Letter_Ascending {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k;
        for (i= 1;i<=n;i++){
            for (j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            char alphabet = 65;
            for (k=1;k<=2*n-1;k++){
                if (k == n-i+1 || k == n+i-1){
                    System.out.print(alphabet+ " ");
                }else {
                    System.out.print(" ");
                }

                alphabet++;
            }
            System.out.println();
        }
    }
}
