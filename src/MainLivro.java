public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Livro Diferente", "978-0132350884");
        Livro l3 = new Livro("Clean Code", "978-9999999999");

        System.out.println(l1.equals(l2)); // true — mesmo ISBN, títulos diferentes
        System.out.println(l1.equals(l3)); // false — ISBNs diferentes

        // Testando com null — não lança exceção:
        System.out.println(l1.equals(null)); // false (instanceof retorna false para null)

        // Testando com String — não lança exceção:
        System.out.println(l1.equals("978-0132350884")); // false (não é instância de Livro)
    }
}