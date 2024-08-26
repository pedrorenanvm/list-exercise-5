package classes_teste;

import classes_base.Fornecedor;

public class FornecedorTest {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Tiago", "Rua Adolfo Caminha", "88999223344", 7000.0, 3000.0);
        Fornecedor fornecedor1 = new Fornecedor("Pedro", 2500.0, 1400.0);


        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor1.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor1.getValorDivida());
        System.out.println("Saldo: " + fornecedor1.obterSaldo());
    }
}