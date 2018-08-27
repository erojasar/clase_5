/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = lectura.nextInt();
        System.out.println("Ingrese la clave");
        int clave = lectura.nextInt();
        System.out.println("Ingrese dueno");
        String dueno = lectura.next();
        System.out.println("Saldo");
        double saldo = lectura.nextDouble();
        Clase_5 c1 = new Clase_5(cuenta,clave,dueno,saldo);
        c1.cambiarClave(1234);
        c1.consignar(1);
        System.out.println("saldo" + c1.consultarSaldo());
        c1.consignar(99999);
        System.out.println("saldo" + c1.consultarSaldo());        
        
        
        /*
        Clase_5.global=50;
        Clase_5 cuenta = new Clase_5(1,123,"f",100);
        System.out.println("Numero" + cuenta.getNumero());
        System.out.println("Numero" + cuenta.getClave());
        System.out.println("Numero" + cuenta.getDueno());
        System.out.println("Numero" + cuenta.getSaldo());
        System.out.println("Global" + Clase_5.global);
        cuenta.setClave(56878);
        System.out.println("Numero" + cuenta.getClave());
        
        Clase_5 magdalena = new Clase_5(1012,1234,"Magdalena Sánchez",0);
        System.out.println("Numero" + cuenta.getNumero());
        System.out.println("Numero" + cuenta.getClave());
        System.out.println("Numero" + cuenta.getDueno());
        System.out.println("Numero" + cuenta.getSaldo());
        */

    }

}
