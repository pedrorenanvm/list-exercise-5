package classes_teste;

import classes_base.Administrador;

public class AdministradorTest {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Carlos Pereira", "Rua C, 789", "555-9012", 102, 5000.0, 20.0,500.0, 1000.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}
