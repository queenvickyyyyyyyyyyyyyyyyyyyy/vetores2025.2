import java.util.Scanner;

public class Vetor9 {
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
            B[i] = sc.nextInt();
            C[i] = A[i] /(B[i]);
        }

        System.out.println("\nVetor c: ");
        for(int i = 0; i < A.length; i++){
            System.out.println("C["+i+"]=" +C[i]);
        }

        sc.close();
    }
}