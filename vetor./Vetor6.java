import java.util.Scanner;

public class Vetor6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];

        System.out.println("Digite 10 números para o vetor A: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

         System.out.println("Digite 10 números para o vetor B: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
            C[i] = A[i] + B[i];
        }

        System.out.println("\nVetor A: ");
        for(int i = 0; i < A.length; i++){
            System.out.println("A["+i+"]=" +A[i]);
        }

        System.out.println("\nVetor B: ");
        for(int i = 0; i < A.length; i++){
            System.out.println("B["+i+"]=" +B[i]);
        }

        sc.close();
    }
}
