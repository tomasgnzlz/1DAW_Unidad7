/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridadfifo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tomas
 * @param <T>
 */
public class ColaPrioridad<T> {

    private List<ElementoPrioridad> lista;
    private int tamanio;

    public ColaPrioridad(int tamanio) {
        this.lista = new ArrayList<>();
        this.tamanio = tamanio;
    }

    public List<ElementoPrioridad> getLista() {
        return lista;
    }

    public void setLista(List<ElementoPrioridad> lista) {
        this.lista = lista;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "ColaPrioridad{" + "lista=" + lista.toString() + ", tamanio=" + tamanio + '}';
    }

    // Métodos
    // Método para saber los elementos que hay en la lista
    public int numElementosLista() {
        return this.lista.size();
    }

    // Método para saber si la pila esta llena
    public boolean pilaLlena() {
        boolean estado = false;
        if (numElementosLista() == tamanio) {
            estado = true;
        }

        return estado;
    }

    // Método para saber si la pila está vacia.
    public boolean pilaVacia() {
        return this.lista.isEmpty();
    }

    // Método para sacar elementos
    // elimino el primero ya que estaría ordenada demayora menor
    public T pop() {
        if (!lista.isEmpty()) {
            return null;
        }
        return (T) this.lista.remove(0);
    }

    // Método para añadir elementos al final de la lista
    public void push(ElementoPrioridad aux) {
//        if (!pilaLlena()) {
////            for (ElementoPrioridad elementoPrioridad : lista) {
////                if (aux.getPrioridad() >= elementoPrioridad.getPrioridad()) {
////                    this.lista.add(0, aux);
////                }else{
////                    this.lista.add( aux);
////                }
////            }
//            this.lista.add((ElementoPrioridad) aux);
//        }

        if (lista.isEmpty()) {          // caso 1
            this.lista.add(aux);
        } else if (!pilaLlena()) {      // caso 2
            this.lista.add(aux);
            
            Collections.sort(lista);
        } else {                        // caso 3
            if (aux.getPrioridad() > lista.get(lista.size() - 1).getPrioridad()) {
                lista.remove(lista.size() - 1);
                this.lista.add(aux);
                Collections.sort(lista);
                // lista .eversrd;
            }
        }
    }

}
