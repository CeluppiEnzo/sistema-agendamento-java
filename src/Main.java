import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaChamados sistemaChamados = new SistemaChamados();
        int opcao = 0;

        while (opcao != 7){
            System.out.println("====================");
            System.out.println("SISTEMA DE CHAMADOS");
            System.out.println("====================");
            System.out.println("1 - Criar chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Consultar um chamado");
            System.out.println("4 - Alterar status do chamado");
            System.out.println("5 - Encerrar chamado");
            System.out.println("6 - Listar chamados por status");
            System.out.println("7 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Qual a descrição do chamado? ");
                String descricao = scanner.nextLine();
                Status status = Status.ABERTO;
                sistemaChamados.criarChamado(descricao, status);
            } else if (opcao == 2) {
                sistemaChamados.listarChamados();
            } else if (opcao == 3) {
                System.out.println("Digite o ID do chamado: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                sistemaChamados.consultarChamado(id);
            } else if (opcao == 4) {
                System.out.println("Digite o ID do chamado que deseja alterar o status: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                if (sistemaChamados.confirmouStatus(id)){
                    System.out.println("Selecione o novo status do chamado:\n");
                    System.out.println("--------------------------");
                    System.out.println("1 - ABERTO");
                    System.out.println("2 - EM ANDAMENTO");
                    System.out.println("3 - ENCERRADO");
                    System.out.println("--------------------------\n");
                    int novoStatus = scanner.nextInt();
                    scanner.nextLine();
                    sistemaChamados.alterarStatus(id, novoStatus);
                } else {
                    System.out.println("\nChamado não encontrado! \n");
                }
            } else if (opcao == 5) {
                System.out.println("Digite o ID do chamado que deseja encerrar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                if (sistemaChamados.confirmouStatus(id)){
                    Status novoStatus = Status.ENCERRADO;
                    sistemaChamados.encerrarChamado(id, novoStatus);
                } else {
                    System.out.println("\nChamado não encontrado! \n");
                }

            } else if (opcao == 6) {
                sistemaChamados.listarStatus();
            } else if (opcao == 7) {
                System.out.println("Encerrando... ");
            } else {
                System.out.println("Escolha uma opção válida: \n");
            }
        }
    }
}