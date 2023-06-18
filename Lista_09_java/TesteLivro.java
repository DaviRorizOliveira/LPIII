package Lista_09_java;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Silmarillion", "J.R.R. Tolkien", 480, 1977);
        Livro livro2 = new Livro("Moby Dick", "Herman Melville", 648, 1851);
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 1605);
        Livro livro4 = new Livro("1984", "George Orwell", 328, 1949);

        // Testes com Livro
        LivroBiblioteca livro5 = new LivroBiblioteca(livro1);
        LivroBiblioteca livro6 = new LivroBiblioteca(livro2, true, "14/07/2023");

        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());
        System.out.println(livro4.toString());

        System.out.println("O livro 1 é mais antigo que o livro 2? " + livro1.isOlder(livro2));
        System.out.println("O livro 2 é mais antigo que o livro 3? " + livro3.isOlder(livro4));

        // Testes com LivroBiblioteca
        System.out.println(livro5.toString());
        System.out.println(livro6.toString());

        boolean isAvailable = livro5.isAvailable();
        System.out.println("Disponível: " + isAvailable);

        livro5.borrow("29/07/2023");
        System.out.println(livro5.toString());

        isAvailable = livro5.isAvailable();
        System.out.println("Disponível: " + isAvailable);
    }
}