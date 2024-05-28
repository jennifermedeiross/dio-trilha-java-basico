import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        double saldo;
        String agencia, nomeCliente;

        Scanner Scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Por favor, digite o número da Conta !");
        numero = Scan.nextInt();
        Scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = Scan.nextLine();

        System.out.println("Por favor, digite seu Nome !");
        nomeCliente = Scan.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        saldo = Scan.nextDouble();

        System.out.println("Olá " + nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        Scan.close();
    }
}
