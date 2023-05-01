package app;

import entidades.Streaming;
import entidades.Usuario;

public class App {
    public static void main(String[] args) {
        Streaming streaming = new Streaming();
        Usuario u1 = new Usuario("Gabriell", 20);
        streaming.novoAcesso(u1);
    }
}
