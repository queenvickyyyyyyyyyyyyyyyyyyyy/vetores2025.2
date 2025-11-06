import java.util.Scanner;

public class Vetor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int pares = 0;

        System.out.println("Digite 10 números: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0){
                    pares++;
                }
            }

        System.out.println("Números pares: " + pares++);

        sc.close();
        
    } 
}
