package arvoretest;

import java.util.Scanner;

public class ArvoreNatalFeliz {
    public static void main(String[] args) {
        int pos;
        int ini;
        int quantidade = 1;

       
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite o tamanho da arvore: ");
        pos = myObj.nextInt();

        ini = pos;

        System.out.print("\n");
        System.out.print("");

        
        for (int i = 1; i <= pos; i++) {
            
            for (int j = 1; j <= ini; j++) {
                System.out.print(" ");
            }
            ini -= 1;
           
            for (int j = 1; j <= quantidade; j++) {
              
                System.out.print("*");
            }
            quantidade += 2;
            System.out.print("\n");
        }
        ini = pos -1;

        
        for (int i = 0; i < 3; i++) {
           
            for(int j = 1; j <= ini; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
        myObj.close();
    }
}