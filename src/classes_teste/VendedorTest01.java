package classes_teste;

import classes_base.Vendedor;

public class VendedorTest01 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana Costa", "Rua Pedro Bomfin, 202", "889555-7890", 4, 3000.0, 12.0, 50000.0, 10.0);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
