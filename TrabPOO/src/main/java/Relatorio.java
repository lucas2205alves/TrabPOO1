public class Relatorio {

    public void relatorioGastos(int valorGastos, Gasto[] gasto){
        for(int i = 0; i < valorGastos; i++){
            System.out.println(gasto[i]);
        }
    }

    public void relatorioGanhos(int valorGanhos, Ganho[] ganho){
        for(int i = 0; i < valorGanhos; i++){
            System.out.println(ganho[i]);
        }
    }

    public void relatorioMensal(int valorGastos, int valorGanhos, Gasto [] gasto, Ganho[] ganho){
        double somaGastos = 0;
        double somaGanhos = 0;
        for(int i = 0; i < valorGastos; i++){
            double a = gasto[i].getValor();
            somaGastos = somaGastos + a;
        }
        for(int i = 0; i < valorGanhos; i++){
            double b = ganho[i].getValor();
            somaGanhos = somaGanhos + b;
        }
        System.out.println("Seu valor de gastos foi: R$" + somaGastos);
        System.out.println("Seu valor de ganhos foi: R$" + somaGanhos);
        double total = somaGanhos - somaGastos;
        System.out.println("O seu ganhos - gastos R$" + total);

    }
}
