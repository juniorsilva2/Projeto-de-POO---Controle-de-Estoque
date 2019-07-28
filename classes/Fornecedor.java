public class Fornecedor {
    
    private String nomeFornercedor;
    private String produto;
    private int codProduto;

    public Fornecedor(String nomeFornercedor, String produto, int codProduto) {
        this.nomeFornercedor = nomeFornercedor;
        this.produto = produto;
        this.codProduto = codProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornercedor;
    }

    public String getProduto() {
        return produto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setNomeFornecedor(String nomeFornercedor) {
        this.nomeFornercedor = nomeFornercedor;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    
}
