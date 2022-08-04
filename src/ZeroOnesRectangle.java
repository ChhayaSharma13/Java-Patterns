import java.util.Scanner;

public class ZeroOnesRectangle {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if(i % 2 != 0){
                    System.out.print("1 ");
                    System.out.print("0 ");
                }
                else {
                    System.out.print("0 ");
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
