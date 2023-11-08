public class Aplicativo {
    public static void main(String[] args) {
        int cpf = 11412817676; // Substitua pelo CPF que você deseja validar (como um número inteiro)

        if (validarCPF(cpf)) {
            System.out.println(cpf + " é um CPF válido.");
        } else {
            System.out.println(cpf + " é um CPF inválido.");
        }
    }

    public static boolean validarCPF(int CPF) {
        String cpfStr = String.format("%011d", CPF); // Formata o CPF como uma string com zeros à esquerda

        // Verifica se o CPF possui 11 dígitos
        if (cpfStr.length() != 11) {
            return false;
        }

        // Considera-se erro CPF's formados por uma sequência de números iguais
        if (cpfStr.matches("(\\d)\\1{10}")) {
            return false;
        }

        int digito1 = calcularDigitoVerificador(cpfStr.substring(0, 9));
        int digito2 = calcularDigitoVerificador(cpfStr.substring(0, 10));

        return cpfStr.charAt(9) - '0' == digito1 && cpfStr.charAt(10) - '0' == digito2;
    }

    private static int calcularDigitoVerificador(String parteCPF) {
        int total = 0;
        int peso = parteCPF.length() + 1;
        for (char digito : parteCPF.toCharArray()) {
            total += (digito - '0') * peso;
            peso--;
        }

        int resto = total % 11;
        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }
}