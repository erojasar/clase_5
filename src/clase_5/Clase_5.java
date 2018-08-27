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
public class Clase_5 {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    
    public Clase_5(int numero, int clave, String dueno, double saldo){
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
        
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean consignar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean retirar(double valor){
        if(valor < saldo && valor > 0){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cambiarClave(int clave){
        this.clave = clave;
        return true;
    }
    
    public double consultarSaldo(){
        return this.saldo;
    } 
}
