/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen3;

/**
 *
 * @author andro
 */
public class nodo {
    
 int salario=0;
 int anio=0;
 String puesto="";
        nodo izq=null ;
        nodo der=null;   
        
        public nodo (int salario,String puesto,int anio){
        this.salario=salario;
        this.anio=anio;
        this.puesto=puesto;
        }
        public Object getinformacion(){
        return salario;
        }
}
