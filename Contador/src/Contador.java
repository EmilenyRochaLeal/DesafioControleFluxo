import java.util.Scanner;
public class Contador {

    public static void contar(int num1, int num2) throws Exception{
        if (num2 <= num1) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }
        int subtracao = num2 - num1;
        for (int i=0; i < subtracao; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        terminal.close();
    }
}
