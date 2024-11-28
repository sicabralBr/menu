import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
        m.processar();
    }

    public void menu(){
        System.out.println("--------------");
        System.out.println("MENU DE OPÇÕES: \n");

        System.out.println("1- Opção 1");
        System.out.println("2- Opção 2");
        System.out.println("3- Sair");
    }

    public void processar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção desejada:");
        int opcao = scanner.nextInt();

        while ((opcao <= 0) || (opcao > 3)){
            System.out.println("Você digitou uma opção inválida!! Digite novamente: ");
            opcao = scanner.nextInt();
        }
            switch (opcao){
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    menu();
                    processar();
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção");
                    menu();
                    processar();
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    break;
            }
    }
}