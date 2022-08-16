/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mygym.presentacion.pages;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import mygym.presentacion.enums.SideBarContent;
import mygym.presentacion.enums.PAGE;

/**
 *
 * @author maximilianooliverasilva
 */
public final class Dashboard extends javax.swing.JFrame {
    
    SideBarContent contentController = new SideBarContent();
    /**
     * Creates new form Dashboard
     */
    
    JButton getButton() {
        PAGE activePage = contentController.getActivePage();
        JButton buttonToReturn;
        
        buttonInicio.setBackground(new Color(153, 153, 153));
        buttonInicio.setOpaque(true);
        buttonActividades.setBackground(new Color(153, 153, 153));
        buttonActividades.setOpaque(true);
        buttonCuponera.setBackground(new Color(153, 153, 153));
        buttonCuponera.setOpaque(true);
        buttonClases.setBackground(new Color(153, 153, 153));
        buttonClases.setOpaque(true);
        buttonInstitucion.setBackground(new Color(153, 153, 153));
        buttonInstitucion.setOpaque(true);
        buttonUsuarios.setBackground(new Color(153, 153, 153));
        buttonUsuarios.setOpaque(true);
        switch (activePage) {
            case INICIO -> buttonToReturn = buttonInicio;
            case ACTIVIDAD -> buttonToReturn = buttonActividades;
            case CUPONERA -> buttonToReturn = buttonCuponera;
            case CLASE -> buttonToReturn = buttonClases;
            case INSTITUCION -> buttonToReturn = buttonInstitucion;
            case USUARIO -> buttonToReturn = buttonUsuarios;
            default -> throw new AssertionError();
        }
        buttonToReturn.setBackground(new Color(0, 204, 204));
        buttonToReturn.setOpaque(true);
        return buttonToReturn;
    }
    
    public Dashboard() {
        initComponents();
        colocatePage();
    }
    
    void colocatePage() {
      getButton();
      JPanel paneltoShow = contentController.getContentPanel();
      System.out.println(contentController.activePage);
      paneltoShow.setSize(525, 409);
      paneltoShow.setLocation(0,0);
      content.removeAll();
      content.add(paneltoShow, BorderLayout.CENTER);
      content.revalidate();
      content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonInicio = new javax.swing.JButton();
        buttonUsuarios = new javax.swing.JButton();
        buttonActividades = new javax.swing.JButton();
        buttonClases = new javax.swing.JButton();
        buttonCuponera = new javax.swing.JButton();
        buttonInstitucion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLocation(new java.awt.Point(50, 50));

        buttonInicio.setBackground(new java.awt.Color(0, 204, 204));
        buttonInicio.setForeground(new java.awt.Color(255, 255, 255));
        buttonInicio.setText("Inicio");
        buttonInicio.setBorder(null);
        buttonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInicioActionPerformed(evt);
            }
        });

        buttonUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        buttonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        buttonUsuarios.setText("Usuarios");
        buttonUsuarios.setBorder(null);
        buttonUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUsuariosActionPerformed(evt);
            }
        });

        buttonActividades.setBackground(new java.awt.Color(153, 153, 153));
        buttonActividades.setForeground(new java.awt.Color(255, 255, 255));
        buttonActividades.setText("Actividades");
        buttonActividades.setBorder(null);
        buttonActividades.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActividadesActionPerformed(evt);
            }
        });

        buttonClases.setBackground(new java.awt.Color(153, 153, 153));
        buttonClases.setForeground(new java.awt.Color(255, 255, 255));
        buttonClases.setText("Clases");
        buttonClases.setBorder(null);
        buttonClases.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClasesActionPerformed(evt);
            }
        });

        buttonCuponera.setBackground(new java.awt.Color(153, 153, 153));
        buttonCuponera.setForeground(new java.awt.Color(255, 255, 255));
        buttonCuponera.setText("Cuponera");
        buttonCuponera.setBorder(null);
        buttonCuponera.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonCuponera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCuponeraActionPerformed(evt);
            }
        });

        buttonInstitucion.setBackground(new java.awt.Color(153, 153, 153));
        buttonInstitucion.setForeground(new java.awt.Color(255, 255, 255));
        buttonInstitucion.setText("Institucion");
        buttonInstitucion.setBorder(null);
        buttonInstitucion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstitucionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Shree Devanagari 714", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TUGym");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 255, 255)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonActividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(buttonClases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCuponera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInstitucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(buttonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonClases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCuponera, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        content.setPreferredSize(new java.awt.Dimension(415, 410));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsuariosActionPerformed
        contentController.setActivatePage(PAGE.USUARIO);    
        colocatePage();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUsuariosActionPerformed

    private void buttonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioActionPerformed
        contentController.setActivatePage(PAGE.INICIO);    
        colocatePage();
// TODO add your handling code here:
    }//GEN-LAST:event_buttonInicioActionPerformed

    private void buttonActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActividadesActionPerformed
        contentController.setActivatePage(PAGE.ACTIVIDAD);    
        colocatePage();     
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActividadesActionPerformed

    private void buttonClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClasesActionPerformed
        contentController.setActivatePage(PAGE.CLASE);    
        colocatePage();     
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClasesActionPerformed

    private void buttonCuponeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCuponeraActionPerformed
        contentController.setActivatePage(PAGE.CUPONERA);    
        colocatePage();     
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCuponeraActionPerformed

    private void buttonInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstitucionActionPerformed
        contentController.setActivatePage(PAGE.INSTITUCION);    
        colocatePage();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInstitucionActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActividades;
    private javax.swing.JButton buttonClases;
    private javax.swing.JButton buttonCuponera;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonInstitucion;
    private javax.swing.JButton buttonUsuarios;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
