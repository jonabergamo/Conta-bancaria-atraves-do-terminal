import java.util.Scanner;
import java.util.ArrayList;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agency = in.nextLine();
        System.out.println("Agora, digite o seu nome completo !");
        String name = in.nextLine();
        System.out.println("Agora, digite o valor que você deseja inserir !");
        String moneyBalance = in.nextLine();
        int number = 1024;

        System.out.println("Olá "+ name + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agency +", conta "+ number +" e seu saldo de R$"+ moneyBalance +" já está disponível para saque!");
    }
}
