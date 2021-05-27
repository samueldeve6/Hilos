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
public class ProcesarHilo3 extends JTextArea implements Runnable{
String mensaje;
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(20, 480, 300, 200); //To change body of generated methods, choose Tools | Templates.
    }
  public ProcesarHilo3(String mensaje) {
  this.mensaje=mensaje;
}
  
       @Override
       public void run(){
       ArrayList<Integer> marray = new ArrayList<Integer>();
       marray.add(1);
       marray.add(2);
       marray.add(3);
       marray.add(4);
       marray.add(5);
       Iterator<Integer> iterat = marray.iterator();
       while(iterat.hasNext()){
         int valuue = iterat.next();
         append(mensaje+" "+valuue+"\n"+"El proceso de pago:"+" "+valuue+" finalizo\n");
         //Mostramos un aviso de que el hilo se termino de procesar
           try {
               Thread.sleep(4200);
           } catch (Exception e) {
               e.printStackTrace();
           }
         
      }
       append("------------------------------------------");
  }  
}