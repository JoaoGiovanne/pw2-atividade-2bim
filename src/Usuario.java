import java.time.LocalDate;

public class Usuario {

    private int codigo;
    private String nome;
    private String senha;
    private int tentativasDeAcesso;
    private boolean primeiroAcesso;
    private LocalDate dataDeInativação;
    private StatusUsuarioEnum status;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getTentativasDeAcesso() {
        return tentativasDeAcesso;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public LocalDate getDataDeInativação() {
        return dataDeInativação;
    }

    public StatusUsuarioEnum getStatus() {
        return status;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;
        this.tentativasDeAcesso = 0;

    }

    public boolean setTentativasDeAcesso(String senha) {

        if (this.senha != senha){
            System.out.println("Acesso Negado");
            this.status = StatusUsuarioEnum.BLOQUEADO;
            return true;
        }
        else {
            System.out.println("Acesso Liberado");
        }
        return false;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        if (primeiroAcesso) {
            this.primeiroAcesso = false;
        }
    }

    public void setDataDeInativação(LocalDate dataDeInativação) {
        this.dataDeInativação = dataDeInativação;
    }

    public void setStatus(StatusUsuarioEnum status) {
        this.status = status;
    }

    public Usuario() {
        this.senha = "etec#123";
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;
    }

    public void inativar(){
        LocalDate.now();
        this.primeiroAcesso = false;
        this.status = StatusUsuarioEnum.INATIVO;
    }

    public void exibir(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Usuario: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Trocar senha: " + primeiroAcesso);
        System.out.println("Status: " + status);
    }
    public void autenticar(String senha){
        if (status == StatusUsuarioEnum.INATIVO || status == StatusUsuarioEnum.BLOQUEADO){
            System.out.println("Acesso Negado");
        }
    }
}

