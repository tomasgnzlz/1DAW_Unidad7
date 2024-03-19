/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridadfifo;

import java.util.Objects;

/**
 *
 * @author tomas
 * @param <T>
 */
public class ElementoPrioridad<T> implements Comparable<ElementoPrioridad> {

    private int prioridad;
    private T datoIntroducir;

    private final int MAX_PRIORIDAD = 20;

    // Constructor
    public ElementoPrioridad(int prioridad, T datoIntroducir) {
        if (prioridad > MAX_PRIORIDAD || prioridad < 0) {
            throw new IllegalArgumentException();
        }
        this.prioridad = prioridad;
        this.datoIntroducir = datoIntroducir;
    }

    // Getter y seter
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public T getDatoIntroducir() {
        return datoIntroducir;
    }

    public void setDatoIntroducir(T datoIntroducir) {
        this.datoIntroducir = datoIntroducir;
    }

    @Override
    public String toString() {
        return "ElementoPrioridad{" + "prioridad=" + prioridad + ", datoIntroducir=" + datoIntroducir + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.prioridad;
        hash = 71 * hash + Objects.hashCode(this.datoIntroducir);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElementoPrioridad<?> other = (ElementoPrioridad<?>) obj;
        if (this.prioridad != other.prioridad) {
            return false;
        }
        return Objects.equals(this.datoIntroducir, other.datoIntroducir);
    }

    @Override
    public int compareTo(ElementoPrioridad o) {
        return Integer.compare(this.getPrioridad(), o.getPrioridad());
    }

}
