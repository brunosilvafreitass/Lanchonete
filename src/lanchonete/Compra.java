
package lanchonete;

import java.util.ArrayList;
import java.util.Calendar;


public class Compra {

    private Cliente cliente;
    private Funcionario funcionario;
    private int numeroCompra;
    private Calendar dataCompra;

    private ArrayList<ItemCompra> Itens;
    private double valorTotalCompra;

    public Compra(Cliente cliente,
            Funcionario funcionario,
            int numeroCompra,
            Calendar dataCompra
    ) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
    }

    //ADICIONAR ITEM NA COMPRA
    public void adicionarItemCompra(ItemCompra item) {
       if (this.Itens == null) {
            this.Itens = new ArrayList<ItemCompra>();
        }
        this.valorTotalCompra += item.getSubTotal();
        this.Itens.add(item);
    }
    
    public void imprimirCupomFiscalCPF() {
    	System.out.println("Compra: " + this.numeroCompra);
        System.out.println("Cliente: " + this.cliente.getNomeCompleto());
        System.out.println("CPF: " + this.cliente.getDocumento());        
        System.out.println("Funcionario: " + this.funcionario.getNomeCompleto());
        System.out.println("Data Compra: " + this.dataCompra.getTime());
        

        for (ItemCompra item : this.Itens) {

            System.out.println("----------------------------------");
            System.out.println("Produto: " + item.getProduto().getNome());
            System.out.println("Quantidade: " + item.getQtd());
            System.out.println("Valor: " + item.getValorProduto());
            System.out.println("SubTotal: " + item.getSubTotal());
        }

        System.out.println("----------------------------------");
        System.out.println("Total Gera1l da Compra: " + this.valorTotalCompra);
        System.out.println("----------------------------------");

    }

    public void imprimirCupomFiscal() {
        System.out.println("Compra: " + this.numeroCompra);
        System.out.println("Cliente: " + this.cliente.getNomeCompleto());
        System.out.println("Funcionario: " + this.funcionario.getNomeCompleto());
        System.out.println("Data Compra: " + this.dataCompra.getTime());
        

        for (ItemCompra item : this.Itens) {

            System.out.println("----------------------------------");
            System.out.println("Produto: " + item.getProduto().getNome());
            System.out.println("Quantidade: " + item.getQtd());
            System.out.println("Valor: " + item.getValorProduto());
            System.out.println("SubTotal: " + item.getSubTotal());
        }

        System.out.println("----------------------------------");
        System.out.println("Total Geral da Compra: " + this.valorTotalCompra);
        System.out.println("----------------------------------");

    }
}
