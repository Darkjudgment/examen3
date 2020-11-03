package com.mycompany.examen3;

import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {
         arbol obj= new arbol ();
 int op=0;
    obj.insertarnodo(10,"rana",1991);
    obj.insertarnodo(14,"juan",2008);
    obj.insertarnodo(3,"bneto",2017);
    obj.insertarnodo(11,"asa",2020);
    obj.insertarnodo(9,"no se",32);
    obj.insertarnodo(2,"ivnonee",354);
    obj.insertarnodo(5,"vere",41);
    obj.insertarnodo(12,"andale",120); 
    
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Elije una opción:\n1._Insertar\n2._Inorden\n3._Preorden\n4._Posorden\n5._Borrar\n6._Pesar\n7._Altura\n8._Salir"));            
            switch (op) {
                case 1:
                    String puesto=JOptionPane.showInputDialog("Escribe tu puesto");
                    int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu sueldo"));
                    int anio=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu año de contratación"));
                obj.insertarnodo(sueldo,puesto,anio);                 
                    break;
                    
                case 2:
                    obj.arbolCompleto="";
                     obj.imprimirInorden(obj.raiz );
                     if(obj.raiz!=null){
                     JOptionPane.showMessageDialog(null,"Recorrido Inorden:\n"+ obj.arbolCompleto);                        
                     }                     
                    break;
                case 3:
                    obj.arbolCompleto="";
                    obj.imprimirPreOrden(obj.raiz);
                    if(obj.raiz!=null){
                    JOptionPane.showMessageDialog(null,"Recorrido Preorden:\n"+ obj.arbolCompleto);                        
                    }                    
                    break;
                case 4:
                    obj.arbolCompleto="";
                    obj.imprimirPostOrden (obj.raiz);
                    if(obj.raiz!=null){
                    JOptionPane.showMessageDialog(null,"Recorrido Posorden:\n"+ obj.arbolCompleto);                        
                    }                    
                    break;
                case 5:
                    obj.borrar(obj.raiz);                         
                break;
                case 6:
                    JOptionPane.showMessageDialog(null,"El peso del arbol es: "+ obj.obtenerPeso());                    
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"La altura del arbol es: "+ obj.altura(obj.raiz));                    
                    break;                
                case 8:
                    JOptionPane.showMessageDialog(null,"Adios");
                    break;                    
                default:  
                    JOptionPane.showMessageDialog(null,"Opción no valida");
                    break;
                    
            }
        } while (op!=8);                       
    }
}
