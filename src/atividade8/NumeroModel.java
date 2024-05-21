package atividade8;
public class NumeroModel {
    private int[] numeros;

    public NumeroModel() {
        this.numeros = new int[10];
    }

    public void setNumero(int indice, int numero) {
        this.numeros[indice] = numero;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void bubbleSort() {
        int n = numeros.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
    }
}