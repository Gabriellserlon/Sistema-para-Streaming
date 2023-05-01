package entidades;

import java.util.List;

public class Usuario {
    private String nome;
    private int idade;
    private List<Video> favoritos;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.favoritos = favoritos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public List<Video> getfavoritos(){
        return this.favoritos;
    }
    public void alterarNome(String nome){
        this.nome = nome;
    }
    public void adicionarFavorito(Video video){
        this.favoritos.add(video);
    }
    public void removerFavorito(Video video){
        this.favoritos.remove(video);
    }
}