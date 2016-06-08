/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
/**
 *
 * @author llasu
 */
public class AlmacenamientoEstudiante {
    private ArrayList<Estudiante> array;

    public AlmacenamientoEstudiante() {
        array = new ArrayList<Estudiante>() ;
    }
    
    public boolean Agregar(Estudiante estu){
        boolean seAgrego= false;
        if(!verificarEstu(estu.getCarnet())){
            array.add(estu);
            seAgrego=true;
           }
       
       return seAgrego; 
    }
    public boolean verificarEstu(String carnet){
        boolean existe= false;
        for(int i =0;i<array.size();i++){
            if(array.get(i).getCarnet().equals(carnet)){
                existe = true;
                i=array.size();
            }
        }
        return existe;
    }
    public boolean eliminar(String carnet){
        boolean delete=false;
        for(int i =0;i<array.size();i++){
            if(array.get(i).getCarnet().equals(carnet)){
                array.remove(i);
                i=array.size();
                delete=true; 
            }
        }
       return delete; 
    }
    public String getInfo(int i){
        return array.get(i).getInformacion();
    }
    public Estudiante getEstudiante(int posicion){
        return array.get(posicion);
    } 
    

}
