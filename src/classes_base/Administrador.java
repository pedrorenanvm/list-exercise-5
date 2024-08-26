package classes_base;

public class Administrador extends Empregado{
    private double ajudaDeCusto;
    private double salarioCompleto;

    public Administrador(String name, Integer codigoSetor, Double salarioBase, Double imposto, double ajudaDeCusto, double salarioCompleto) {
        super(name, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        this.salarioCompleto = salarioCompleto;
    }

    public Administrador(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, double ajudaDeCusto, double salarioCompleto) {
        super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        this.salarioCompleto = salarioCompleto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}