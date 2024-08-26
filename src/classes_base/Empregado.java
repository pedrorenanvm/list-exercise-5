package classes_base;

public class Empregado extends Pessoa{
    private Integer codigoSetor;
    private Double salarioBase;
    private Double imposto;

    public Empregado(String name, Integer codigoSetor, Double salarioBase, Double imposto) {
        super(name);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto) {
        super(name, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return salarioBase - (salarioBase * imposto / 100);
    }

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
}
