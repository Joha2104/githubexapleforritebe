package VistaUsuarios;

import Controladores.ControladorUsuario;
import java.awt.Frame;
import javax.swing.JOptionPane;
import Modelos.Usuario;

/**
 *
 * @author Esmeralda
 */
public class ModificarUsuarios extends javax.swing.JInternalFrame {

    private ControladorUsuario cu;
    private Usuario usuario;

    public ModificarUsuarios() {

        initComponents();
        usuario = null;
        cu = new ControladorUsuario();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtNombreUsuario = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        BtnActualizar = new javax.swing.JButton();
        TxtTelefono = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        BtnCargar = new javax.swing.JButton();
        BtnCambiarContraseña = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("Modificar Usuarios");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de nacimiento:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("telefono:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nombre usuario:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Cedula:");

        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyTyped(evt);
            }
        });

        jComboBoxTipo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "oficial", "secretaria" }));

        BtnActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });

        BtnCargar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCargar.setText("Cargar");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        BtnCambiarContraseña.setText("cambiar ");
        BtnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarContraseñaActionPerformed(evt);
            }
        });

        jPasswordField1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCargar)
                            .addComponent(BtnActualizar))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed

        usuario = new Usuario();

        try {
            usuario.setCedula(Integer.parseInt(this.TxtCedula.getText()));
            usuario.setTelefono(Integer.parseInt(this.TxtTelefono.getText()));
        } catch (NumberFormatException e) {

        }
        usuario.setNombre(this.TxtNombre.getText());
        usuario.setCorreo(this.TxtCorreo.getText());
        usuario.setSobrenombre(this.TxtNombreUsuario.getText());
        usuario.setTipo((String) this.jComboBoxTipo.getSelectedItem());
        usuario.setFechanacimiento(this.jDateChooser1.getDate());
        usuario.setContraseña(concatenar(this.jPasswordField1.getPassword()));

        System.out.println("Aquisientra la vara");

        if (usuario.comprobar()) {

            if (cu.actualizar(usuario)) {
                JOptionPane.showMessageDialog(this, "Usuario actualizado");
                this.TxtCedula.setEditable(true);
                this.jPasswordField1.setEditable(true);
                usuario = null;
                Limpiar();
            } else {
                System.out.println("No se pudo actualizar ");
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se admiten campos vacios");
        }


    }//GEN-LAST:event_BtnActualizarActionPerformed


    private void TxtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyTyped

        //validamos capturar caracter a caracter
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_TxtCedulaKeyTyped

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        //validamos capturar caracter a caracter
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed

        if (!this.TxtCedula.getText().equals("")) {

            usuario = new Usuario();
            int cedula = Integer.parseInt(this.TxtCedula.getText());
            usuario.setCedula(cedula);

            if (cu.buscar(usuario) != null) {

                usuario = cu.buscar(usuario);
                this.TxtCedula.setEditable(true);
                this.TxtCedula.setText(String.valueOf(usuario.getCedula()));
                this.TxtCedula.setEditable(false);
                this.TxtNombre.setText(usuario.getNombre());
                this.jDateChooser1.setDate(usuario.getFechanacimiento());
                this.TxtTelefono.setText(String.valueOf(usuario.getTelefono()));
                this.TxtCorreo.setText(usuario.getCorreo());
                this.TxtNombreUsuario.setText(usuario.getSobrenombre());
                this.jComboBoxTipo.setSelectedItem(usuario.getTipo());
                this.jPasswordField1.setEditable(true);
                this.jPasswordField1.setText(usuario.getContraseña());
                this.jPasswordField1.setEditable(false);

            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                usuario = null;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar la cedula para carga el usuario");
        }


    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarContraseñaActionPerformed

        if (usuario != null && usuario.comprobar()) {
            Frame f = JOptionPane.getFrameForComponent(this);
            JDialogCambiarContraseña jdialog = new JDialogCambiarContraseña(f, true);
            jdialog.setContraseñaActual(concatenar(this.jPasswordField1.getPassword()));
            jdialog.setVisible(true);//cuando se muestra se pausa aquí

            if (jdialog.getUsuario() != null) {
                this.jPasswordField1.setEditable(true);
                this.jPasswordField1.setText(jdialog.getUsuario().getContraseña());
                this.jPasswordField1.setEditable(false);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe cargar un usuario");
        }

    }//GEN-LAST:event_BtnCambiarContraseñaActionPerformed

    public String concatenar(char pass[]) {
        String pass2 = "";

        if (pass.length > 0) {
            for (int i = 0; i <= pass.length - 1; i++) {
                pass2 += pass[i];

            }
            return pass2;

        } else {
            return pass2;
        }
    }

    public void Limpiar() {
        this.TxtCedula.setText("");
        this.TxtCorreo.setText("");
        this.TxtNombre.setText("");
        this.TxtTelefono.setText("");
        this.TxtNombreUsuario.setText("");
        this.jComboBoxTipo.setSelectedIndex(0);
        this.jDateChooser1.setCalendar(null);
        this.jPasswordField1.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnCambiarContraseña;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombreUsuario;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
