import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int valorGastos = 0;
        int valorGanhos = 0;

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        Gasto[] gasto = new Gasto[100];
        Ganho[] ganho = new Ganho[100];
        Relatorio r = new Relatorio();
        boolean terminou = false;
        while  (terminou == false){
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Adicionar gasto");
            System.out.println("2 - Adicionar ganho");
            System.out.println("3 - Visualizar relatórios de gastos");
            System.out.println("4 - Visualizar relatórios de ganhos");
            System.out.println("5 - Visualizar relatório mensal (ganhos - gastos)");
            System.out.println("6 - Sair");
            int escolha = 0;
            escolha = sc.nextInt();
            if(escolha == 1){
                gasto[valorGastos] = new Gasto();
                gasto[valorGastos].adicionarGasto();
                System.out.println(gasto[valorGastos]);
                valorGastos = valorGastos + 1;
            }

            if(escolha == 2){
                ganho[valorGanhos] = new Ganho();
                ganho[valorGanhos].adicionarGanho();
                System.out.println(ganho[valorGanhos]);
                valorGanhos = valorGanhos + 1;
            }

            if(escolha == 3){
                System.out.println("==============================");
                r.relatorioGastos(valorGastos, gasto);
                System.out.println("==============================");
                System.out.println("Finalizado relatório de gastos");
            }

            if(escolha == 4){
                System.out.println("==============================");
                r.relatorioGanhos(valorGanhos, ganho);
                System.out.println("==============================");
                System.out.println("Finalizado relatório de ganhos");
            }

            if(escolha == 5){
                r.relatorioMensal(valorGastos, valorGanhos, gasto, ganho);
            }

            if(escolha == 6){
                System.out.println("Finalizando programa....");
                terminou = true;
            }

        }

    }
}

