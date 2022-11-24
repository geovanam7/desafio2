import java.util.Scanner;
public class desafio2 {
    public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);

   int A;
   int soma = 0;
   int B;

   System.out.println ("digite o valor de A:  ");
     A =  scan.nextInt();

     System.out.println ("digiteo valor de b:   ");
     B = scan.nextInt ();

     for(int x = 1; x <= B; x++){
        if (x % A ==0) {
            soma += x;
        }
     }
     System.out.println (soma);






    }
}