import java.util.Scanner;

public class Numbered_BinaryTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                if(j%2 != 0){
                    System.out.print(1+" ");
                }else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
