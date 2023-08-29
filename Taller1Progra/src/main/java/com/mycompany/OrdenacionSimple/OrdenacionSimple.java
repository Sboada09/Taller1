package com.mycompany.OrdenacionSimple;

public class OrdenacionSimple {

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3, 6};
        Ordenacion(numeros);
        System.out.println("Lista ordenada:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void Ordenacion(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            int listanum = i;

            
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[listanum]) {
                    listanum = j;
                }
            }

            
            int temp = numeros[i];
            numeros[i] = numeros[listanum];
            numeros[listanum] = temp;
        }
    }
}
