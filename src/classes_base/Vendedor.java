package classes_base;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(String name, Integer codigoSetor, Double salarioBase, Double imposto, double valorVendas, double comissao) {
        super(name, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, double valorVendas, double comissao) {
        super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario(){
        double valorComisao = valorVendas * comissao / 100;
        return super.calcularSalario() + valorComisao;
    }
}
