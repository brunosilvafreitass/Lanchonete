
package lanchonete;

public class Produto {

    private String nome;
    private double quantidade;
    private String codigoBarra;
    private double valorCusto;
    private double valorVenda;   
    private Fornecedor fornecedor;
    
    
    public Produto(String nome, double quantidade, String codigoBarra, double valorCusto, double valorVenda, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigoBarra = codigoBarra;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.fornecedor = fornecedor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    
    
    
    
    
   
    
}
