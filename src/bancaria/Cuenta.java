/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancaria;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String dueño;
    public double saldo;
    
    public void consignar(double dinero){
    this.saldo= this.saldo+ dinero;
    }
    
    public void retirar(double retirar){
    this.saldo= this.saldo - dinero;
    }
    
    public void cambioclave(String nuevaclave){
    this.clave =  nuevaclave;
    }
    
    public void consultasaldo(){
        System.out.println("El saldo es " + this.saldo);
    }
}
