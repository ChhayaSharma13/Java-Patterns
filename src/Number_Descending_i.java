import java.util.Scanner;

public class Number_Descending_i {
    public static void main(String[] args) {
        System.out.print("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=i;j>=1;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
