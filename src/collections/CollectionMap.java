/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adrian
 */
public class CollectionMap {
    
        public static void main(String[] args) {

            Map <String,Cliente> miColeccionMap = new HashMap<>();
                    
            miColeccionMap.put("numero 1", new Cliente("Adrian Wilgenhoff","00001", 20000));
            miColeccionMap.put("numero 2", new Cliente("Fabian Wilgenhoff","00002", 30000));
            miColeccionMap.put("numero 3", new Cliente("Esteban Wilgenhoff","00003", 10000));
            
            for (Map.Entry<String, Cliente> entry : miColeccionMap.entrySet()) {
                System.out.println("CLAVE: " + entry.getKey() + " VALOR: " + entry.getValue().getNombre());
            }
         
            //BORRAR UN ELEMENTO X CLAVE
            
            System.out.println("\nEliminacion del cliente 1:");
            miColeccionMap.remove("numero 1");
            
            for (Map.Entry<String, Cliente> entry : miColeccionMap.entrySet()) {
                System.out.println("CLAVE: " + entry.getKey() + " VALOR: " + entry.getValue().getNombre());
            }
            
            
            
            
        }
}
