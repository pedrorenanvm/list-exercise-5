package classes_base;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String name) {
        this.nome = name;
    }

    public Pessoa(String name, String endereco, String telefone) {
        this.nome = name;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
