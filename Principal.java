
import java.util.Scanner;

public class Principal {
    public static void main(String args []){

        Conta minhaConta=new Conta();
        minhaConta.setNumero(4);
        System.out.println(minhaConta.getNumero());
        minhaConta.setNumero(6);
        System.out.println(minhaConta.getNumero());
        minhaConta.setTitular("Carla");
        System.out.println(minhaConta.getTitular());
        minhaConta.setSaldo(197.89);
        System.out.println(minhaConta.getSaldo ());

    
char caracter = 'A'; //código relacionado a ela   
     String caracteres="A";

     Scanner ler=new Scanner(System.in);
    System.out.println("Digite uma letra");

    //c = sc.next().charAt(0);
    caracter=ler.next().charAt(0);

     switch(caracter){
         case 'A':
         System.out.println("Você digitou o caracter A");
         break;
         case 'E':
         System.out.println("Você digitou o caracter E");
         break;
         case 'I':
         System.out.println("Você digitou o caracter I");
         break;
         case 'O':
         System.out.println("Você digitou o caracter O");
         break;
         case 'U':
         System.out.println("Você digitou o caracter U");
         break;
     }

     }

    }