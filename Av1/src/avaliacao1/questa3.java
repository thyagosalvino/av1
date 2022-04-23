/**
 * 
 */
package avaliacao1;
import java.util.Scanner;
import java.util.Random;
/**
 * @author 11510313
 *
 */
public class questa3 {

	/**
	 * @param args
	 */
			public static void main(String[] args) {
				final Scanner entrada = new Scanner (System.in);
				Random numrandomico = new Random();
				short opcao;
				String [] locais = new String[100]; 
		        String [] datas = new String[100];
				int[] itens= new int[100];
								
				String autor,local = null, data = null, descricao;
				int item; 
				do {
				System.out.println("\nCADASTRO DE ITENS PERDIDO\n");
				System.out.println("Opção 1: Cadastrar item perdido");
				 System.out.println("Opção 2: Buscar item");
				 System.out.println("Opção 3: Sair");
				 opcao = entrada.nextShort();
				 
				 switch (opcao) {
				 
				 case 1:
				     System.out.println("item: ");
				     item= entrada.nextInt();
				     itens[item]=item;
				     System.out.println("autor: ");
				     autor= entrada.next();
				     System.out.println("local: ");
				     locais[item]= entrada.next();
				     System.out.println("Data: ");
				     datas[item]= entrada.next();
				     System.out.println("descrição: ");
				     local= entrada.next();
			    	 
			         System.out.println("\nCadastro Efetuado com Sucesso."); 
			         break;
				 
				 case 2:
					 
					 System.out.println("Entre com o item:");
					 item = entrada.nextInt();
								 
					if (itens[item]>0) {
							 System.out.println("Item Encontrado");	
							 System.out.print ("\nLocal: " +locais[item]);
							 System.out.print ("\nData: " +datas[item]);
							 
						 	 itens[item-1]=0;
						 }
					else
						   System.out.println("Item não Encontrado");
					 break;
				 	
				 case 3:
					 System.out.println("FECHAR");
					 break;
				 default:	 
					 System.out.println("Opção Inválida");
				 }
				}while(opcao!=4);
				for (int i=0;i<100;i++)
				 {
					System.out.println(itens[i]);
				 }
			}

		}