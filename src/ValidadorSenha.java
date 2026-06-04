public class ValidadorSenha {
    public static void main(String[] args) {

        // --- VERSÃO COM BUG (usando ==) ---
        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        if (tentativa == senhaCorreta) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); // este roda!
        }
        // O acesso é negado pois 'new String("1234')' cria um objeto fora do pool.
        // 'tentativa' aponta para o pool, 'senhaCorreta' aponta para outro endereço.
        // O == compara endereços — diferentes — então entra no else.

        // --- VERSÃO CORRIGIDA (usando equals) ---
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado"); // este roda!
        } else {
            System.out.println("Acesso negado");
        }

        // Risco de usar == com Strings em sistemas reais:
        // Em autenticação, o bug pode deixar usuários válidos sem acesso
        // ou, em casos invertidos, permitir acesso indevido.
        // O comportamento depende de como o objeto foi criado (literal vs new),
        // o que torna o bug imprevisível e difícil de detectar em produção.
    }
}
