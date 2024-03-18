/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 * @param <T>
 */
public abstract class Pila<T> {

    // Declaración de atributos.
    private List<T> pila;
    private int maxElementos;

    // Constructores
    public Pila() {
    }

    public Pila(int maxElementos) {
        this.pila = new ArrayList<>(maxElementos);
        this.maxElementos = maxElementos;
    }

    // Getters y Setters
    public List<T> getLista() {
        return pila;
    }

    public void setLista(List<T> lista) {
        this.pila = lista;
    }

    public int getMaxElementos() {
        return maxElementos;
    }

    public void setMaxElementos(int maxElementos) {
        this.maxElementos = maxElementos;
    }

    // toString
    @Override
    public String toString() {
        return "Pila{" + "lista=" + pila + ", maxElementos=" + maxElementos + '}';
    }

    // Métodos que suan las dos pilas por igual.
    // Método para saber los elementos que hay en la lista
    public int numElementosLista() {
        return this.pila.size();
    }

    // Método para saber si la pila esta llena
    public boolean pilaLlena() {
        boolean estado = false;
        if (numElementosLista() == maxElementos) {
            // la pila esta llena
            estado = true;
        }
        return estado;
    }

    // Método que devuelve si está vacio o no.
    public boolean estaVacia() {
        return this.pila.isEmpty();
    }

    // Métodos abstractos que se implementan diferentes en las hijas.
    // Método para añadir elementos al final de la lista
    public abstract void push(T aux);
//    {
//        if (!pilaLlena()) {
//            this.pila.add(0, aux);
//        }
//    }

    // Método para sacar elementos
    public T pop(){
        return this.pila.remove(0);
    }

}
