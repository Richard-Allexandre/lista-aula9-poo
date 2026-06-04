import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(isbn); // mesmo campo usado no equals
    }
    // Contrato Java: se a.equals(b) == true, então a.hashCode() == b.hashCode() DEVE ser true.
    // Usar o mesmo campo garante que objetos iguais gerem o mesmo hash.
}