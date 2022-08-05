import java.util.Scanner;

public class Alphabet_ascending {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i, j, k;

        for (i=1;i<=n;i++){
            for (j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            char alphabet = 65;
            for (k=1;k<=i;k++){
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
