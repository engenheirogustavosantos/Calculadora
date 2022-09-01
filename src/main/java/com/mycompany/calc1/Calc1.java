package com.mycompany.calc1;

import java.util.Scanner;

public class Calc1 {

    public static void main(String[] args) {
        int op, num, num2, res = 0;
        
        System.out.println("Escolha a opção: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Subtração");
        Scanner esc = new Scanner(System.in);
        op = esc.nextInt();
        
        
            if(op == 1){
                 System.out.println("Digite aqui o primeiro valor: ");
                 Scanner vlr = new Scanner(System.in);
                 num = vlr.nextInt();
                 
                 System.out.println("Digite aqui o segundo valor: ");
                 Scanner vlr2 = new Scanner(System.in);
                 
                 num2 = vlr2.nextInt();
                 
                res = (num + num2);
            }
            
            if(op == 2){
                 System.out.println("Digite aqui o primeiro valor: ");
                 Scanner vlr = new Scanner(System.in);
                 num = vlr.nextInt();
                 
                 System.out.println("Digite aqui o segundo valor: ");
                 Scanner vlr2 = new Scanner(System.in);
                 
                 num2 = vlr2.nextInt();
                 
                res = (num - num2);
            }
            
            if(op == 3){
                 System.out.println("Digite aqui o primeiro valor: ");
                 Scanner vlr = new Scanner(System.in);
                 num = vlr.nextInt();
                 
                 System.out.println("Digite aqui o segundo valor: ");
                 Scanner vlr2 = new Scanner(System.in);
                 
                 num2 = vlr2.nextInt();
                 
                res = (num * num2);
            }
            
            if(op == 4){
                 System.out.println("Digite aqui o primeiro valor: ");
                 Scanner vlr = new Scanner(System.in);
                 num = vlr.nextInt();
                 
                 System.out.println("Digite aqui o segundo valor: ");
                 Scanner vlr2 = new Scanner(System.in);
                 
                 num2 = vlr2.nextInt();
                 
                res = (num / num2);
            }
        System.out.println("O resulado é: "+res);
    }
}
