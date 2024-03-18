/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tomas
 */
public class RegexTarea {

    public static void main(String[] args) {

        //1. Saber si una cadena contiene el patrón AP-Nº (nombre de las autopistas), 
        //   siendo Nº cualquier número de uno o dos dígitos. Ejemplos que cumplen el patrón: AP-7, AP-77...
        System.out.println("\n**********************************EJEMPLO 1**********************************");
        String regex1 = "AP-[1-9]{1,}";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher("AP-7");
        if (m.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

        //2. Saber si una cadena coincide exactamente con el patrón anterior.
        System.out.println("\n**********************************EJEMPLO 2**********************************");
        String regex2 = "^AP-[1-9]{1,}$";
        String prueba2 = "AP-7";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(prueba2);
        if (m2.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

        //3. Saber si una cadena coincide exactamente con el patrón de la matrícula de un coche.
        System.out.println("\n**********************************EJEMPLO 3**********************************");
        String regex3 = "^[0-9]{4} [A-Z]{3}$";
        String prueba3 = "1234 ABC";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(prueba3);
        if (m3.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
        

        //4. Saber si una cadena contiene el patrón letraNumero, tantas veces como se repita. Ejemplos que cumplen el patrón: e3, e3r4, q1w2d4, ...
        System.out.println("\n**********************************EJEMPLO 4**********************************");
        String regex4 = "[a-z]{1}[0-9]{1}";
        String prueba4 = "d1l4p9";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(prueba4);
        if (m4.find()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

        //5. Saber si una cadena es un código postal (5 dígitos)
        System.out.println("\n**********************************EJEMPLO 5**********************************");
        String regex5 = "^[0-9]{5}$";
        String prueba5 = "29680";
        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(prueba5);
        if (m5.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
        

        //6. Saber si una cadena es un usuario de IPasen, sabiendo que tiene entre 7 y 8 caracteres seguidos de 3 o 4 dígitos numéricos.
        System.out.println("\n**********************************EJEMPLO 6**********************************");
        String regex6 = "^[a-z A-Z]{7,8}[0-9]{3,4}$";
        String prueba6 = "tgonati327";
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(prueba6);
        if (m6.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

        //7. Saber si una cadena tiene tamaño 5 y no contiene ni F, ni R, ni K.
        System.out.println("\n**********************************EJEMPLO 7**********************************");
        String regex7 = "^[^FRK]{5}$";
        //String prueba7 = "AAAAF";
        String prueba7 = "AAAAA";
        Pattern p7 = Pattern.compile(regex7);
        Matcher m7 = p7.matcher(prueba7);
        if (m7.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

        //8. Saber si una cadena contiene las palabras "Hardware" o "Software".
        System.out.println("\n**********************************EJEMPLO 8**********************************");
        String regex8 = "\\b(Hardware|Software)\\b";
        String prueba8 = "Hardware";
        Pattern p8 = Pattern.compile(regex8);
        Matcher m8 = p8.matcher(prueba8);
        if (m8.find()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

    }
    
  


}
