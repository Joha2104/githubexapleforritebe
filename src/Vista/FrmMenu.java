package Vista;

import VistasCitas.AgregarCitas;
import VistaClientes.ModificarClientes;
import VistaClientes.AgregarClientes;
import VistaClientes.EliminarClientes;
import VistaUsuarios.AgregarUsuarios;
import VistaUsuarios.ModificarUsuarios;
import VistaUsuarios.EliminarUsuarios;
import VistaTecnicos.AgregarTecnico;
import BD.Conexion;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import VistasCitas.EliminarCitas;
import VistasCitas.JDialogBuscarCitas;
import VistaClientes.JDialogBuscarClientes;
import VistaTecnicos.CalcularSalario;
import VistaTecnicos.EliminarTecnico;
import VistaTecnicos.ModificarTecnico;
import VistaRevision.AgregarPruebas;

/**
 *
 * @author Esmeralda
 */
public class FrmMenu extends javax.swing.JFrame {

    private AgregarUsuarios agregarUsuarios;
    private ModificarUsuarios modificarUsuarios;
    private AgregarTecnico agregarOficiales;
    private static Conexion conexion = new Conexion();

    //FondoPanel fondo = new FondoPanel();

    public FrmMenu() {

        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        //this.setContentPane(fondo);

        conexion.Conectar();

        if (conexion.getConn() == null) {

            Frame f = JOptionPane.getFrameForComponent(null);
            JDialogConfiguracion jdconfig = new JDialogConfiguracion(f, true);
            jdconfig.setVisible(true);

            if (jdconfig.getConn() == null) {
                System.exit(0);
            }

        }

    }

    public static Conexion getConexion() {
        return conexion;
    }

    public void VerificarConexion() {
        //sino se logro conectar abre la ventana para configurar
        //si en la ventana de configurar no se logra conectar se cierra toda la aplicacion

        if (conexion.getConn() == null) {

            Frame f = JOptionPane.getFrameForComponent(null);
            JDialogConfiguracion jdconfig = new JDialogConfiguracion(f, true);
            jdconfig.setVisible(true);

            if (jdconfig.getConn() == null) {
                System.out.println("no se conecto jdiag conn");
                System.exit(0);
            } else {
                // si en la ventana configuracion se conecto, volvemos a realizar la conexion aquí 
                conexion.Conectar();

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuRegistar = new javax.swing.JMenu();
        jMenuItemAgregarUsuarios = new javax.swing.JMenuItem();
        jMenuItemModificarUsuarios = new javax.swing.JMenuItem();
        jMenuItemEliminarUsuarios = new javax.swing.JMenuItem();
        jMenuOficial = new javax.swing.JMenu();
        jMenuItemAgregarOficiales = new javax.swing.JMenuItem();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemCalcularSalario = new javax.swing.JMenuItem();
        jMenuItemEliminarOficiales = new javax.swing.JMenuItem();
        jMenuItemMostrarCitasOficiales = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAgregarClientes = new javax.swing.JMenuItem();
        jMenuItemModificarClientes = new javax.swing.JMenuItem();
        jMenuItemEliminarClientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAgregarCita = new javax.swing.JMenuItem();
        jMenuItemEliminarCitas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemAgregarPruebas = new javax.swing.JMenuItem();
        jmenu = new javax.swing.JMenu();
        jMenuItemAbrirConfiguracion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jMenuRegistar.setText("Usuarios");

        jMenuItemAgregarUsuarios.setText("Agregar");
        jMenuItemAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemAgregarUsuarios);

        jMenuItemModificarUsuarios.setText("Modificar");
        jMenuItemModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemModificarUsuarios);

        jMenuItemEliminarUsuarios.setText("Eliminar");
        jMenuItemEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarUsuariosActionPerformed(evt);
            }
        });
        jMenuRegistar.add(jMenuItemEliminarUsuarios);

        jMenuBar2.add(jMenuRegistar);

        jMenuOficial.setText("Tecnico");

        jMenuItemAgregarOficiales.setText("Agregar");
        jMenuItemAgregarOficiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarOficialesActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemAgregarOficiales);

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemModificar);

        jMenuItemCalcularSalario.setText("Calcular salario");
        jMenuItemCalcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCalcularSalarioActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemCalcularSalario);

        jMenuItemEliminarOficiales.setText("Eliminar");
        jMenuItemEliminarOficiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarOficialesActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemEliminarOficiales);

        jMenuItemMostrarCitasOficiales.setText("MostrarCitas");
        jMenuItemMostrarCitasOficiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMostrarCitasOficialesActionPerformed(evt);
            }
        });
        jMenuOficial.add(jMenuItemMostrarCitasOficiales);

        jMenuBar2.add(jMenuOficial);

        jMenu1.setText("Clientes");

        jMenuItemAgregarClientes.setText("Agregar");
        jMenuItemAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAgregarClientes);

        jMenuItemModificarClientes.setText("Modificar");
        jMenuItemModificarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemModificarClientes);

        jMenuItemEliminarClientes.setText("Eliminar");
        jMenuItemEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEliminarClientes);

        jMenuBar2.add(jMenu1);

        jMenu3.setText("Citas");

        jMenuItemAgregarCita.setText("Agregar");
        jMenuItemAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarCitaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAgregarCita);

        jMenuItemEliminarCitas.setText("Eliminar");
        jMenuItemEliminarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarCitasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemEliminarCitas);

        jMenuBar2.add(jMenu3);

        jMenu2.setText("Pruebas");

        MenuItemAgregarPruebas.setText("Agregar");
        MenuItemAgregarPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgregarPruebasActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemAgregarPruebas);

        jMenuBar2.add(jMenu2);

        jmenu.setText("Configuracion");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });

        jMenuItemAbrirConfiguracion.setText("Abrir");
        jMenuItemAbrirConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirConfiguracionActionPerformed(evt);
            }
        });
        jmenu.add(jMenuItemAbrirConfiguracion);

        jMenuBar2.add(jmenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAgregarOficialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarOficialesActionPerformed

        this.agregarOficiales = new AgregarTecnico();
        this.jDesktopPane1.add(this.agregarOficiales);
        agregarOficiales.setVisible(true);


    }//GEN-LAST:event_jMenuItemAgregarOficialesActionPerformed

    private void jMenuItemAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarUsuariosActionPerformed
        this.agregarUsuarios = new AgregarUsuarios();
        this.jDesktopPane1.add(this.agregarUsuarios);
        this.agregarUsuarios.setVisible(true);

    }//GEN-LAST:event_jMenuItemAgregarUsuariosActionPerformed

    private void jMenuItemModificarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarUsuariosActionPerformed
        this.modificarUsuarios = new ModificarUsuarios();
        this.jDesktopPane1.add(this.modificarUsuarios);
        this.modificarUsuarios.setVisible(true);


    }//GEN-LAST:event_jMenuItemModificarUsuariosActionPerformed

    private void jMenuItemEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarUsuariosActionPerformed
        EliminarUsuarios eliminarUsuarios = new EliminarUsuarios();
        this.jDesktopPane1.add(eliminarUsuarios);
        eliminarUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemEliminarUsuariosActionPerformed

    private void jMenuItemCalcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalcularSalarioActionPerformed
        CalcularSalario calcularSalario = new CalcularSalario();
        this.jDesktopPane1.add(calcularSalario);
        calcularSalario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCalcularSalarioActionPerformed

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_jmenuActionPerformed

    private void jMenuItemAbrirConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirConfiguracionActionPerformed
        Frame f = JOptionPane.getFrameForComponent(null);
        JDialogConfiguracion jdconfig = new JDialogConfiguracion(f, true);
        jdconfig.setVisible(true);
    }//GEN-LAST:event_jMenuItemAbrirConfiguracionActionPerformed

    private void jMenuItemAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarClientesActionPerformed
        AgregarClientes agregarClientes = new AgregarClientes();
        this.jDesktopPane1.add(agregarClientes);
        agregarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarClientesActionPerformed

    private void jMenuItemEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarClientesActionPerformed
        EliminarClientes eliminarClientes = new EliminarClientes();
        this.jDesktopPane1.add(eliminarClientes);
        eliminarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemEliminarClientesActionPerformed

    private void jMenuItemModificarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarClientesActionPerformed
        ModificarClientes modificarClientes = new ModificarClientes();
        this.jDesktopPane1.add(modificarClientes);
        modificarClientes.setVisible(true);

    }//GEN-LAST:event_jMenuItemModificarClientesActionPerformed

    private void jMenuItemAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarCitaActionPerformed
        AgregarCitas agregarCitas = new AgregarCitas();
        this.jDesktopPane1.add(agregarCitas);
        agregarCitas.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarCitaActionPerformed

    private void jMenuItemEliminarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarCitasActionPerformed
        EliminarCitas eliminarCitas = new EliminarCitas();
        this.jDesktopPane1.add(eliminarCitas);
        eliminarCitas.setVisible(true);


    }//GEN-LAST:event_jMenuItemEliminarCitasActionPerformed

    private void jMenuItemMostrarCitasOficialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMostrarCitasOficialesActionPerformed
        JDialogBuscarCitas jdiagbuscarcitas = new JDialogBuscarCitas(null, true);
        jdiagbuscarcitas.setVisible(true);
    }//GEN-LAST:event_jMenuItemMostrarCitasOficialesActionPerformed

    private void MenuItemAgregarPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgregarPruebasActionPerformed
        AgregarPruebas agregarPruebas = new AgregarPruebas();
        this.jDesktopPane1.add(agregarPruebas);
        agregarPruebas.setVisible(true);
    }//GEN-LAST:event_MenuItemAgregarPruebasActionPerformed

    private void jMenuItemEliminarOficialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarOficialesActionPerformed
        EliminarTecnico eliminarOficiales = new EliminarTecnico();
        this.jDesktopPane1.add(eliminarOficiales);
        eliminarOficiales.setVisible(true);

    }//GEN-LAST:event_jMenuItemEliminarOficialesActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        ModificarTecnico modificarOficiales = new ModificarTecnico();
        this.jDesktopPane1.add(modificarOficiales);
        modificarOficiales.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAgregarPruebas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirConfiguracion;
    private javax.swing.JMenuItem jMenuItemAgregarCita;
    private javax.swing.JMenuItem jMenuItemAgregarClientes;
    private javax.swing.JMenuItem jMenuItemAgregarOficiales;
    private javax.swing.JMenuItem jMenuItemAgregarUsuarios;
    private javax.swing.JMenuItem jMenuItemCalcularSalario;
    private javax.swing.JMenuItem jMenuItemEliminarCitas;
    private javax.swing.JMenuItem jMenuItemEliminarClientes;
    private javax.swing.JMenuItem jMenuItemEliminarOficiales;
    private javax.swing.JMenuItem jMenuItemEliminarUsuarios;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JMenuItem jMenuItemModificarClientes;
    private javax.swing.JMenuItem jMenuItemModificarUsuarios;
    private javax.swing.JMenuItem jMenuItemMostrarCitasOficiales;
    private javax.swing.JMenu jMenuOficial;
    private javax.swing.JMenu jMenuRegistar;
    private javax.swing.JMenu jmenu;
    // End of variables declaration//GEN-END:variables

//    class FondoPanel extends JPanel {
//
//        private Image imagen;
//
//        @Override
//        public void paint(Graphics g) {
//            imagen = new ImageIcon(getClass().getResource("/Imagen/rtv.png")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            super.paint(g);
//        }
//
//    }

}
