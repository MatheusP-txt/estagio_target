import java.util.Scanner;

public class fibonacci {
    public static void main(){
        int n1 = 0, n2 = 1, n3 = 0, i;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número: ");
        i = scan.nextInt();

        while (i > n3){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (i == n3) {
            System.out.println("O numero " + i + " está na sequencia de fibonacci.");
        } else {
            System.out.println("O numero " + i + " não está na sequencia de fibonacci.");
        }

        scan.close();
    }
}