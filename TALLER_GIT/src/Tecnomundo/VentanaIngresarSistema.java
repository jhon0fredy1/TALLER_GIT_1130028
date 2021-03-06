package Tecnomundo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milton
 */
public class VentanaIngresarSistema extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form NewJFrame
     */
    public VentanaIngresarSistema() {
        initComponents();
        setControlador();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void setControlador(){
        botonInicio.addActionListener(this);
        botonSalir.addActionListener(this);
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInicio = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        textLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        textContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonInicio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonInicio.setText("Iniciar Sesión");

        botonSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonSalir.setText("Salir");

        textLogin.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelLogin.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(51, 102, 255));
        labelLogin.setText("Login:");

        labelPass.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(0, 102, 255));
        labelPass.setText("Contraseña:");

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setText("INGRESO AL SISTEMA");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoTecnomundo.png"))); // NOI18N

        textContraseña.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitulo)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPass)
                            .addComponent(labelLogin)
                            .addComponent(botonInicio))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(botonSalir))
                            .addComponent(textContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPass)
                    .addComponent(textContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInicio)
                    .addComponent(botonSalir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Salir")){
            
            System.exit(0);
        }
        
        if(ae.getActionCommand().equals("Iniciar Sesión")){
               
            VentanaVendedor ventanaAdmin = new VentanaVendedor(this);
            ventanaAdmin.setVisible(true);
            ventanaAdmin.setLocationRelativeTo(this);
            this.dispose();
           
        }
        
    }
}
