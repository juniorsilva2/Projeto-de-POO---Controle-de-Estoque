public class Loja {
    
    private String nomeLoja;
    private String proprietario;
    private int telefone;
    private String ramo;

    public Loja(String nomeLoja, String proprietario, int telefone, String ramo) {
        this.nomeLoja = nomeLoja;
        this.proprietario = proprietario;
        this.telefone = telefone;
        this.ramo = ramo;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public String getProprietario() {
        return proprietario;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getRamo() {
        return ramo;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}