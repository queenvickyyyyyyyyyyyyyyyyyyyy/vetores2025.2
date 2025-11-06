import java.util.Scanner;

public class Vetor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        int soma = 0;

        System.out.println("Digite 10 números:");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
            soma += A[i];
        }

        System.out.println("\nSoma dos elementos do vetor A: "+soma);

        sc.close();
    }
}
