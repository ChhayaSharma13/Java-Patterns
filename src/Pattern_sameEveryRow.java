import java.util.Scanner;

public class Pattern_sameEveryRow {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                if(i<=9) {
                    System.out.print(i + "   ");
                }else if (i<=99){
                    System.out.print(i+"  ");
                }
            }
            System.out.println();
        }
    }
}
