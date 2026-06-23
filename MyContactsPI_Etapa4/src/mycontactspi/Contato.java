package mycontactspi;

public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private String categoria;

    public Contato(String nome, String telefone, String email, String categoria) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCategoria() {
        return categoria;
    }
}