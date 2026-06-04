public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Outro Título", "978-0132350884");
        Livro l3 = new Livro("Clean Code", "978-9999999999");

        System.out.println(l1.hashCode()); // mesmo valor que l2
        System.out.println(l2.hashCode()); // mesmo valor que l1 — mesmo ISBN
        System.out.println(l3.hashCode()); // valor diferente — ISBN diferente

        System.out.println(l1.hashCode() == l2.hashCode()); // true
        System.out.println(l1.hashCode() == l3.hashCode()); // false (na prática)
    }
}