import java.util.Scanner;

public class Sandglass {
    public static void main(String[] args) {
        System.out.println("Please enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k,l,m,p;
        for(i=1;i<=n;i++){
            for (j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (k=n-i+1;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (l=n+1;l<=2*n-1;l++){
            for (m=(2*n-1)-l;m>=1;m--){
                System.out.print(" ");
            }
            for (p=1;p<=l-n+1;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
