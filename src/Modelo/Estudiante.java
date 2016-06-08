/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Estudiante {
    private String carnet;
    private String nombre;
    private String correo;

    
    public Estudiante(String carnet, String nombre, String correo) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Estudiante() {
    }

        public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getCarnet() {
        return carnet;
    }


 public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

     public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

  
     public String getInformacion(){
        return "Carnet "+getCarnet()+" Nombre "+getNombre()+" Correo "+getCorreo();
     }
}
