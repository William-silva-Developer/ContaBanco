import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        ContaTerminal terminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================Abertura de conta bancária=====================");
        System.out.println("Em nossa rede de banco temos disponíveis as agências 123, 456, 789 e 445");;
        System.out.print("Por favor, digite o número da Agência que deseja abrir uma conta: ");
        String agencia = scanner.nextLine();
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, informe o valor que  deseja depositar: ");
        Double deposito = scanner.nextDouble();
        
        int numeroConta = r.nextInt(1000);
        
        
       terminal.setAgencia(agencia);
       terminal.setNomeCliente(nome);
       terminal.setNumeroCnta(numeroConta);
       terminal.setSaldo(deposito);
       
       System.out.println("Olá "+terminal.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+terminal.getAgencia()+", conta "+terminal.getNumeroCnta()+" e seu saldo R$ "+terminal.getSaldo()+" já está disponível para saque");


       System.out.println("==============================Fim==============================================");
        
        scanner.close();
    }
    
    
    
}
