package com.mycompany.examen3;

import javax.swing.JOptionPane;

public class arbol {
    nodo  raiz=null;
nodo temporal= null;
int peso=0;
String arbolCompleto="";
//metodo que inserta un nodo en el arbol con los datos de salario, puesto y año
public void insertarnodo (int salario,String puesto,int anio){
    
if (raiz==null){
raiz = new nodo (salario,puesto,anio);
this.peso++;
temporal=raiz;
}else{
if (salario<=temporal.salario){
if (temporal.izq==null){
    temporal.izq=new nodo(salario,puesto,anio);
    this.peso++;
    temporal=raiz;
}else{temporal=temporal.izq;
insertarnodo(salario,puesto,anio);
}
}else{
    if (temporal.der==null){
    temporal.der =new nodo(salario,puesto,anio);
    this.peso++;
    temporal=raiz;
}else{temporal=temporal.der;
insertarnodo(salario,puesto,anio);
    }
   }
  }

 }
//metodo que imprime inorden
public void imprimirInorden (nodo r ){
if (raiz==null){
JOptionPane.showMessageDialog(null, "Tu arbol esta vacio");

}else{
if (r!=null){
imprimirInorden (r.izq);
this.arbolCompleto=this.arbolCompleto+"[Puesto: "+r.puesto+" | Salario: "+ r.salario+" | Año: "+r.anio+"]\n";
imprimirInorden (r.der);
}
}
}



    
//metodo que imprime postorden
public void imprimirPostOrden (nodo r ){
if (raiz==null){
JOptionPane.showMessageDialog(null, "Tu arbol esta vacio");
}else{
if (r!=null){
imprimirPostOrden (r.izq);
imprimirPostOrden (r.der);
this.arbolCompleto=this.arbolCompleto+"[Puesto: "+r.puesto+" | Salario: "+ r.salario+" | Año: "+r.anio+"]\n";
}
}
}

//metodo que imprime preorden
public void imprimirPreOrden (nodo r ){
if (raiz==null){
JOptionPane.showMessageDialog(null, "Tu arbol esta vacio");
}else{
if (r!=null){
this.arbolCompleto=this.arbolCompleto+"[Puesto: "+r.puesto+" | Salario: "+ r.salario+" | Año: "+r.anio+"]\n";
    imprimirPreOrden (r.izq);
imprimirPreOrden (r.der);
}
}
}  
//metodo que da la altura del arbol
public int altura(nodo r)
{
       if (r == null)
       {
           return 0;
       }
       else
       {
           return 1 +
           Math.max(altura(r.izq),
               altura(r.der));
       }
}

//metodo que elimina el arbol

public void borrar(nodo r){
    this.raiz=null;   
    this.peso=0;
    JOptionPane.showMessageDialog(null,"Arbol borrado");                   
}
//metodo que regresa el peso del arbol
public int obtenerPeso(){
    return this.peso;
}
}


