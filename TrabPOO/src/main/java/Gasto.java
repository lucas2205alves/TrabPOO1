import java.util.Scanner;

public class Gasto {
    private String tipo;
    private String data;
    private String formaDePagamento;
    private double valor;

    public Gasto() {
    }

    public String getTipo() {
        return this.tipo;
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

    public String getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public String toString() {
        return "Gasto: Tipo: " + this.tipo + ", Data do gasto: " + this.data + ", Forma de pagamento: " + this.formaDePagamento + ", Valor: R$" + this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionarGasto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de gasto");
        this.tipo = sc.nextLine();
        System.out.println("Digite a data do gasto, ex: 26-04-2023");
        this.data = sc.nextLine();
        System.out.println("Digite a forma de pagamento");
        this.formaDePagamento = sc.nextLine();
        System.out.println("Digite o valor");
        this.valor = (double)sc.nextInt();
    }
}