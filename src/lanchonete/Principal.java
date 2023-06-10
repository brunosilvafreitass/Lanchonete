
package lanchonete;

import java.util.Calendar;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Endereco endCliente = new Endereco("General Osorio", "Centro", "123","Ribeirao Preto", "SP", "14015000");

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.YEAR, 2000);
        dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
        dataNascimento.set(Calendar.DAY_OF_MONTH, 18);
        
        Cliente cliente = new Cliente("Carla Dias", "Carla", endCliente, "16988665544", dataNascimento, "12345678998", "32165498799", "carla@gmail.com", "1234");

        
        Endereco endFuncionario = new Endereco("9 de julho", "Centro", "100", "Ribeirao Preto", "SP", "14020098");
        
        
        Calendar dataNasFunc = Calendar.getInstance();
        dataNasFunc.set(Calendar.YEAR, 1995);
        dataNasFunc.set(Calendar.MONTH, Calendar.MARCH);
        dataNasFunc.set(Calendar.DAY_OF_MONTH, 20);
        
        
        Funcionario funcionario = new Funcionario("Ana Maria", "Ana", endFuncionario, "16955324455", dataNascimento, "42354654656", "32143443444", "ana@gmail.com", 1, 2500, "Cozinheiro", 40); 
        
         Endereco endFornecedor = new Endereco("Via Norte", "Ipiranga", "200", "Ribeirao Preto", "SP", "14021618");
        
        
        Calendar dataNasForn = Calendar.getInstance();
        dataNasForn.set(Calendar.YEAR, 1995);
        dataNasForn.set(Calendar.MONTH, Calendar.MARCH);
        dataNasForn.set(Calendar.DAY_OF_MONTH, 20);
        
        Fornecedor fornecedor = new Fornecedor("Sadia LTDA", "Sadia", endFornecedor, "16966443544", dataNascimento, "09809809898", "09809887665", "sadia@gmail.com");
        
        Produto prod1 = new Produto("xtudo", 50, "987654", 20, 42, fornecedor);
        Produto prod2 = new Produto("xsalada", 50, "a988478", 10, 29, fornecedor);
        
        Calendar dataVenda = Calendar.getInstance();
        dataVenda.set(Calendar.YEAR, 2023);
        dataVenda.set(Calendar.MONTH, Calendar.MARCH);
        dataVenda.set(Calendar.DAY_OF_MONTH, 20);        
                
        Compra compra = new Compra(cliente, funcionario,22, dataVenda );
        
        ItemCompra item1 = new ItemCompra(compra, prod1, 0, 42);
        ItemCompra item2 = new ItemCompra(compra, prod2, 0, 29);  
        
        
        Scanner sc = new Scanner(System.in);
        int unidade = 0;
        int opcao = 0;    
        
        while (opcao != 3){
            System.out.println("-----------------------");
            System.out.println("Escolha seus produtos :");
            System.out.println("1 - xtudo");
            System.out.println("2 - xsalada");
            System.out.println("3 - sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                	compra.adicionarItemCompra(item1);
                	System.out.print("Escolha a quantidade:");
                	unidade = sc.nextInt();
                	item1.setQtd(unidade);
                	item1.setSubTotal(unidade);
                    break;
                    
                case 2:
                	compra.adicionarItemCompra(item2);
                  	System.out.print("Escolha a quantidade:");
                	unidade = sc.nextInt();
                	item2.setQtd(unidade);
                	item2.setSubTotal(unidade);
                    break;

                case 3:
                    break;
                    
                default:
                    System.out.println("-----------------------");
                    System.out.println("Opção inválida. Tente novamente.");
                    break;                                          
            }
		}
        
        int opcaoCpf = 0;      
        while (opcaoCpf != 2){
            System.out.println("-----------------------");
            System.out.println("CPF na nota?:");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            System.out.print("Opcao: ");
            opcaoCpf = sc.nextInt();
            
            switch(opcaoCpf){
                case 1:
                    compra.imprimirCupomFiscalCPF(); 
                    break;
                    
                case 2:
                    compra.imprimirCupomFiscal();
                    break;
                    
                default:
                    System.out.println("-----------------------");
                    System.out.println("Opção inválida. Tente novamente.");
                    break;                                          
            }
	            if (opcaoCpf == 1) {
	                break;
            }
            
        }

    }
}
