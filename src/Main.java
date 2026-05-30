public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);

        System.out.println(p1);
        System.out.println(p2);
        // Saída: algo como Produto@6d06d69c
        // Não é legível — mostra o nome da classe + endereço de memória (hashCode hex)
        // O Java usa o toString() padrão de Object, que retorna NomeClasse@hashCode
    }
}
