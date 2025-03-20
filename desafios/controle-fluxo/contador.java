import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimindo a mensagem de erro, caso os parâmetros sejam inválidos
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Diferença entre o segundo e o primeiro parâmetro
        int contagem = parametroDois - parametroUm;

        // Realizar o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}