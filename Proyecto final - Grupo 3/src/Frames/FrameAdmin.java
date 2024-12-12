package Frames;

import Clases_Metodos.Biblioteca;
import Clases_Metodos.Libro;
import Clases_Metodos.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameAdmin extends javax.swing.JFrame {

    Biblioteca biblioteca = Biblioteca.getInstance();
    
    public FrameAdmin() {
        initComponents();
        this.setModelo();
    }

    //------------------------------------------//
    DefaultTableModel modelo = new DefaultTableModel();
    MostrarUsuarios ventana = new MostrarUsuarios();// Instancia para llamar a aventana 
    //------------------------------------------//
    private void setModelo(){
        String [] Encabezado = {"Nombre", "Email", "Contrasena", "Prestamos", "Historial Prestamos"};
        modelo.setColumnIdentifiers(Encabezado);
        this.ventana.TablaUsu.setModel(modelo);
    }//Set modelo
    
    private void setDatos(){
        // Limpiar todas las filas existentes en el modelo
        modelo.setRowCount(0);

        // Recorrer los usuarios del ArrayList y agregarlos a la tabla
        for (Usuario recorre : biblioteca.getUsuarios()) {
            Object[] fila = new Object[modelo.getColumnCount()];
            fila[0] = recorre.getUsuario();
            fila[1] = recorre.getEmail();
            fila[2] = recorre.getPassword();
            fila[3] = recorre.getPrestamos();
            fila[4] = recorre.getHistorialPrestamos();
            modelo.addRow(fila);
        }

        // Establecer el modelo actualizado en la tabla
        this.ventana.TablaUsu.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_editar_usuario = new javax.swing.JButton();
        btn_eliminar_usuario = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_mostrar_usuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TF_Admin_Usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jTextField_Titulo = new javax.swing.JTextField();
        jTextField_Autor = new javax.swing.JTextField();
        jTextField_Genero = new javax.swing.JTextField();
        Btn_Agregar = new javax.swing.JButton();
        Btn_LimpiarCampos = new javax.swing.JButton();
        RB_NODisponible = new javax.swing.JRadioButton();
        RB_Disponible = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_ISBN_Editar = new javax.swing.JTextField();
        Btn_Buscar_Editar = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_ISBN_Eliminar = new javax.swing.JTextField();
        Btn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIBLIOTECA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administracion de usuario");

        btn_editar_usuario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_editar_usuario.setText("Editar Usuario");
        btn_editar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_usuarioActionPerformed(evt);
            }
        });

        btn_eliminar_usuario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_eliminar_usuario.setText("Eliminar Usuario");
        btn_eliminar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_usuarioActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_mostrar_usuario.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_mostrar_usuario.setText("Mostrar Usuarios");
        btn_mostrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Nota: ingrese el usuario a editar/eliminar antes de presionar el boton");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administracion de biblioteca");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Agregar Libro");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("ISBN");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Título");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Autor");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Género");

        Btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Agregar.setText("Agregar");
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });

        Btn_LimpiarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_LimpiarCampos.setText("Limpiar Campos");
        Btn_LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarCamposActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_NODisponible);
        RB_NODisponible.setText("No disponible");
        RB_NODisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_NODisponibleActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_Disponible);
        RB_Disponible.setText("Disponible");
        RB_Disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_DisponibleActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("Estado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_LimpiarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Agregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Titulo)
                                    .addComponent(jTextField_ISBN)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Autor)
                                        .addComponent(jTextField_Genero)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(RB_NODisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 87, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(RB_Disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)))))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_NODisponible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB_Disponible))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_LimpiarCampos)
                    .addComponent(Btn_Agregar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Editar Libro");

        jLabel13.setText("Por favor ingrese el ISBN del libro:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("ISBN");

        jTextField_ISBN_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBN_EditarActionPerformed(evt);
            }
        });

        Btn_Buscar_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Buscar_Editar.setText("Buscar");
        Btn_Buscar_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Buscar_EditarActionPerformed(evt);
            }
        });

        Btn_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Editar.setText("Editar");
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Btn_Buscar_Editar)
                                .addGap(34, 34, 34)
                                .addComponent(Btn_Editar))
                            .addComponent(jTextField_ISBN_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_ISBN_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Editar)
                    .addComponent(Btn_Buscar_Editar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Eliminar Libro");

        jLabel16.setText("Por favor ingrese el ISBN del libro:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("ISBN");

        jTextField_ISBN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBN_EliminarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ISBN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Btn_Eliminar)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_ISBN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Eliminar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TF_Admin_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(351, 351, 351)
                                .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_editar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btn_eliminar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_mostrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_volver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_Admin_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        try {
            String isbnText = jTextField_ISBN_Eliminar.getText();
            if (isbnText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un ID");
                return;
            }
            int idEliminar = Integer.parseInt(isbnText);
            biblioteca.eliminarLibro(isbnText);
            /*Aquí no se agrega un mensaje de "Eliminado con éxito!"
            porque ya está establecido en el método de la biblioteca.*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: El ISBN debe ser un número entero válido. ");
        }
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void jTextField_ISBN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBN_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBN_EliminarActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        String isbn = jTextField_ISBN_Editar.getText();

        if (jTextField_Titulo.getText().isEmpty() || jTextField_Autor.getText().isEmpty() ||
            jTextField_Genero.getText().isEmpty() || jTextField_ISBN_Editar.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, primero busque el libro con el ISBN y luego edítelo.");
            return; // Salir si los campos están vacíos
        }
        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el ISBN del libro a editar.");
            return;
        }

        // Buscar el libro por ISBN
        Libro libroAEditar = null;
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.getISBN().equals(isbn)) {
                libroAEditar = libro;
                break;
            }
        }

        if (libroAEditar == null) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN ingresado.");
            return;
        }

        // Recuperar los nuevos datos del formulario
        String nuevoTitulo = jTextField_Titulo.getText();
        String nuevoAutor = jTextField_Autor.getText();
        String nuevoGenero = jTextField_Genero.getText();

        if (nuevoTitulo.isEmpty() || nuevoAutor.isEmpty() || nuevoGenero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son necesarios y obligatorios. Por favor, complete la información faltante.");
            return;
        }

        //Determina el estado del libro
        boolean estadoPrestado;
        if (RB_NODisponible.isSelected()) {
            estadoPrestado = true;
        } else if (RB_Disponible.isSelected()) {
            estadoPrestado = false;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione el estado del libro (No Disponible o Disponible).");
            return;
        }

        // Actualizar la información del libro
        libroAEditar.setTitulo(nuevoTitulo);
        libroAEditar.setAutor(nuevoAutor);
        libroAEditar.setGenero(nuevoGenero);
        libroAEditar.setPrestado(estadoPrestado);

        JOptionPane.showMessageDialog(null, "El libro fue actualizado correctamente:\n" + libroAEditar.toString());

        // Limpiar los campos de texto
        jTextField_Titulo.setText("");
        jTextField_Autor.setText("");
        jTextField_ISBN.setText("");
        jTextField_Genero.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_Buscar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Buscar_EditarActionPerformed
        String isbnText = jTextField_ISBN_Editar.getText(); // Usa el campo de texto para ISBN
        if (isbnText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ISBN para buscar.");
            return;
        }

        Libro libroEncontrado = null;
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.getISBN().equals(isbnText)) {
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado != null) {
            // Mostrar datos del libro encontrado
            JOptionPane.showMessageDialog(null, "El libro fue encontrado:\n" + libroEncontrado.toString() +
                "\nPara editar, complete el formulario y presione 'Editar'."
            );

            // Prellena los campos del formulario con la información del libro encontrado
            jTextField_Titulo.setText(libroEncontrado.getTitulo());
            jTextField_Autor.setText(libroEncontrado.getAutor());
            jTextField_Genero.setText(libroEncontrado.getGenero());
            jTextField_ISBN.setText(libroEncontrado.getISBN());

            // Seleccionar si el libro está prestado o no
            if (libroEncontrado.isPrestado()) {
                RB_Disponible.setSelected(true);
            }
            else {
                RB_NODisponible.setSelected(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN ingresado.");
        }
    }//GEN-LAST:event_Btn_Buscar_EditarActionPerformed

    private void jTextField_ISBN_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBN_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBN_EditarActionPerformed

    private void RB_DisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_DisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_DisponibleActionPerformed

    private void RB_NODisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_NODisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_NODisponibleActionPerformed

    private void Btn_LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarCamposActionPerformed
        jTextField_Titulo.setText("");
        jTextField_Autor.setText("");
        jTextField_ISBN.setText("");
        jTextField_Genero.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_Btn_LimpiarCamposActionPerformed

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed
        String titulo = jTextField_Titulo.getText();
        String autor = jTextField_Autor.getText();
        String isbn = jTextField_ISBN.getText();
        String genero = jTextField_Genero.getText();

        if (titulo.isEmpty() || autor.isEmpty() || isbn.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son necesarios y obligatorios. Por favor, complete la información faltante.");
            return;
        }

        // Verificar si ya existe un libro con el mismo ISBN
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.getISBN().equals(isbn)) {
                JOptionPane.showMessageDialog(null, "Ya existe un libro con el ISBN ingresado.");
                return;
            }
        }

        //Verficar que el mismo libro ya existe
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.getTitulo().equals(titulo) && libro.getAutor().equals(autor)) {
                JOptionPane.showMessageDialog(null, "Ya existe un libro con el título y autor ingresado.");
                return;
            }
        }

        //Determinar el estado del libro
        boolean estadoPrestado;
        if (RB_NODisponible.isSelected()) {
            estadoPrestado = true; //El libro ha sido prestado
        } else if (RB_Disponible.isSelected()) {
            estadoPrestado = false; //El libro está disponible
        } else {
            JOptionPane.showMessageDialog(null, "Debe establecer el estado de disponibilidad del libro.");
            return;
        }

        // Crear el nuevo libro y agregarlo a la biblioteca
        Libro nuevoLibro = new Libro(titulo, autor, isbn, genero);
        nuevoLibro.setPrestado(estadoPrestado);
        biblioteca.nuevoLibro(nuevoLibro);

        JOptionPane.showMessageDialog(null, "Libro agregado correctamente:\n" + nuevoLibro.toString());

        // Limpiar los campos de texto
        jTextField_Titulo.setText("");
        jTextField_Autor.setText("");
        jTextField_ISBN.setText("");
        jTextField_Genero.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void btn_mostrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_usuarioActionPerformed
        // TODO add your handling code here:
        this.setDatos();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btn_mostrar_usuarioActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_usuarioActionPerformed
        // TODO add your handling code here:
        String usu = TF_Admin_Usuario.getText();
        biblioteca.eliminarUsuario(usu);
    }//GEN-LAST:event_btn_eliminar_usuarioActionPerformed

    private void btn_editar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_usuarioActionPerformed
        String usu = TF_Admin_Usuario.getText();
        //verifica si existe
        for (Usuario usua : biblioteca.getUsuarios()) {

            if (usu.equals(usua.getUsuario())) {
                new FrameEditarUsuario(usua).setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El usuario no existe");
    }//GEN-LAST:event_btn_editar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Buscar_Editar;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_LimpiarCampos;
    private javax.swing.JRadioButton RB_Disponible;
    private javax.swing.JRadioButton RB_NODisponible;
    private javax.swing.JTextField TF_Admin_Usuario;
    private javax.swing.JButton btn_editar_usuario;
    private javax.swing.JButton btn_eliminar_usuario;
    private javax.swing.JButton btn_mostrar_usuario;
    private javax.swing.JButton btn_volver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField_Autor;
    private javax.swing.JTextField jTextField_Genero;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_ISBN_Editar;
    private javax.swing.JTextField jTextField_ISBN_Eliminar;
    private javax.swing.JTextField jTextField_Titulo;
    // End of variables declaration//GEN-END:variables
}
