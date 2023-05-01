package entidades;

public abstract class Video {
    private String titulo;
    private String diretor;
    private String elenco;
    private String genero;
    private String sinopse;
    private int anoDeLancamento;
    private int classificacaoIndicativa;

    public Video(String titulo, String diretor, String elenco, String genero, String sinopse, int anoDeLancamento, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
        this.anoDeLancamento = anoDeLancamento;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
}
