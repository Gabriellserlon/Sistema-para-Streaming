package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acesso {
    private Usuario usuario;
    private Filme filme;
    private Serie serie;
    private List<String> historico;

    public Acesso(Usuario usuario){
        this.usuario = usuario;
        this.filme = filme;
        this.serie = serie;
        this.historico = new ArrayList();
    }
    public Acesso(UsuarioPrincipal usuario){
        this.usuario = usuario;
        this.filme = filme;
        this.serie = serie;
        this.historico = new ArrayList<>();
    }
    public void assistirFilme(Filme filme){
        if (this.usuario.getIdade() >= filme.getClassificacaoIndicativa()){
            System.out.println("Filme iniciado!");
            this.historico.add("Filme assistido: "+filme);
        }else{
            System.out.println("Classificação indicativa não permitida para este usuário");
        }
    }
    public void assistirSerie(Serie serie){
        if (this.usuario.getIdade() >= serie.getClassificacaoIndicativa()){
            System.out.println("Série iniciada!");
            this.historico.add("Série assistida: "+serie);
        }else{
            System.out.println("Classificação indicativa não permitida para este usuário");
        }
    }
    public void acessarFavoritos(Usuario usuario){
        System.out.println("Lista de Favoritos: "+usuario.getfavoritos());
    }
}
