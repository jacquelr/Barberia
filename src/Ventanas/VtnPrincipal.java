/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Barbero;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author jacqueline
 */
public class VtnPrincipal extends javax.swing.JFrame {
    VtnAuxiliar objVtnAuxiliar = null;
    int numeroBarberos;
    LinkedList queue = new LinkedList();
    Barbero barbero1,barbero2,barbero3,barbero4,barbero5;
    
    /**
     * Creates new form VtnPrincipal
     */
    public VtnPrincipal() {
        initComponents();
    }
    
    public VtnPrincipal(VtnAuxiliar objVtnAuxiliar, int numeroBarberos ) {
        initComponents();
        this.objVtnAuxiliar = objVtnAuxiliar;
        this.numeroBarberos = numeroBarberos;
        lblPrueba.setText(String.valueOf(numeroBarberos));
        
        barbero1 = new Barbero(0);
        barbero2 = new Barbero(0);
        barbero3 = new Barbero(0);
        barbero4 = new Barbero(0);
        barbero5 = new Barbero(0);
        
        lblBarbero1.setVisible(false);
        lblBarbero2.setVisible(false);
        lblBarbero3.setVisible(false);
        lblBarbero4.setVisible(false);
        lblBarbero5.setVisible(false);
        
        imgBarbero1.setVisible(false);
        imgBarbero2.setVisible(false);
        imgBarbero3.setVisible(false);
        imgBarbero4.setVisible(false);
        imgBarbero5.setVisible(false);
        
        clienteB1.setVisible(false);
        clienteB2.setVisible(false);
        clienteB3.setVisible(false);
        clienteB4.setVisible(false);
        clienteB5.setVisible(false);
        
        buildBarberia();
    }

    public void buildBarberia(){
        switch (numeroBarberos){
            case 1: 
                barbero1.setEstado(1);
                lblBarbero1.setVisible(true);
                imgBarbero1.setVisible(true);
                clienteB1.setVisible(true);
                break;
            case 2:
                barbero1.setEstado(1);
                barbero2.setEstado(1);
                
                lblBarbero1.setVisible(true);
                lblBarbero2.setVisible(true);
                
                imgBarbero1.setVisible(true);
                imgBarbero2.setVisible(true);
                
                clienteB1.setVisible(true);
                clienteB2.setVisible(true);
                break;
            case 3:
                barbero1.setEstado(1);
                barbero2.setEstado(1);
                barbero3.setEstado(1);
                
                lblBarbero1.setVisible(true);
                lblBarbero2.setVisible(true);
                lblBarbero3.setVisible(true);
                
                imgBarbero1.setVisible(true);
                imgBarbero2.setVisible(true);
                imgBarbero3.setVisible(true);
                
                clienteB1.setVisible(true);
                clienteB2.setVisible(true);
                clienteB3.setVisible(true);
                break;
            case 4:
                barbero1.setEstado(1);
                barbero2.setEstado(1);
                barbero3.setEstado(1);
                barbero4.setEstado(1);
                
                lblBarbero1.setVisible(true);
                lblBarbero2.setVisible(true);
                lblBarbero3.setVisible(true);
                lblBarbero4.setVisible(true);
                
                imgBarbero1.setVisible(true);
                imgBarbero2.setVisible(true);
                imgBarbero3.setVisible(true);
                imgBarbero4.setVisible(true);
                
                clienteB1.setVisible(true);
                clienteB2.setVisible(true);
                clienteB3.setVisible(true);
                clienteB4.setVisible(true);
                break;
            case 5:
                barbero1.setEstado(1);
                barbero2.setEstado(1);
                barbero3.setEstado(1);
                barbero4.setEstado(1);
                barbero5.setEstado(1);
                
                lblBarbero1.setVisible(true);
                lblBarbero2.setVisible(true);
                lblBarbero3.setVisible(true);
                lblBarbero4.setVisible(true);
                lblBarbero5.setVisible(true);
                
                imgBarbero1.setVisible(true);
                imgBarbero2.setVisible(true);
                imgBarbero3.setVisible(true);
                imgBarbero4.setVisible(true);
                imgBarbero5.setVisible(true);
                     
                clienteB1.setVisible(true);
                clienteB2.setVisible(true);
                clienteB3.setVisible(true);
                clienteB4.setVisible(true);
                clienteB5.setVisible(true);
                break;
            default: System.out.println("error al iniciar barbería");
        }
    }
    
    public void agregarCliente(){
        int numero = (int)(Math.random()*5);
        queue.add(numero);
        System.out.println(queue);
    }
    
    public void revisarDisponibilidad(){
        if (!queue.isEmpty()) {
            if (barbero1.getEstado() != 0) {
                barbero1.setEstado(0);
                int cliente = (int) queue.pop();
                //MARACR EN SILLA
                AtenderCliente atender = new AtenderCliente(cliente, barbero1, clienteB1);
                atender.start();
                System.out.println("AL CLIENTE: "+cliente+" lo antendio el 1");
                //barberos[1].setEstado(1);
            } else if (barbero2.getEstado() != 0) {
                barbero2.setEstado(0);
                int cliente = (int) queue.pop();
                //MARACR EN SILLA
                AtenderCliente atender = new AtenderCliente(cliente, barbero2,clienteB2);
                atender.start();
                System.out.println("AL CLIENTE: "+cliente+" lo antendio el 2");
                //barberos[2].setEstado(1);
            } else if (barbero3.getEstado() != 0) {
                barbero3.setEstado(0);
                int cliente = (int) queue.pop();
                //MARACR EN SILLA
                AtenderCliente atender = new AtenderCliente(cliente,barbero3,clienteB2);
                atender.start();
                System.out.println("AL CLIENTE: "+cliente+" lo antendio el 3");
            } else if (barbero4.getEstado() != 0) {
                barbero4.setEstado(0);
                int cliente = (int) queue.pop();
                //MARACR EN SILLA
                AtenderCliente atender = new AtenderCliente(cliente, barbero4,clienteB3);
                atender.start();
                System.out.println("AL CLIENTE: "+cliente+" lo antendio el 4");
                //barberos[2].setEstado(1);
            } else if(barbero5.getEstado() != 0) {
                barbero5.setEstado(0);
                int cliente = (int) queue.pop();
                //MARACR EN SILLA
                AtenderCliente atender = new AtenderCliente(cliente,barbero5,clienteB3);
                atender.start();
                System.out.println("AL CLIENTE: "+cliente+" lo antendio el 5");
            } else {
                System.out.print(".");
            }

        } else {
            System.out.println("no hay clientes");
        }   
    }
    
    public class AtenderCliente extends Thread {

        //int rand = (int) Math.random() * 50 + 25;
        //JProgressBar barra;
        Barbero barbero;
        int cliente;
        javax.swing.JLabel tiempoCliente;
        
        public AtenderCliente(int cliente, Barbero barbero, javax.swing.JLabel tiempoCliente) {
            this.cliente = cliente;
            this.barbero = barbero;
            this.tiempoCliente = tiempoCliente;
        }

        @Override
        public void run() {
            for (int i = 1; i <= cliente; i++) {
                try {
                    tiempoCliente.setText("Cliente: "+ cliente + "  00:0"+i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("ERROR 111");
                }
                //barra.setValue(i);
            }
            /*boolean aux = true;
            while (aux) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("ERROR 222");
                }
                try {
                    mutex.acquire();
                } catch (InterruptedException ex) {
                    System.out.println("ERROR 222");
                }
                if (verificacionCobro == 0) {
                    CobrarCliente cobrar = new CobrarCliente(barbero);
                    cobrar.start();
                    aux = false;
                }
                mutex.release();
            }*/
            System.out.println("borra cliente");
            barbero.setEstado(1);
            revisarDisponibilidad();
            mostrarCola.setText(queue.toString());
            //barbero.getPanel().remove(barbero.getCliente().getLable());
            //barbero.getPanel().repaint();
            //barra.setValue(0);

        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrueba = new javax.swing.JLabel();
        lblBarbero1 = new javax.swing.JLabel();
        lblBarbero2 = new javax.swing.JLabel();
        lblBarbero3 = new javax.swing.JLabel();
        lblBarbero4 = new javax.swing.JLabel();
        lblBarbero5 = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        imgBarbero1 = new javax.swing.JLabel();
        imgBarbero2 = new javax.swing.JLabel();
        imgBarbero3 = new javax.swing.JLabel();
        imgBarbero4 = new javax.swing.JLabel();
        imgBarbero5 = new javax.swing.JLabel();
        lblCuantosBarberos = new javax.swing.JLabel();
        clienteB1 = new javax.swing.JLabel();
        clienteB2 = new javax.swing.JLabel();
        clienteB3 = new javax.swing.JLabel();
        clienteB4 = new javax.swing.JLabel();
        clienteB5 = new javax.swing.JLabel();
        lblCola = new javax.swing.JLabel();
        mostrarCola = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPrueba.setText("00");

        lblBarbero1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBarbero1.setText("BARBERO 1");

        lblBarbero2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBarbero2.setText("BARBERO 2");

        lblBarbero3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBarbero3.setText("BARBERO 3");

        lblBarbero4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBarbero4.setText("BARBERO 4");

        lblBarbero5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBarbero5.setText("BARBERO 5");

        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        imgBarbero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barbero.jpg"))); // NOI18N

        imgBarbero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barbero.jpg"))); // NOI18N

        imgBarbero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barbero.jpg"))); // NOI18N

        imgBarbero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barbero.jpg"))); // NOI18N

        imgBarbero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barbero.jpg"))); // NOI18N

        lblCuantosBarberos.setText("El número de barberos es: ");

        clienteB1.setText("00:00");

        clienteB2.setText("00:00");

        clienteB3.setText("00:00");

        clienteB4.setText("00:00");

        clienteB5.setText("00:00");

        lblCola.setText("COLA:");

        mostrarCola.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clienteB1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clienteB3)
                                    .addComponent(clienteB2)
                                    .addComponent(clienteB4)
                                    .addComponent(clienteB5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCola)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCuantosBarberos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrueba))
                            .addComponent(mostrarCola))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBarbero5)
                    .addComponent(imgBarbero4)
                    .addComponent(imgBarbero3)
                    .addComponent(imgBarbero2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgBarbero1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblBarbero1)
                            .addGap(9, 9, 9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBarbero4)
                            .addComponent(lblBarbero3)
                            .addComponent(lblBarbero2)
                            .addComponent(lblBarbero5))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBarbero1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgBarbero1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(clienteB1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBarbero2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgBarbero2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(clienteB2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCuantosBarberos)
                            .addComponent(lblPrueba))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCola)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBarbero3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgBarbero3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(clienteB3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(mostrarCola)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarbero4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgBarbero4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(clienteB4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarbero5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgBarbero5)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clienteB5)
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        mostrarCola.setText(queue.toString());
        if (queue.size() <= 10){
            agregarCliente();
            System.out.println(queue);
            revisarDisponibilidad();
        }
        else{
            System.out.println("Llama más temprano");
            JOptionPane.showMessageDialog(this, "Vuelva otro día");
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JLabel clienteB1;
    private javax.swing.JLabel clienteB2;
    private javax.swing.JLabel clienteB3;
    private javax.swing.JLabel clienteB4;
    private javax.swing.JLabel clienteB5;
    private javax.swing.JLabel imgBarbero1;
    private javax.swing.JLabel imgBarbero2;
    private javax.swing.JLabel imgBarbero3;
    private javax.swing.JLabel imgBarbero4;
    private javax.swing.JLabel imgBarbero5;
    private javax.swing.JLabel lblBarbero1;
    private javax.swing.JLabel lblBarbero2;
    private javax.swing.JLabel lblBarbero3;
    private javax.swing.JLabel lblBarbero4;
    private javax.swing.JLabel lblBarbero5;
    private javax.swing.JLabel lblCola;
    private javax.swing.JLabel lblCuantosBarberos;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel mostrarCola;
    // End of variables declaration//GEN-END:variables
}
