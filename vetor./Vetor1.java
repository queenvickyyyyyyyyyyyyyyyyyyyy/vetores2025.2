public class Vetor1 {
    public static void main(String[] args) {
        int[]A = {10, 20, 30, 40, 90};
        int[]B = new int[A.length];

        for(int i = 0; i < A.length; i ++){
            B[i] = A[i];
        }

        System.out.println("\nVetor A: ");
        for(int i = 0; i < A.length; i ++){
            System.out.println("A["+i+"]=" +A[i]);
        }

        System.out.println("\nVetor B: ");
        for(int i = 0; i < A.length; i ++){
            System.out.println("B["+i+"]=" +B[i]);
        }
    }
}
