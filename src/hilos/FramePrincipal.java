/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class FramePrincipal extends JFrame {
    ProcesarHilo hilo1;
    ProcesarHilo2 hilo2;
    ProcesarHilo3 hilo3;
    public FramePrincipal(){
        this.setSize(400, 800);
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void initComponents(){
         this.setLayout(new FlowLayout());
         hilo1 = new ProcesarHilo("El proceso de pago esta iniciando en la caja");
         hilo2 = new ProcesarHilo2("Esta realizando el pago el cliente");
         hilo3 = new ProcesarHilo3("El proceso de pago esta finalizando");
         this.add(hilo1);
         this.add(hilo2);
         this.add(hilo3);
         Thread h1 = new Thread(hilo1);
         Thread h2 = new Thread(hilo2);
         Thread h3 = new Thread(hilo3);
         h1.start();
        try {
               Thread.sleep(1000);
           } catch (Exception e) {
               
           }
        h2.start();
        try {
               Thread.sleep(1000);
           } catch (Exception e) {
               
           }
        h3.start();
        try {
               Thread.sleep(1000);
           } catch (Exception e) {
               
           }
    }
    
}
