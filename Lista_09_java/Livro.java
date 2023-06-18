package Lista_09_java;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int numPag, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Titulo: '" + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", numPag: " + numPag +
                ", anoPublicacao: " + anoPublicacao;
    }

    public boolean isOlder(Livro antigo) {
        return this.anoPublicacao < antigo.getAnoPublicacao();
    }
}