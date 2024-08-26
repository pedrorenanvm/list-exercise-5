package classes_teste;

import classes_base.Empregado;

public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Tiago", "Rua Adolfo Caminha", "88999223344", 1, 3000.0, 300.0);
        Empregado empregado1 = new Empregado("Pedro", 1, 1420.12, 142.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());


        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código do Setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário Base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado1.calcularSalario());

    }
}
