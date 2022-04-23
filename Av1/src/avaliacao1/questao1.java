package avaliacao1;
import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] vetor = new int[10];
			int aux;
			Scanner entrada = new Scanner(System.in);
			for(int i=0;i<10;i++){
				System.out.printf("Digite Nota #%d",i+1);
				vetor[i]= entrada.nextInt();	
			}
			for(int i=0; i<10; i++){
				
			for(int j=0; j<9; j++){
				if(vetor[j]> vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					}
				}
			}
			
			System.out.println("\nMaior Nota: " + vetor[9]);
			System.out.println("Segunda Maior Nota: " +vetor[8]);
			System.out.println("Terceira Maior Nota: " +vetor[7]);
			System.out.println("Menor Nota: "+ vetor[0]);
		
			int soma=0;
			float med;
			for(int i=0;i<10;i++){
				soma=soma+vetor[i];
			}
			 med=soma/10;
			 System.out.println("Média: "+med);
						
		}	
	
	}


