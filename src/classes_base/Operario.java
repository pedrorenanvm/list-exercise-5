package classes_base;
public class Operario  extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(String name, Integer codigoSetor, Double salarioBase, Double imposto, double valorProduccao, double comissao) {
        super(name, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProduccao;
        this.comissao = comissao;
    }

    public Operario(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, double valorProduccao, double comissao) {
        super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProduccao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComissao = valorProducao * comissao / 100;
        return super.calcularSalario() + salarioComissao;
    }
}