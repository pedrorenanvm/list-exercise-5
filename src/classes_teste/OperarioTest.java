package classes_teste;

import classes_base.Operario;

public class OperarioTest {

    public static void main(String[] args) {
        Operario operario = new Operario("José Oliveira", "Rua Diassis Monteiro, 101", "889555-3456", 5, 2500.0, 10.0, 20000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido: " + operario.calcularSalario());

    }
}

