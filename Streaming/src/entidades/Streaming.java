package entidades;

import java.util.ArrayList;
import java.util.List;

public class Streaming {
    private List<Filme> filmes;
    private List<Serie> series;
    private List<Usuario> usuarios;
    private List<Acesso> acessos;
    private Acesso acesso;
    private UsuarioPrincipal usuarioPrincipal;

    public Streaming() {
        this.acessos = new ArrayList();
        this.filmes = new ArrayList<>();
        this.series = new ArrayList<>();
        this.usuarios = new ArrayList();
    }

    public void adicionarFilme(String titulo, String diretor, String elenco, String genero, String sinopse, int anoDeLancamento, int classificacaoIndicativa, double tempoDuracao, Adm adm) {
        Filme filme = new Filme(titulo, diretor, elenco, genero, sinopse, anoDeLancamento, classificacaoIndicativa, tempoDuracao);
        this.filmes.add(filme);
        System.out.println("Filme Adicionado!");
    }

    public void adicionarSerie(String titulo, String diretor, String elenco, String genero, String sinopse, int anoDeLancamento, int classificacaoIndicativa, int temporadas, double duracaoEp, Adm adm) {
        Serie serie = new Serie(titulo, diretor, elenco, genero, sinopse, anoDeLancamento, classificacaoIndicativa, temporadas, duracaoEp);
        this.series.add(serie);
        System.out.println("Série Adicionada!");
    }
    public void removerFilme(Filme filme, Adm adm){
        this.filmes.remove(filme);
        System.out.println("Filme removido!");
    }
    public void removerSerie(Serie serie, Adm adm){
        this.series.remove(serie);
        System.out.println("Série removida!");
    }
    public void novaConta(String nome, int idade, double formaPagamento, String email){
        UsuarioPrincipal usuarioPrincipal = new UsuarioPrincipal(nome,idade,formaPagamento,email);
        this.usuarioPrincipal = usuarioPrincipal;
        this.usuarios.add(usuarioPrincipal);
    }
    public void cadastrarUsuario(String nome, int idade, UsuarioPrincipal usuarioPrincipal){
        Usuario usuario = new Usuario(nome,idade);
        this.usuarios.add(usuario);
        System.out.println("Usuário Adicionado!");
    }
    public void removerUsuario(Usuario usuario, UsuarioPrincipal usuarioPrincipal){
        this.usuarios.remove(usuario);
        System.out.println("Usuário removido");
    }
    public void alterarIdade(UsuarioPrincipal usuarioPrincipal, Usuario usuario, int idade){
        usuarioPrincipal.alterarIdade(usuario, idade);
    }
    public void novoAcesso(Usuario usuario){
        for (int i=0; i <= this.usuarios.size(); i++){
            if (this.usuarios.get(i)==usuario){
                Acesso acesso = new Acesso(usuario);
                this.acessos.add(acesso);
                this.acesso = acesso;
            }else{
                System.out.println("Usuário não encontrado!");
            }
        }
    }
    public void novoAcesso(UsuarioPrincipal usuario){
        for (int i=0; i <= this.usuarios.size(); i++){
            if (this.usuarios.get(i)==usuario){
                Acesso acesso = new Acesso(usuario);
                this.acessos.add(acesso);
                this.acesso = acesso;
            }else{
                System.out.println("Usuário não encontrado!");
            }
        }
    }
    public void assistirFilme(Filme filme){
        this.acesso.assistirFilme(filme);
    }
    public void assistirSerie(Serie serie){
        this.acesso.assistirSerie(serie);
    }
    public void acessarFavoritos(Usuario usuario){
        this.acesso.acessarFavoritos(usuario);
    }
    public void adicionarFilmeFavorito(Usuario usuario, Filme filme){
        usuario.adicionarFavorito(filme);
    }
    public void adicionarSerieFavorita(Usuario usuario,Serie serie){
        usuario.adicionarFavorito(serie);
    }
    public List<Filme> getFilmesDisponiveis() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes, Adm adm) {
        this.filmes = filmes;
    }

    public List<Serie> getSeriesDisponiveis() {
        return series;
    }

    public void setSeries(List<Serie> series, Adm adm) {
        this.series = series;
    }

    public List<Usuario> getUsuarios(Adm adm) {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios,Adm adm) {
        this.usuarios = usuarios;
    }

    public List<Acesso> getAcessos(Adm adm) {
        return acessos;
    }

    public void setAcessos(List<Acesso> acessos, Adm adm) {
        this.acessos = acessos;
    }
}
