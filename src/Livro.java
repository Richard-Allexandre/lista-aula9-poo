public class Livro {
    String titulo;
    String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livro)) return false;
        Livro outro = (Livro) obj;
        return this.isbn.equals(outro.isbn);
    }

    // Por que comparamos pelo ISBN e não pelo título?
    // ISBN é um identificador único e universal de cada edição de livro.
    // Títulos podem se repetir (dois livros diferentes com o mesmo nome).
    // Usar ISBN garante que a igualdade reflita identidade real do exemplar,
    // não uma coincidência de nome.
}