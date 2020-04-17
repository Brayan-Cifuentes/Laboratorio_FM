/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film_Magic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Langas
 */
public class Mantenimiento_Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registro_Empleado
     */
    public Mantenimiento_Empleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Estado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Genero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_DPI = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Codigo Empleado");

        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Empleado");

        txt_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EstadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido Empleado");

        txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono Empleado");

        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Correo Empleado");

        txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoActionPerformed(evt);
            }
        });

        jLabel6.setText("Genero Empleado");

        txt_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado Empleado");

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        jLabel8.setText("DPI Empleado");

        txt_DPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DPIActionPerformed(evt);
            }
        });

        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingrese Codigo Empleado");

        txt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarActionPerformed(evt);
            }
        });

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Buscar)
                        .addGap(174, 174, 174))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Correo)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addComponent(txt_Telefono)
                                .addComponent(txt_Apellido)
                                .addComponent(txt_Codigo))
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Estado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_DPI))
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_Registrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Modificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_Eliminar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)))
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Registrar)
                        .addComponent(jButton_Modificar)
                        .addComponent(jButton_Eliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

    private void txt_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EstadoActionPerformed

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoActionPerformed

    private void txt_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_DPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DPIActionPerformed

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        try        
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic","root","admin");
            PreparedStatement pst = cn.prepareStatement("insert into Empleado values(?,?,?,?,?,?,?,?)");
            
            pst.setString(1, txt_Codigo.getText().trim());
            pst.setString(2, txt_DPI.getText().trim());
            pst.setString(3, txt_Nombre.getText().trim());
            pst.setString(4, txt_Apellido.getText().trim());
            pst.setString(5, txt_Telefono.getText().trim());
            pst.setString(6, txt_Correo.getText().trim());
            pst.setString(7, txt_Genero.getText().trim());
            pst.setString(8, txt_Estado.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo.setText("");
            txt_Nombre.setText("");
            txt_Apellido.setText("");
            txt_Telefono.setText("");
            txt_Correo.setText("");
            txt_Genero.setText("");
            txt_Estado.setText("");
            txt_DPI.setText("");
            label_status.setText("Registrado.");
            
        }catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void txt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        // TODO add your handling code here:
        
                try {
            String ID = txt_Buscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
            PreparedStatement pst = cn.prepareStatement("update Empleado set Codigo_Empleado = ?,DPI_Empleado = ?, Nombre_Empleado = ?,Apellido_Empleado = ?,Telefono_Empleado = ?,Correo_Empleado = ?,Genero_Empleado =?,Estado_Empleado =? where Codigo_Empleado = " + ID);
            
            pst.setString(1, txt_Codigo.getText().trim());
            pst.setString(2, txt_DPI.getText().trim());
            pst.setString(3, txt_Nombre.getText().trim());
            pst.setString(4, txt_Apellido.getText().trim());
            pst.setString(5, txt_Telefono.getText().trim());
            pst.setString(6, txt_Correo.getText().trim());
            pst.setString(7, txt_Genero.getText().trim());
            pst.setString(8, txt_Estado.getText().trim());
            pst.executeUpdate();
            
            label_status.setText("Modificación exitosa.");
            
        } catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
            PreparedStatement pst = cn.prepareStatement("select * from Empleado where Codigo_Empleado = ?");
            pst.setString(1, txt_Buscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                txt_Codigo.setText(rs.getString("Codigo_Empleado"));
                txt_DPI.setText(rs.getString("DPI_Empleado"));
                txt_Nombre.setText(rs.getString("Nombre_Empleado"));
                txt_Apellido.setText(rs.getString("Apellido_Empleado"));
                txt_Telefono.setText(rs.getString("Telefono_Empleado"));
                txt_Correo.setText(rs.getString("Correo_Empleado"));
                txt_Genero.setText(rs.getString("Genero_Empleado"));
                txt_Estado.setText(rs.getString("Estado_Empleado"));
            } else 
            {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
            PreparedStatement pst = cn.prepareStatement("delete from Empleado where Codigo_Empleado = ?");
            
            pst.setString(1, txt_Buscar.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo.setText("");
            txt_DPI.setText("");
            txt_Nombre.setText("");
            txt_Apellido.setText("");
            txt_Telefono.setText("");
            txt_Correo.setText("");
            txt_Genero.setText("");
            txt_Estado.setText("");
            
            label_status.setText("Registro eliminado.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_DPI;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JTextField txt_Genero;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
