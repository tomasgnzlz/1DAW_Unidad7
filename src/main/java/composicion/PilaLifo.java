/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author tomas
 */
public class PilaLifo<T> extends Pila<T>{

    // Constructor
    public PilaLifo(int maxElementos) {
        super(maxElementos);
    }
    
    // Métodos abstractos
    @Override
    public void push(T aux) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (!this.pilaLlena()) {
            this.getLista().add(0,aux);
        }
    }
    
    // toStrings
    @Override
    public String toString() {
        return super.toString() + "\nPilaLifo{" + '}';
    }
    
}
