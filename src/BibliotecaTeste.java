import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {

        HashSet<Livro> biblioteca = new HashSet<>();
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        // --- RODADA A: com equals() e hashCode() implementados ---
        System.out.println(biblioteca.size()); // 1
        // l1 e l2 têm o mesmo hashCode (mesmo ISBN) e equals() retorna true.
        // O HashSet detecta duplicata e não insere o segundo.

        // --- RODADA B: comente o hashCode() em Livro.java e execute de novo ---
        // System.out.println(biblioteca.size()); // 2
        // Sem hashCode(), cada objeto gera um hash diferente (padrão de Object,
        // baseado no endereço de memória). O HashSet os coloca em "baldes" distintos
        // e nunca chega a chamar equals(). Resultado: duplicata não detectada.

        // Como o HashSet detecta duplicatas internamente?
        // 1. Calcula hashCode() do novo elemento para achar o "balde" (bucket).
        // 2. Se o balde tiver elementos, chama equals() para comparar com cada um.
        // 3. Se equals() retornar true, o elemento é considerado duplicata e ignorado.
        // Por isso, sobrescrever equals() SEM sobrescrever hashCode() quebra o Set.
    }
}