package entidades;

public class Filme extends Video {
    private double tempoDuracao;

    public Filme(String titulo, String diretor, String elenco, String genero, String sinopse, int anoDeLancamento, int classificacaoIndicativa, double TempoDuracao) {
        super(titulo, diretor, elenco, genero, sinopse, anoDeLancamento, classificacaoIndicativa);
        this.tempoDuracao = tempoDuracao;
    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}