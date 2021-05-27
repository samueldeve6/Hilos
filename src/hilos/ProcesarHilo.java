/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextArea;


/**
 *
 * @author Usuario
 */
public class ProcesarHilo extends JTextArea implements Runnable{
String mensaje;
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(20, 20, 300, 200); //To change body of generated methods, choose Tools | Templates.
    }
  public ProcesarHilo(String mensaje) {
  super();
  this.mensaje=mensaje;
  this.setVisible(true);
}
  
       @Override
       public void run(){
       ArrayList<Integer> miarray = new ArrayList<>();
       miarray.add(1);
       miarray.add(2);
       miarray.add(3);
       miarray.add(4);
       miarray.add(5);
       Iterator<Integer> ite = miarray.iterator();
       while(ite.hasNext()){
         int valuee = ite.next();
   
         append(mensaje+" "+valuee+"\n"+"El proceso de pago:"+" "+valuee+" empezo\n");
         //Mostramos un aviso de que el hilo se termino de procesar
           try {
               Thread.sleep(4000);
           } catch (Exception e) {
             e.printStackTrace();
           }
      }append("------------------------------------------"); 
      
  }  
}
