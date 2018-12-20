/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Adrian
 */
public class CollectionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1 = new Cliente ("Adrian Wilgenhoff","00001", 20000);
        Cliente c2 = new Cliente ("Fabian Perez","00002", 30000);
        Cliente c3 = new Cliente ("Agustin Fernandez","00003", 10000);
        Cliente c4 = new Cliente ("Florencia Sama","00004", 10000);
        
        Cliente c5 = new Cliente ("Florencia Sama","00005", 10000);
        Cliente c6 = new Cliente ("Florencia Sama","00005", 10000);
        
        Set <Cliente> miColeccionSet = new HashSet<>();
        
        miColeccionSet.add(c1);
        miColeccionSet.add(c2);
        miColeccionSet.add(c3);
        miColeccionSet.add(c4);
        
        //SI INGRESO OTRO CLIENTE CON LOS MISMO DATOS SE INGRESARA DE IGUAL FORMA EN LA LISTA
        //PARA QUE NO SUCEDA Y CUMPLA CON LA CARACTERISTICA DE NO PERMITIR DUPLICADOS DEBO SOBREESCRIBIR 
        //EL METODOS HASHCODE Y EQUALS
        miColeccionSet.add(c5);
        miColeccionSet.add(c6);
        
        for(Cliente misClientes: miColeccionSet){
            System.out.println(misClientes.getNombre() + " " + misClientes.getNroCuenta());
            
        }
        
        System.out.println("\nVista de los datos a travez de un Iterador");
        
        Iterator<Cliente> it = miColeccionSet.iterator();
        
        while (it.hasNext()){
            
            System.out.println(it.next().getNombre());
        }
        
        //SI QUEREMOS HACER UNA ELIMINACION MIENTRAS VAMOS RECORRIENDO LA LISTA NO ES POSIBLE CON UN FOR
        //PARA ELLO NECESITAMOS HACER USO DE UN ITERATOR
        
        System.out.println("\nEliminacion del cliente 1:");
        
        Iterator<Cliente> itRemove = miColeccionSet.iterator();
        while (itRemove.hasNext()){
            
            String nombreCliente = itRemove.next().getNombre();
            if ("Adrian Wilgenhoff".equals(nombreCliente)){
                itRemove.remove();
                System.out.println("Cliente elminado\n");
            }
            
            
        }
        
         //EN LA CONSOLA LOS CLIENTES NO APARECEN EN EL ORDEN QUE FUERON INGRESADOS 
        for(Cliente misClientes: miColeccionSet){
             
            System.out.println(misClientes.getNombre() + " " + misClientes.getNroCuenta());
        }
          
        //EJEMPLO USANDO TREESET: ESTA LISTA INGRESA LOS DATOS ORDENADOS. SI EL TREESET ES DE UNA CLASE ESPECIFICA
        //DEBO SOBREEESCRIBIR EL METODO COMPARETO Y ESPECIFICAR BAJO QUÉ QUIEROO TENER ORDENADO EL TREESET
        //EN ESTE CASO QUIERO QUE ESTE ORDENADO POR NOMBRE DEL CLIENTE.POR LO QUE USO LA INTERFACE COMPATOR Y SOBREEESCRIBO EL METODO COMPARE
        
        Cliente clienteOrdenados = new Cliente();
        
        Set <Cliente> clientesTS = new TreeSet<>(clienteOrdenados);
        
        clientesTS.add(c1);
        clientesTS.add(c2);
        clientesTS.add(c3);
                
        System.out.println("\nTree Set Ejemplo:");
        for (Cliente misClientes : clientesTS) {
            
            System.out.println(misClientes.getNombre() + " " + misClientes.getNroCuenta());
            
        }
        
    }
    
}
