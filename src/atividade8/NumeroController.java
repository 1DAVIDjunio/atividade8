package atividade8;

import java.util.Scanner;

public class NumeroController {
    private NumeroModel model;
    private NumeroView view;

    public NumeroController(NumeroModel model, NumeroView view) {
        this.model = model;
        this.view = view;
    }

    public void setNumero(int indice, int numero) {
        model.setNumero(indice, numero);
    }

    public void solicitarNumeros() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            setNumero(i, numero);
        }
        scanner.close();
    }

    public void ordenarNumeros() {
        model.bubbleSort();
    }

    public void exibirNumeros() {
        int[] numerosOrdenados = model.getNumeros();
        view.exibirNumeros(numerosOrdenados);
    }
}