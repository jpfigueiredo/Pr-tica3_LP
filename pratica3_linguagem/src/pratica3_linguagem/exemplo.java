package pratica3_linguagem;
import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
            // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (valida_cpf.isCPF(CPF) == true) 
           System.out.printf("%s\n", valida_cpf.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");
        }
		
		
		
	}


