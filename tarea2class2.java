/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar3;

import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Keyra Lima
 */
public class tarea2class2 {
    
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        int num1, resul, num2;
        System.out.print("Ingrese un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = entrada.nextInt();
        resul = num1*num2;
        System.out.println("La multiplicación es: "+resul);
    }
    
    public void ejercicio2(){
        System.out.println("Euros a Pesetas");
        Scanner entrada = new Scanner(System.in);
        double euro, resul;
        System.out.print("Ingrese la cantidad de euros: ");
        euro = entrada.nextDouble();
        resul = euro*166;
        System.out.println("La cantidad de euros en pesetas es: "+resul);
    }
    
    public void ejercicio3(){
    System.out.println("Euros a Pesetas");
    Scanner entrada = new Scanner(System.in);
    double euro, resul;
    System.out.print("Ingrese la cantidad de euros: ");
    euro = entrada.nextDouble();
    resul = euro*166;
    System.out.println("La cantidad de euros en pesetas es: "+resul);
    }
    
    public void ejercicio4(){
        System.out.print("Pesetas a Euros");
        Scanner entrada = new Scanner(System.in);
        double peset, result;
        System.out.println("Ingrese la cantidad de pesetas: ");
        peset = entrada.nextDouble();
        result = peset*0.01;
        System.out.println("La cantidad de pesetas en euros es: "+result);
    }
    
    public void ejercicio5(){
        Scanner entrada = new Scanner(System.in);
        int num1, num2, sum, res, mul, div;
        System.out.print("Ingrese un primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Sus resultados son: ");
        sum = num1+num2;
        res = num1-num2;
        mul = num1*num2;
        div = num1/num2;
        System.out.println("Suma: "+sum);
        System.out.println("Resta: "+res);
        System.out.println("Multiplicación: "+mul);
        System.out.println("División: "+div);
    }
    
    public void ejercicio6(){
        Scanner entrada = new Scanner(System.in);
        double base, altura, resul;
        System.out.print("Ingrese su base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese su altura: ");
        altura = entrada.nextDouble();
        resul = base*altura;
        System.out.println("La área del rectangulo es: "+resul);
    }
    
    public void ejercicio7(){
        Scanner entrada = new Scanner(System.in);
        double base, h, result;
        System.out.print("Ingrese la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        h = entrada.nextDouble();
        result = (base*h)/2;
        System.out.println("El área del triangulo es: "+result);
    }
    
    public void ejercicio8(){
        Scanner entrada = new Scanner(System.in);
        double base, iva, resul;
        System.out.print("Ingrese la Base Imponible exacta: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese el IVA: (Ejemplo: Si es 21% = 1.21):  ");
        iva = entrada.nextDouble();
        resul = base*iva;
        System.out.println("El total de factura es: "+resul);
    }
    
    public void ejercicio9(){
        Scanner entrada = new Scanner(System.in);
        int hora;
        double resultado;
        System.out.print("Ingrese el total de horas trabajadas: ");
        hora = entrada.nextInt();
        resultado = hora*8.50;
        System.out.println("Su Salario es: "+resultado);
    }
    
    public void ejercicio10(){
        Scanner entrada = new Scanner(System.in);
        double pi=3.1416;
        double h, rd, resul;
        System.out.print("Ingrese la altura del cono: ");
        h = entrada.nextDouble();
        System.out.print("Ingrese el radio del cono: ");
        rd = entrada.nextDouble();
        resul = pi*rd*h/3;
        System.out.println("El volumen del cono es: "+resul);
    }
    
    public void ejercicio11(){
        Scanner entrada = new Scanner(System.in);
        int mega; double resul;
        System.out.print("Ingrese la cantidad de Mb: ");
        mega = entrada.nextInt();
        resul = mega * (1000/1.0);
        System.out.println(+resul +"Kb");
    }
    
    public void ejercicio12(){
        Scanner entrada = new Scanner(System.in);
        double hora, resul;
        System.out.print("Ingrese la hora actual: ");
        hora = entrada.nextDouble();
        resul = hora-24.00;
        System.out.println("Faltan "+resul+"horas para media noche.");
    }
    
    public void ejercicio13(){
        int p1, p2, dato1=0, dato2=3;
        String p3, p4, p5, p6, p7, p8, p9, p10;
        String dato3="moda", dato4="estadistica", dato5="dato", dato6="muestra", dato7="economia", dato8="peso", dato9="newton", dato10="gravedad";
        int pp3, pp4, pp5, pp6, pp7, pp8, pp9, pp10, total;
        
       p1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la derivada de una constante? "));
       if(p1 == dato1){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           p1 = 1;
       }
       else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta  ");
       }
       p2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el resultado de 3X+12? "));
       if(p2 == dato2){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           p2 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta  ");
       }
       p3 = JOptionPane.showInputDialog("¿Cómo se le llama al dato con mayor frecuencia en las distribuciones?");
       if(Objects.equals(p3, dato3)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp3 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       }
       p4 = JOptionPane.showInputDialog("¿Qué consiste en métodos y formulas que permiten recolectar información\n" +
"para estudiarla? ");
       if(Objects.equals(p4, dato4)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp4 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       }
       p5 = JOptionPane.showInputDialog("¿Cómo se le llama a cada valor dentro de la in. estadistica? ");
       if(Objects.equals(p5, dato5)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp5 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       }
       p6 = JOptionPane.showInputDialog("¿Cuál es el subconjunto de datos pertenecientes a una porcion de lo investigado? ");
       if(Objects.equals(p6, dato6)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp6 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       } 
       p7 =  JOptionPane.showInputDialog("¿Cómo se le llama al estudio de fenomenos sociales y monetarios?");
       if(Objects.equals(p7, dato7)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp7 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       } 
       p8 = JOptionPane.showInputDialog("¿Fuerza con que la Tierra atrae a un cuerpo, por acción de la gravedad?");
       if(Objects.equals(p8, dato8)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp8 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       } 
       p9 = JOptionPane.showInputDialog("¿Cuál es la medida internacional para usar en física?");
       if(Objects.equals(p9, dato9)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp9 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       }
       p10 = JOptionPane.showInputDialog("¿Cuál es el fenómeno natural por el cual los objetos con masa son atraídos entre sí?");
       if(Objects.equals(p10, dato10)){
           JOptionPane.showMessageDialog(null, "La respuesta es correcta ");
           pp10 = 1;
       }else{
           JOptionPane.showMessageDialog(null, "La respuesta es incorrecta ");
       }
       
       JOptionPane.showMessageDialog(null, "Usted ha tenido un punteo de: ");
    }
    
        public void ejercicio14(){
        Scanner reader = new Scanner(System.in);
        int num1,num2;
       
        System.out.println("Introduce un número");
        num1 = reader.nextInt();

        System.out.println("Introduce el número por el cual quieres saber si es divisible");
        num2 = reader.nextInt();
       
        if (num1%num2 == 0){
           System.out.println(num1 + " es divisible por " + num2);
         }else{
           System.out.println(num1 + " NO es divisible por " + num2); 
    }
       
       public void ejercicio15(){
        int diaEntrada, mesEntrada;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Introduce tu dia: ");
        diaEntrada = Integer.parseInt(Sc.nextLine());
        System.out.print("Introduce tu dia: ");
        mesEntrada = Integer.parseInt(Sc.nextLine());
        System.out.println("Tu signo zodiacal es: " + calcularSignoZodiacal(diaEntrada,mesEntrada));
    }
        public static String calcularSignoZodiacal(int dia, int mes) {
        if (mes == 1) {
            if (dia >= 21) {
                //acuario
                return "Acuario";
            } else {
                //capricornio
                return "Capricornio";
            }
        }
        if (mes == 2) {
            if (dia >= 19) {
                return "Piscis";
            } else {
                return "Acuario";
            }
        }
        if (mes == 3) {
            if (dia >= 20) {
                //acuario
                return "Aries";
            } else {
                //capricornio
                return "Piscis";
            }
        }
        if (mes == 4) {
            if (dia >= 20) {
                return "Tauro";
            } else {
                return "Aries";
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                //acuario
                return "Geminis";
            } else {
                //capricornio
                return "Tauro";
            }
        }
        if (mes == 6) {
            if (dia >= 20) {
                return "Cancer";
            } else {
                return "Geminis";
            }
        }
        if (mes == 7) {
            if (dia >= 22) {
                //acuario
                return "Leo";
            } else {
                //capricornio
                return "Cancer";
            }
        }
        if (mes == 8) {
            if (dia >= 21) {
                return "Virgo";
            } else {
                return "Leo";
            }
        }
        if (mes == 9) {
            if (dia >= 22) {
                //acuario
                return "Libra";
            } else {
                //capricornio
                return "Virgo";
            }
        }
        if (mes == 10) {
            if (dia >= 22) {
                return "Escorpion";
            } else {
                return "Libra";
            }
        }
        if (mes == 11) {
            if (dia >= 21) {
                //acuario
                return "Sagitario";
            } else {
                //capricornio
                return "Escorpion";
            }
        }
        if (mes == 12) {
            if (dia >= 21) {
                return "Capricornio";
            } else {
                return "Sagitario";
            }
        }
        return "fecha no valida";
    }
}

    public void ejercicio16(){
       Scanner entrada = new Scanner(System.in);
       int numero1, numero2, numero3, mayor, menor, medio;
       System.out.println("Ingrese un numero: ");
       numero1 = entrada.nextInt();
       System.out.println("Ingrese otro numero: ");
       numero2 = entrada.nextInt();
       System.out.println("Ingrese otro numero: ");
       numero3 = entrada.nextInt();
       
       if((numero1 <= numero2)&&(numero1 <= numero3)){
           menor = numero1;
           
           if(numero2 <= numero3){
               medio = numero2;
               mayor = numero3;
           }else{
               medio = numero3;
               mayor = numero2;
           }
       }else if((numero2 <= numero1)&&(numero2 < numero3)){
           menor = numero2;
       
        if(numero1 <= numero3){
	medio = numero1;
	mayor = numero3;
}else{
	medio = numero3;
	mayor = numero1;
}
}else{
	menor = numero3;

	if(numero1 <= numero2){
		medio = numero1;
		mayor = numero2;
}else{
	medio = numero2;
	mayor = numero1;
    
}
         System.out.print(menor+"\t"+medio+"\t"+mayor+"\t");        
      
       
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
