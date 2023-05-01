package entidades;

public class UsuarioPrincipal extends Usuario{
    private double FormaPagamento;
    private String email;

    public UsuarioPrincipal(String nome, int idade, double formaPagamento, String email) {
        super(nome, idade);
        this.FormaPagamento = formaPagamento;
        this.email = email;
    }

    public double getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(double formaPagamento) {
        FormaPagamento = formaPagamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void alterarIdade(Usuario usuario, int idade){
        usuario.setIdade(idade);
        System.out.println("Idade Alterada!");
    }
}
