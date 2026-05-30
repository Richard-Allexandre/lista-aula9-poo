public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);

        System.out.println(p1);
        // Saída: Produto{nome='Caneta', preco=2.5}
        // Agora é legível!

        System.out.println(p2);
        // Saída: Produto{nome='Caderno', preco=15.9}

        String texto = "Item: " + p1;
        System.out.println(texto);
        // Saída: Item: Produto{nome='Caneta', preco=2.5}
        // Sim! toString() é chamado automaticamente na concatenação com +
        // Também é chamado automaticamente em println() e no debugger
    }
}
