package atividade8;

public class Main {
    public static void main(String[] args) {
        NumeroModel model = new NumeroModel();
        NumeroView view = new NumeroView();
        NumeroController controller = new NumeroController(model, view);

        controller.solicitarNumeros();
        
        System.out.println("Números antes da ordenação:");
        controller.exibirNumeros();

        controller.ordenarNumeros();

        System.out.println("Números após ordenação:");
        controller.exibirNumeros();
    }
}