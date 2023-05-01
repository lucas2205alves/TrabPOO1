import java.util.Scanner;

public class Ganho {
    private String tipo;
    private String data;
    private double valor;

    public Ganho() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public String toString() {
        return "Ganho: Tipo: " + this.tipo + ", Data do ganho: " + this.data + ", Valor: R$" + this.valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionarGanho() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de ganho");
        this.tipo = sc.nextLine();
        System.out.println("Digite a data do ganho, ex: 26-04-2023");
        this.data = sc.nextLine();
        System.out.println("Digite o valor");
        this.valor = (double)sc.nextInt();
    }
}

