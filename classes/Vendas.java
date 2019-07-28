import java.time.LocalDate;

public class Vendas {
    
    private final int id;
    private static int contProdutos;
    private String Fornercedor;
    private LocalDate dataVenda;
    private String Produto;
    private float precoUND;
    private int quant;
    private float valorTotal;

    public Vendas(String Fornercedor, LocalDate dataVenda, String Produto, float precoUND, int quant, float valorTotal) {
        this.Fornercedor = Fornercedor;
        this.dataVenda = dataVenda;
        this.Produto = Produto;
        this.precoUND = precoUND;
        this.quant = quant;
        this.valorTotal = valorTotal;
        id = ++contProdutos;
    }

    public int getId() {
        return id;
    }

    public String getFornercedor() {
        return Fornercedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public String getProduto() {
        return Produto;
    }

    public float getPrecoUND() {
        return precoUND;
    }

    public int getQuant() {
        return quant;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setFornercedor(String Fornercedor) {
        this.Fornercedor = Fornercedor;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public void setPrecoUND(float precoUND) {
        this.precoUND = precoUND;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}