/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar3;

import java.util.Scanner;

/**
 *
 * @author Keyra Lima
 */
public class ejercicios {   
    public void ejercicio1() {
     Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese un día: ");
    String dia, d1="lunes", d2="martes", d3="miercoles", d4="jueves", d5="viernes", d6="sabado", d7="domingo";
    dia = entrada.next();
    if(dia.equals(d1)){
        System.out.print("Debe estudiar Microeconomía ");
    }else if(dia.equals(d2)){
        System.out.print("Debe estudiar Programación");     
    }else if(dia.equals(d3)){
        System.out.print("Debe estudiar Calculo I");
    }else if(dia.equals(d4)){
        System.out.print("Debe estudiar Estadistica");
    }else if(dia.equals(d5)){
        System.out.print("Debe estudiar Fisica I");
    }else if(dia.equals(d6)){
        System.out.print("Dia de universidad. ");
    }else if(dia.equals(d7)){
        System.out.print("Descanso : ) ");
    }
 }
    
     public void ejercicio2(){
         Scanner entrada = new Scanner(System.in);
        int hora;
        System.out.print("¿Qué hora es? ");
        hora = entrada.nextInt();
        if((hora>=6) && (hora<=12)){
            System.out.print("Buenos días");
        }
        else if((hora>=13) && (hora<=20)){
            System.out.print("Buenos tardes");
        }
        else if((hora>=21)&& (hora<=5)){
            System.out.print("Buenos noches");
        }
         
     }
     
     public void ejercicio3(){
         int numero=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        while ( numero >7 || numero<1){
            numero =entrada.nextInt();
        } 
        
        switch(numero){
            case 1: System.out.print(" Lunes");
            break;
            case 2: System.out.print(" Martes");
            break;
            case 3: System.out.print(" Miercoles");
            break;
            case 4: System.out.print(" Jueves");
            break;
            case 5: System.out.print(" Viernes");
            break;
            case 6: System.out.print(" Sabado");
            break;
            case 7: System.out.print(" Domingo");
            break;
            default: System.out.print(" Intente nuevamente");
            break;
        }
        
     }
     
     public void ejercicio4(){
         Scanner entrada = new Scanner(System.in);
        int horas,total;
        System.out.print("¿Cuántas horas trabajó? ");
        horas = entrada.nextInt();
       
        if(horas>=41){
            total = +16;
        }
        total = horas*12;
        System.out.print("Su pago es de: €"+total+" Euros");
     }
     
     public void ejercicio7(){
         Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, media;
        System.out.print("Ingrese nota 1: ");
        nota1 = entrada.nextInt();
        System.out.print("Ingrese nota 2: ");
        nota2 = entrada.nextInt();
        System.out.print("Ingrese nota 3: ");
        nota3 = entrada.nextInt();
        media = (nota1+nota2+nota3)/3;
        System.out.print("La media es: "+media);
         
     }
     
     public void ejercicio8(){
         Scanner entrada = new Scanner(System.in);
    int nota1, nota2, nota3, media;
    System.out.print("Ingrese nota 1: ");
    nota1 = entrada.nextInt();
    System.out.print("Ingrese nota 2: ");
    nota2 = entrada.nextInt();
    System.out.print("Ingrese nota 3: ");
    nota3 = entrada.nextInt();
    media = (nota1+nota2+nota3)/3;
    System.out.print("La media es: "+media);
    if(media>=75){
        System.out.println("\nSu promedio es excelente ");
    }else if(media<=74){
        System.out.println("\nSu promedio es bueno ");
    }else if(media<=65){
        System.out.println("\nDebe mejorar");
    }
     }
     
     public void ejercicio9(){
         Scanner entrada = new Scanner(System.in);
     int opcion, num1, num2, num3, num4, num5, num6, num7, num8, media;
     System.out.println("Cuantos digitos desea calcular: \n1. 4\n2. 6 \n3. 8");
     opcion = entrada.nextInt();
     
     if(opcion==1){
         System.out.println("Ingrese un numero:");
         num1=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num2=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num3=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num4=entrada.nextInt();
         media = num1+num2+num3+num4/4;
         System.out.println("La media es: "+media);
     }else if(opcion==2){
         System.out.println("Ingrese un numero:");
         num1=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num2=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num3=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num4=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num5= entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num6= entrada.nextInt();
         media = num1+num2+num3+num4+num5+num6/6;
         System.out.println("La media es: "+media);
     }else if(opcion==3){
         System.out.println("Ingrese un numero:");
         num1=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num2=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num3=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num4=entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num5= entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num6= entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num7= entrada.nextInt();
         System.out.println("Ingrese el siguiente numero: ");
         num8= entrada.nextInt();
         media = (num1+num2+num3+num4+num5+num6+num7+num8)/8;
         System.out.println("La media es: "+media);
     }
     }
     
     public void ejercicio11(){
         Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4, num5, cubo=3, cuad=2;
        System.out.println("Ingrese cinco números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();
        System.out.print("Resultado numero1: \tCuadrado: "+ Math.pow(num1, cuad));
        System.out.print("\tCubo:"+ Math.pow(num1, cubo));   
        System.out.print("\nResultado numero2: \tCuadrado: "+ Math.pow(num2, cuad));
        System.out.print("\tCubo:"+ Math.pow(num2, cubo));   
        System.out.print("\nResultado numero3: \tCuadrado: "+ Math.pow(num3, cuad));
        System.out.print("\tCubo:"+ Math.pow(num3, cubo)); 
        System.out.print("\nResultado numero4: \tCuadrado: "+ Math.pow(num4, cuad));
        System.out.print("\tCubo:"+ Math.pow(num4, cubo));
        System.out.print("\nResultado numero5: \tCuadrado: "+ Math.pow(num5, cuad));
        System.out.print("\tCubo:"+ Math.pow(num5, cubo)); 
    }
     
     public void ejercicio12(){
         Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        System.out.println("Serie de Finobacci.");
        System.out.println("Ingrese dos numeros: Ej(0, 1) ");
        num1 = entrada.nextInt(); num2 = entrada.nextInt();
        num3 = num1+num2;
        num4 = num2+num3;
        num5 = num3+num4;
        num6 = num4+num5;
        num7 = num6+num5;
        num8 = num6+num7;
        num9 = num8+num7;
        num10 = num8+num9;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
     }
     
     public void ejercicio14(){
        Scanner entrada = new Scanner(System.in);
        int base, expo, total;
        System.out.println("Ingrese la base: ");
        base = entrada.nextInt();
        System.out.println("Ingrese el exponente: ");
        expo = entrada.nextInt();
        total = (int) Math.pow(base, expo);
        System.out.println("Resultado: "+total);
     }
     
     public void ejercicio16(){
         
     }

    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    
}
    
    
    

