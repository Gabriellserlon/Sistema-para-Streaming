package entidades;

public class Serie extends Video{
    private int temporadas;
    private double duracaoEp;

    public Serie(String titulo, String diretor, String elenco, String genero, String sinopse, int anoDeLancamento, int classificacaoIndicativa, int temporadas, double duracaoEp) {
        super(titulo, diretor, elenco, genero, sinopse, anoDeLancamento, classificacaoIndicativa);
        this.temporadas = temporadas;
        this.duracaoEp = duracaoEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public double getDuracaoEp() {
        return duracaoEp;
    }

    public void setDuracaoEp(double duracaoEp) {
        this.duracaoEp = duracaoEp;
    }
}
