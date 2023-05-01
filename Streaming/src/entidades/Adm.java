package entidades;

public class Adm extends Usuario {
    private String cpf;
    private String email;

    public Adm(String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.email = email;
    }
}
