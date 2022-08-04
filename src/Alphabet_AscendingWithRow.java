import java.util.Scanner;

public class Alphabet_AscendingWithRow {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                /*Typecasting of int into char*/
                char alphabet= (char) (64+i);
                System.out.print(alphabet+" ");
            }
            System.out.println();
        }
    }
}
