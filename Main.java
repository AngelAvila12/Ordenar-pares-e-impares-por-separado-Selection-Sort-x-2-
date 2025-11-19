import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números N: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingresa " + n + " números enteros:");

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int conteoPares = 0, conteoImpares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                conteoPares++;
            } else {
                conteoImpares++;
            }
        }

        int[] pares = new int[conteoPares];
        int[] impares = new int[conteoImpares];

        int ip = 0, ii = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares[ip++] = numeros[i];
            } else {
                impares[ii++] = numeros[i];
            }
        }

        selectionSort(pares);
        selectionSort(impares);

        System.out.println("\nArreglo original:");
        imprimir(numeros);

        System.out.println("\nPares ordenados:");
        imprimir(pares);

        System.out.println("\nImpares ordenados:");
        imprimir(impares);
    }

    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int aux = arreglo[i];
            arreglo[i] = arreglo[indiceMenor];
            arreglo[indiceMenor] = aux;
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}