/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import manejador.ManejadorEstudiante;
import manejador.ManejadorProduccion;
import manejador.ManejadorProductos;
import modelo.Alternante;
import modelo.Binario;
import modelo.Crapulo;
import modelo.Estudiante;
import modelo.Exponente;
import modelo.MultiplicacionRusa;
import modelo.Newton;
import modelo.NumeroAmigable;
import modelo.Trabajador;

/**
 *
 * @author jake
 */
public class Menu {
        
    private int decision;
    private ManejadorEstudiante manejadorEstudiante;
    private ManejadorProduccion manejadorProduccion;
    private ManejadorProductos manejadorProductos;
    
    private Crapulo crapulo;
    private Alternante alternante;
    private Newton newton;
    private Exponente exponente;
    private Binario binario;
    private MultiplicacionRusa multiplicacionRusa;
    private NumeroAmigable numeroAmigable;
    
    
    public Menu() {        
        manejadorEstudiante = new ManejadorEstudiante();
        manejadorProduccion = new ManejadorProduccion();
        manejadorProductos = new ManejadorProductos();
        crapulo = new Crapulo();
        alternante = new Alternante();
        newton = new Newton();
        exponente = new Exponente();
        binario = new Binario();
        multiplicacionRusa = new MultiplicacionRusa();
        numeroAmigable = new NumeroAmigable();
    }
        
    public void mostrarInformacion() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hoja 5");
        
        System.out.println("23) Notas de N alumnos");
        System.out.println("24) Polinomio");
        System.out.println("25) Costos de produccion");
        System.out.println("26) Gancia sobre productos");
        
        System.out.println("Hoja 6");
        System.out.println("27) 1: Crapulo de un numero");
        System.out.println("28) 2: Alternante");
        System.out.println("29) 3: Algoritmo de newton");
        System.out.println("30) 4: Exponente");
        System.out.println("31) 5: Binario a decimal");
        System.out.println("32) 6: Multiplicacion Rusa");
        System.out.println("33) 7: Comprobar par de numeros amigables");
        
        decision = scanner.nextInt();        
        opcion(decision);
    }
    
    public void opcion(int decision) {
        
        if(decision == 23) {            
            manejadorEstudiante.agregarEstudiantes();
            manejadorEstudiante.mostarListaOrdenada();            
        }
        
        if(decision == 25) {
            manejadorProduccion.agregarProductos();
            manejadorProduccion.listaProductos();
        }
        
        if(decision == 26) {
            manejadorProductos.agregarProductos();
            manejadorProductos.inversion();
            manejadorProductos.reporte();
        }
        
        if(decision == 27) {
            calcularCrapulo();     
        }
        
        if(decision == 28) {
            esAlternante();
        }
        
        if(decision == 29) {
            algoritmoDeNewton();
        }
        
        if(decision == 30) {
            exponenteDelNumero();
        }
        
        if(decision == 31) {
            binarioADecimal();
        }
        
        if(decision == 32) {
            multiplicacionRusa();
        }        
        
        if(decision == 33) {
            numeroAmigable();
        }        
        
    }
    
    public void calcularCrapulo() {
        
        int numeroTemporal;
        numeroTemporal = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular");
        crapulo.setNumero(scanner.nextInt());       
        
        System.out.println("El crapulo es: " + crapulo.calcularCrapulo(numeroTemporal));
    }
 
    public void esAlternante() {
        
        int valorTemporal;        
        valorTemporal = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a validar");
        alternante.setAlternante(scanner.nextInt());
        
        System.out.println("El crapulo es: " + alternante.esAlternante());
    }
    
    public void algoritmoDeNewton() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial");
        newton.setValorInicial(scanner.nextDouble());
        
        System.out.println("El valor es: " + newton.calcularRaiz());        
    }
    
    public void exponenteDelNumero() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor x");
        exponente.setNumeroExponente(scanner.nextInt());
        
        System.out.println(exponente.myexp(1., 100));
    }
    
    public void binarioADecimal() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor en binario");
        binario.setBinario(scanner.next());
        
        System.out.println("El resultado es: " + binario.calcularDecimal());
    }
    
    public void multiplicacionRusa() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del multiplicador");
        multiplicacionRusa.setMultiplicador(scanner.nextInt());
        System.out.println("Ingrese el valor del multiplicando");
        multiplicacionRusa.setMultiplicando(scanner.nextInt());
        
        System.out.println("El valor es: " + multiplicacionRusa.Multiplicacion_Rusa());
    }
    
    public void numeroAmigable() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        numeroAmigable.setPrimerNumero(scanner.nextInt());        
        System.out.println("Ingrese el segundo valor");
        numeroAmigable.setSegundoNumero(scanner.nextInt());
        
        System.out.println("El resultado es: " + numeroAmigable.comprobarPar());
    }
}
