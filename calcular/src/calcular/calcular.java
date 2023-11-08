package calcular;
import java.util.Scanner;
public class calcular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Calculadora com 4 operações\n1 - iniciar\n2 - instruções\n3 - Encerrar Programa");
			int opcao = input.nextInt();
			if(opcao == 1) {
				
				System.out.print("Digite o 1° número:");
				Double num1 = input.nextDouble();
				System.out.print("Digite o 2° número:");
				Double num2 = input.nextDouble();
				while(true) {
					System.out.println("Digite a operação (soma, subtracao, multiplicacao,divisao): ");
					String operacao = input.next();
					if(operacao.equals("soma")) {
						Double soma = num1+num2;
						System.out.println(soma);
						break;
					}
					else if(operacao.equals("subtracao")) {
						Double subtracao = num1-num2;
						System.out.println(subtracao);
						break;
					}
					else if(operacao.equals("multiplicacao")) {
						Double multiplicacao = num1*num2;
						System.out.println(multiplicacao);
						break;
					}
					else if(operacao.equals("divisao")) {
						Double divisao = num1/
								num2;
						System.out.println(divisao);
						break;
					}
					else {
						System.out.println("Digite um operação válida");
					}
				}
			}else if(opcao == 2) {
				System.out.println("Calcula onde o usuário digita dois números e a operação desejada e após isso, ele retorna o calculo desejado");
			}
			else if(opcao == 3) {
				break;
			}
			
		}

	}

}
