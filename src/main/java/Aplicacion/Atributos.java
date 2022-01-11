/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import javax.swing.JOptionPane;

//javier12
public class Atributos {

    //atributos
    // private hace que otros elementos de otras clases no puedan acceder  a esta 
    private String propietario;
    private double valorcomercial;
    private String color;
    private String placa;
    private String matriculado;
    private int aniofabricacion;
    // metodos 

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(double valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    

    // creamos un costructor 
    // inicialisamos la instancia de una clase 
    // para nombrar al constructor nesesito ponerle el mismo nombre de la clase 
    public Atributos() {
        // puedo establecer funciones 
        JOptionPane.showInternalMessageDialog(null, " DATOS DEL VEHICULO SON ");
    }
    // sobre carcarga de metodos 

    public Atributos(String propietario) {
        this.propietario = propietario;
        JOptionPane.showInternalMessageDialog(null, "Hola " + getPropietario());
    }
     public String calcularAnio(){
         // siempre la priemra letra siempre debe de ir en minisculas y la otra en mayusculas por estandares
         double anioActual = 2021-aniofabricacion ;
         if (anioActual >=5){
             return"No debe de Presentarse a Revision  ";
            
         }else {
             return "No debe de`presentarse a la Revision";
               
         }
     }
  

    public String datos() {
        String informacion = "Informacion del Vehiculo \n" // contatenar
                + "Propietario: " + propietario + "\n"
                + "Valor Comercial: " + valorcomercial + "\n"
                + "Color: " + color + "\n"
                + "Placa: " + placa + "\n"
                +"Matriculado: " + matriculado + "\n"
                +"Anio Fabricacion: " + aniofabricacion + "\n";

        // con el mas se concatena 
        return informacion;
    }
}
    
