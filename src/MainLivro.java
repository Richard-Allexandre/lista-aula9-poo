public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2);     // false
        System.out.println(l1.equals(l2)); // false

        // l1 == l2 é false: são dois objetos distintos na memória.
        // == em objetos compara endereços, não conteúdo.

        // l1.equals(l2) também é false: sem @Override equals(),
        // o Java usa a implementação padrão de Object, que internamente
        // faz o mesmo que ==, ou seja, compara referências.
        // Por isso, mesmo com os mesmos dados, retorna false.
    }
}
