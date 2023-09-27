import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor padrão
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

        System.out.println("Digite um número entre 1 e 100: ");
        int entrada = scanner.nextInt();

        //numeros repetidos ainda ñ sei como resolver
        for (int i = 0; i < array.length; i = 1 + i) {
            array[i] = random.nextInt(1, 101);
            System.out.println("Números aleatórios: " + array[i]);
        }

        boolean encontrado = false;

        for (int numero : array) {
            if(entrada == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Rolou");
        } else {
            System.out.println("Não rolou");
        }

        scanner.close();
    }
}
