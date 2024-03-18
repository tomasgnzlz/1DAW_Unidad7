/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n******************PRUEBAS CON FIFO******************\n");   
        Pila<String> p = new PilaFifo<>(5);
        
        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        p.push("Vico1");
        System.out.println(p.toString());

        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        p.push("Vico2");
        System.out.println(p.toString());
        System.out.println("Se ha eliminado un elemento de la pila: " + p.pop());
        p.push("Vico3");
        p.push("Vico4");
        p.push("Vico5");
        p.push("Vico6");
        p.push("Vico7");
        System.out.println(p.toString());
        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        
        
        System.out.println("\n******************PRUEBAS CON LIFO******************\n");   
        
        Pila<String> pl = new PilaLifo<>(5);
        System.out.println("La pila tiene " + pl.numElementosLista() + " elementos");
        pl.push("Vico1");
        System.out.println(pl.toString());

        System.out.println("La pila tiene " + pl.numElementosLista() + " elementos");
        pl.push("Vico2");
        System.out.println(pl.toString());
        System.out.println("Se ha eliminado un elemento de la pila: " + pl.pop());
        pl.push("Vico3");
        pl.push("Vico4");
        pl.push("Vico5");
        pl.push("Vico6");
        pl.push("Vico7");
        System.out.println(pl.toString());
        System.out.println("La pila tiene " + pl.numElementosLista() + " elementos");
    }
}
