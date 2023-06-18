package Lista_09_java;

public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private String dataDevolucao;

    public LivroBiblioteca(String titulo, String autor, int numPag, int anoPublicacao) {
        super(titulo, autor, numPag, anoPublicacao);
        this.emprestado = false;
        this.dataDevolucao = "";
    }

    public LivroBiblioteca(String titulo, String autor, int numPag, int anoPublicacao, boolean emprestado,
            String dataDevolucao) {
        super(titulo, autor, numPag, anoPublicacao);
        this.emprestado = emprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public LivroBiblioteca(Livro livro) {
        super(livro.getTitulo(), livro.getAutor(), livro.getNumPag(), livro.getAnoPublicacao());
        this.emprestado = false;
        this.dataDevolucao = "";
    }

    public LivroBiblioteca(Livro livro, boolean emprestado, String dataDevolucao) {
        super(livro.getTitulo(), livro.getAutor(), livro.getNumPag(), livro.getAnoPublicacao());
        this.emprestado = emprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAvailable() {
        return !emprestado;
    }

    public void borrow(String dataDevolucao) {
        if (!emprestado) {
            this.emprestado = true;
            this.dataDevolucao = dataDevolucao;
            System.out.println("Livro emprestado com sucesso. Data de devolução: " + dataDevolucao);
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", emprestado: " + emprestado + ", dataDevolucao: '" + dataDevolucao + "'";
    }
}
