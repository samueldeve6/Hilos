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
public class ProcesarHilo2 extends JTextArea implements Runnable{
String mensaje;
@Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(20, 250, 300, 200); //To change body of generated methods, choose Tools | Templates.
    }
  public ProcesarHilo2(String mensaje) {
  this.mensaje=mensaje;
  this.setVisible(true);
}
  
       @Override
       public void run(){
       ArrayList<Integer> array = new ArrayList<Integer>();
       array.add(1);
       array.add(2);
       array.add(3);
       array.add(4);
       array.add(5);
       Iterator<Integer> it = array.iterator();
       while(it.hasNext()){
         int value = it.next();
         append(mensaje+" "+value+"\n"+"El proceso de pago:"+" "+value+" esta en curso\n");
         //Mostramos un aviso de que el hilo se termino de procesar
         
           try {
                Thread.sleep(4000);
           } catch (Exception e) {
               e.printStackTrace();
           }
      }
       append("------------------------------------------");
  }  
}
