/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Productos;

/**
 *
 * @author jake
 */
public class ManejadorProductos {
    
    private List<Productos> listaProductos;
    private Productos productos;

    public ManejadorProductos() {
        listaProductos = new ArrayList<Productos>();
        productos = new Productos();
    }
    
    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
        
    public void agregarProductos() {
        for(int i=0; i < 3; i++) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre del producto " + i);
            productos.setNombre(scanner.next());
            
            System.out.println("Ingrese el costo del producto " + i);
            productos.setCosto(scanner.nextDouble());
            
            System.out.println("Ingrese las ventas del producto " + i);
            productos.setVentas(scanner.nextDouble());
            
            System.out.println("Ingrese las unidades del producto " + i);
            productos.setUnidades(scanner.nextDouble());
            
            listaProductos.add(productos);
        }
    }    
    
    public void inversion() {
        
        for(Productos productos: listaProductos) {
            System.out.println("La inversion fue de: " + productos.montoInvertido());
        }
        
    }
    
    public void reporte() {
        for(Productos productos: listaProductos) {
            System.out.println("Ventas" + productos.getVentas());
            System.out.println("Costo" + productos.getCosto());
            System.out.println("Ganancia" + productos.gananciaPorProductos());
        }
    }
}
