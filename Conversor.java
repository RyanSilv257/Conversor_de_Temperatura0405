import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        int cel, fah, op;

        //Criando instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\n\t\t\t -- Conversor de Temperatura \n");

            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
                op = entrada.nextInt();

        if(op == 1){
            System.out.println("\n\t\t\t -- Celsius para Fahrenheit -- \n");

            //Entrada
            System.out.print("Informe os graus Celsius: ");
                    cel = entrada.nextInt();

            //Processamento
            fah = cel * 9 / 5 + 32;

            //Saída
            System.out.println(fah + "º Fahrenheit");

            
        } else if(op == 2){
            //José

            System.out.println("\n\t\t\t -- Fahrenheit para Celsius -- \n");
            //Entrada
            System.out.print("Informe os graus Fahrenheit: ");
                    fah = entrada.nextInt();

            //Processamento
            cel = (fah - 32) * 5 / 9 ;

            //Saída
            System.out.println(cel + "º Celsius");


        } else if(op == 3){
            System.out.println("Forte Abraço!");
        
        }else{
            System.out.println("Opção " + op + " incorreta!");
        }

    }while(op!=3);
    }

}