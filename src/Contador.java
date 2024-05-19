import java.util.Scanner;

public class Contador {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Parametro 1: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Parametro 2: ");
        int parametroDois = terminal.nextInt();



        try{
            contar(parametroUm, parametroDois);

            
        } catch( ParametrosInvalidosException e){
            System.out.println("O segungo parametro deve ser maior que o primeiro.");
        } 

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
         throw new ParametrosInvalidosException();

        } else{
            int contagem = parametroDois - parametroUm;
            for(int i =1; i <= contagem; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        }
        
    }
}
