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
 */
public class main {

    public static void main(String[] args) {

        List<ColaPrioridad> lista = new ArrayList<>();
        // Meter pacientesy no String
        ElementoPrioridad<String> e1 = new ElementoPrioridad<>(5, "tomas");
        ElementoPrioridad<String> e2 = new ElementoPrioridad<>(10, "tomas2");
        ElementoPrioridad<String> e3 = new ElementoPrioridad<>(15, "tomas3");

        ColaPrioridad<ElementoPrioridad> colaPrioridad = new ColaPrioridad<>(4);
        colaPrioridad.push(e1);
        colaPrioridad.push(e2);
        colaPrioridad.push(e3);
        System.out.println(colaPrioridad.numElementosLista());
        System.out.println(colaPrioridad.toString());
        //
        //
        ElementoPrioridad<String> e4 = new ElementoPrioridad<>(1, "tomas4");
        colaPrioridad.push(e4);
        System.out.println(colaPrioridad.numElementosLista());
        System.out.println(colaPrioridad.toString());
    }

}
