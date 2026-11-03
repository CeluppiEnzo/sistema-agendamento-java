import java.util.ArrayList;

public class SistemaChamados {
    ArrayList<Chamado> chamados = new ArrayList<>();
    static int id = 1001;

    public void criarChamado(String descricao, Status status) {
        Chamado chamado = new Chamado(id, descricao, status);
        chamados.add(chamado);
        System.out.println("\nChamado criado com sucesso!");
        System.out.println("ID: " + chamado.getId() + "\n");
        id++;
    }

    public void listarChamados() {
        if (chamados.isEmpty()){
            System.out.println("Nenhum chamado cadastrado! \n");
        } else {
            System.out.println("\n=============================");
            System.out.println("           CHAMADOS");
            System.out.println("=============================\n");
            for (int i = 0; i < chamados.size(); i++){
                System.out.println("------------------------------");
                System.out.println("Chamado: " + (i + 1));
                System.out.println("Descrição: " + chamados.get(i).getDescricao());
                System.out.println("Status: " + chamados.get(i).getStatus());
                System.out.println("ID: " + chamados.get(i).getId());
                System.out.println("------------------------------\n");
            }
        }
    }

    public void consultarChamado(int id) {
        boolean encontrou = false;
        for (int i = 0; i < chamados.size(); i++){
            if (id == chamados.get(i).getId()){
                System.out.println("------------------------------");
                System.out.println("ID: " + chamados.get(i).getId());
                System.out.println("Descrição: " + chamados.get(i).getDescricao());
                System.out.println("Status: " + chamados.get(i).getStatus());
                System.out.println("------------------------------\n");
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("\nChamado não encontrado! \n");
        }
    }

    public boolean confirmouStatus(int id) {
        boolean encontrou = false;
        for (int i = 0; i < chamados.size(); i++){
            if (id == chamados.get(i).getId()){
                System.out.print("Status atual: " + chamados.get(i).getStatus() + "\n");
                encontrou = true;
            }
        }
        if (!encontrou){
            return false;
        } else {
            return true;
        }
    }

    public void alterarStatus(int id, int novoStatus) {
        for (int i = 0; i < chamados.size(); i++){
            if (id == chamados.get(i).getId()){
                if (novoStatus >=1 && novoStatus <= 3){
                    if (novoStatus == 1){
                        chamados.get(i).setStatus(Status.ABERTO);
                    } else if (novoStatus == 2) {
                        chamados.get(i).setStatus(Status.EM_ANDAMENTO);
                    } else {
                        chamados.get(i).setStatus(Status.ENCERRADO);
                    }
                }
                System.out.println("Chamado ALTERADO: ");
                System.out.println("------------------------------");
                System.out.println("ID: " + chamados.get(i).getId());
                System.out.println("Descrição: " + chamados.get(i).getDescricao());
                System.out.println("Status: " + chamados.get(i).getStatus());
                System.out.println("------------------------------\n");
            }
        }
    }

    public void encerrarChamado(int id, Status novoStatus) {
        for (int i = 0; i < chamados.size(); i++){
            if (id == chamados.get(i).getId()){
                chamados.get(i).setStatus(Status.ENCERRADO);
                System.out.println("Chamado ALTERADO: ");
                System.out.println("------------------------------");
                System.out.println("ID: " + chamados.get(i).getId());
                System.out.println("Descrição: " + chamados.get(i).getDescricao());
                System.out.println("Status: " + chamados.get(i).getStatus());
                System.out.println("------------------------------\n");
            }
        }

    }

    public void listarStatus() {
        boolean encontrou = false;
        if (chamados.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado!\n");
        } else {
            System.out.println("\n=============================");
            System.out.println("       CHAMADOS ABERTOS");
            System.out.println("=============================\n");
            for (int i = 0; i < chamados.size(); i++) {
                if (chamados.get(i).getStatus() == Status.ABERTO) {
                    System.out.println("------------------------------");
                    System.out.println("Chamado: " + (i + 1));
                    System.out.println("Descrição: " + chamados.get(i).getDescricao());
                    System.out.println("Status: " + chamados.get(i).getStatus());
                    System.out.println("ID: " + chamados.get(i).getId());
                    System.out.println("------------------------------\n");
                    encontrou = true;
                }
            }
            if (!encontrou){
                System.out.println("Nenhum chamado ABERTO cadastrado!\n");
            }

            encontrou = false;
            System.out.println("\n=============================");
            System.out.println("     CHAMADOS EM ANDAMENTO");
            System.out.println("=============================\n");
            for (int i = 0; i < chamados.size(); i++) {
                if (chamados.get(i).getStatus() == Status.EM_ANDAMENTO) {
                    System.out.println("------------------------------");
                    System.out.println("Chamado: " + (i + 1));
                    System.out.println("Descrição: " + chamados.get(i).getDescricao());
                    System.out.println("Status: " + chamados.get(i).getStatus());
                    System.out.println("ID: " + chamados.get(i).getId());
                    System.out.println("------------------------------\n");
                    encontrou = true;
                }
            }
            if (!encontrou){
                System.out.println("Nenhum chamado EM ANDAMENTO cadastrado!");
            }

            encontrou = false;
            System.out.println("\n=============================");
            System.out.println("      CHAMADOS ENCERRADOS");
            System.out.println("=============================\n");
            for (int i = 0; i < chamados.size(); i++) {
                if (chamados.get(i).getStatus() == Status.ENCERRADO) {
                    System.out.println("------------------------------");
                    System.out.println("Chamado: " + (i + 1));
                    System.out.println("Descrição: " + chamados.get(i).getDescricao());
                    System.out.println("Status: " + chamados.get(i).getStatus());
                    System.out.println("ID: " + chamados.get(i).getId());
                    System.out.println("------------------------------\n");
                    encontrou = true;
                }
                if (!encontrou){
                    System.out.println("Nenhum chamado ENCERRADO cadastrado!");
                }
            }
        }

    }
}
