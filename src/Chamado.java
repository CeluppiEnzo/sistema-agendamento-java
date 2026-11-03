public class Chamado {
    private int id;
    private String descricao;
    private Status status;

    public Chamado(int id, String descricao, Status status){
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
