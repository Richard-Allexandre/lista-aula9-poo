public class TesteStringPool {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);      // true
        System.out.println(a == c);      // false
        System.out.println(a.equals(c)); // true

        // Por que a == b retorna true?
        // Literais String são armazenados no String Pool (área especial do heap).
        // "Java" já existe no pool, então 'b' aponta para o MESMO objeto que 'a'.
        // O == compara referências (endereços de memória), e as duas são iguais.

        // Por que a == c retorna false?
        // 'new String("Java")' FORÇA a criação de um objeto novo fora do pool.
        // 'c' aponta para um endereço diferente de 'a', então == é false.

        // O que é o String Pool?
        // É uma área de memória onde o Java guarda literais String para reutilização.
        // Quando você escreve "Java" duas vezes, o Java reutiliza o mesmo objeto,
        // economizando memória. Com 'new String()', esse mecanismo é ignorado.

        // REGRA: use sempre .equals() para comparar Strings. Nunca use ==.
    }
}
