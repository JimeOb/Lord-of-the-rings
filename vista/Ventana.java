package vista;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modelo.TipoPersonaje;

public class Ventana extends javax.swing.JFrame {

    private final Modelo_vista modelo;
    private Controlador control;
    
    public Ventana(Modelo_vista m) {
        modelo = m;
        initComponents();
        capturarEventos();
        setLocationRelativeTo(null);
        setTitle("Lord of the Rings");
        jtxAltura.setEditable(false);
        jtxEdad.setEditable(false);
        jtxEspecialidad.setEditable(false);
        txtEdadMont.setEditable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarBoxTiposGuerreros();
    }

    public Modelo_vista getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public void setJpnImagenes(JPanel jpnImagenes) {
        this.jpnImagenes = jpnImagenes;
    }

    public JComboBox<String> getBoxGuerreros() {
        return boxElegir;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }
    
    public JPanel getJpnImagenes() {
        return jpnImagenes;
    }
    

    public JRadioButton getRbtnArma() {
        return rbtnArma;
    }

    public JRadioButton getRbtnArmadura() {
        return rbtnArmadura;
    }

    public JRadioButton getRbtnMontura() {
        return rbtnMontura;
    }
    
    public JButton getBtnGenerar() {
        return btnGenerar;
    }

    public JTextField getJtxNumero() {
        return jtxNumero;
    }

    public JPanel getPnlGuerreros() {
        return pnlGuerreros;
    }

    public void setBoxGuerreros(JComboBox<String> boxGuerreros) {
        this.boxElegir = boxGuerreros;
    }

    public void setPnlGuerreros(JPanel pnlGuerreros) {
        this.pnlGuerreros = pnlGuerreros;
    }
    
    public JTextField getJtxAltura() {
        return jtxAltura;
    }

    public void setJtxAltura(JTextField jtxAltura) {
        this.jtxAltura = jtxAltura;
    }

    public JTextField getJtxEdad() {
        return jtxEdad;
    }

    public void setJtxEdad(JTextField jtxEdad) {
        this.jtxEdad = jtxEdad;
    }

    public JPanel getPnlInfo() {
        return pnlInfo;
    }

    public JTextField getJtxEspecialidad() {
        return jtxEspecialidad;
    }

    public void setJtxEspecialidad(JTextField jtxEspecialidad) {
        this.jtxEspecialidad = jtxEspecialidad;
    }

    public JTextField getJtxMontura() {
        return txtEdadMont;
    }

    public void setJtxMontura(JTextField jtxMontura) {
        this.txtEdadMont = jtxMontura;
    }

    public JLabel getLbImagen() {
        return lbImagen;
    }

    public void setLbImagen(JLabel lbImagen) {
        this.lbImagen = lbImagen;
    }

    public JLabel getLbRaza() {
        return lbRaza;
    }

    public void setLbRaza(JLabel lbRaza) {
        this.lbRaza = lbRaza;
    }

    public JComboBox<String> getBoxGuerreros1() {
        return boxGuerreros1;
    }

    public JPanel getPnlArma() {
        return pnlArma;
    }

    public JPanel getPnlArmadura() {
        return pnlArmadura;
    }

    public JPanel getPnlMontura() {
        return pnlMontura;
    }

    public JTextField getTxtAtaqueArma() {
        return txtAtaqueArma;
    }

    public JTextField getTxtCalidadArm() {
        return txtCalidadArm;
    }

    public JTextField getTxtDefensaArm() {
        return txtDefensaArm;
    }

    public JTextField getTxtPesoArm() {
        return txtPesoArm;
    }

    public JTextField getTxtPesoArma() {
        return txtPesoArma;
    }

    public JTextField getTxtRarezaArma() {
        return txtRarezaArma;
    }

    public JTextField getTxtResistenciaArm() {
        return txtResistenciaArm;
    }

    public JTextField getJtxRaza() {
        return jtxRaza;
    }

    public JTextField getTxtEdadMont() {
        return txtEdadMont;
    }

    public JTextField getTxtSizeMont() {
        return txtSizeMont;
    }

    public JTextField getTxtVelocidadMont() {
        return txtVelocidadMont;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jpnImagenes = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxNumero = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxGuerreros1 = new javax.swing.JComboBox<>();
        rbtnArmadura = new javax.swing.JRadioButton();
        rbtnMontura = new javax.swing.JRadioButton();
        rbtnArma = new javax.swing.JRadioButton();
        pnlGuerreros = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        lbRaza = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxEspecialidad = new javax.swing.JTextField();
        jtxRaza = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        boxElegir = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlCaracteristicas = new javax.swing.JPanel();
        pnlMontura = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEdadMont = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVelocidadMont = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSizeMont = new javax.swing.JTextField();
        pnlArma = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtAtaqueArma = new javax.swing.JTextField();
        txtPesoArma = new javax.swing.JTextField();
        txtRarezaArma = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlArmadura = new javax.swing.JPanel();
        txtPesoArm = new javax.swing.JTextField();
        txtResistenciaArm = new javax.swing.JTextField();
        txtCalidadArm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDefensaArm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnImagenes.setBackground(new java.awt.Color(255, 255, 255));
        jpnImagenes.setLayout(new java.awt.GridLayout(2, 4, 10, 10));
        jScrollPane1.setViewportView(jpnImagenes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 800, 770));

        pnlInfo.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("El señor de los anillos");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 274, 62));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("tipo de guerreros : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 37));
        jPanel2.add(jtxNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 41, -1));

        btnGenerar.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnGenerar.setText("GENERAR");
        jPanel2.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 159, 48));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Numero de guerreros : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 37));

        boxGuerreros1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxGuerreros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGuerreros1ActionPerformed(evt);
            }
        });
        jPanel2.add(boxGuerreros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 110, -1));

        rbtnArmadura.setText(" Armadura");
        jPanel2.add(rbtnArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        rbtnMontura.setText("Montura");
        jPanel2.add(rbtnMontura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        rbtnArma.setText("Arma");
        jPanel2.add(rbtnArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        pnlInfo.add(jPanel2, "crear");

        pnlGuerreros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImagen.setBackground(new java.awt.Color(0, 153, 153));
        lbImagen.setText("ff");
        pnlGuerreros.add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 230));

        lbRaza.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbRaza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRaza.setText("Raza del personaje : ");
        pnlGuerreros.add(lbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 280, 40));

        jLabel6.setText("Edad : ");
        pnlGuerreros.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jtxEdad.setText("jTextField1");
        pnlGuerreros.add(jtxEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 230, 30));

        jLabel7.setText("Altura :");
        pnlGuerreros.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jtxAltura.setText("jTextField1");
        pnlGuerreros.add(jtxAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 230, 30));

        jLabel8.setText("Especialidad :");
        pnlGuerreros.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jtxEspecialidad.setText("jTextField1");
        pnlGuerreros.add(jtxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 230, 30));

        jtxRaza.setText("jTextField1");
        pnlGuerreros.add(jtxRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 280, 40));

        btnAgregar.setText("Agregar ");
        pnlGuerreros.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 120, 30));

        boxElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlGuerreros.add(boxElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 680, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlCaracteristicas.setLayout(new javax.swing.BoxLayout(pnlCaracteristicas, javax.swing.BoxLayout.PAGE_AXIS));

        pnlMontura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Montura ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlMontura.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        txtEdadMont.setText("Sin Montura");
        txtEdadMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMontActionPerformed(evt);
            }
        });
        pnlMontura.add(txtEdadMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 420, 30));

        jLabel1.setText("Edad:");
        pnlMontura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setText("Velocidad:");
        pnlMontura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtVelocidadMont.setText("jTextField1");
        pnlMontura.add(txtVelocidadMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 420, 30));

        jLabel11.setText("Tamaño:");
        pnlMontura.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtSizeMont.setText("jTextField2");
        pnlMontura.add(txtSizeMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 420, 30));

        pnlCaracteristicas.add(pnlMontura);

        pnlArma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Arma");
        pnlArma.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 40));

        txtAtaqueArma.setText("jTextField1");
        pnlArma.add(txtAtaqueArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 420, 30));

        txtPesoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoArmaActionPerformed(evt);
            }
        });
        pnlArma.add(txtPesoArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 420, 30));

        txtRarezaArma.setText("jTextField2");
        pnlArma.add(txtRarezaArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 420, 30));

        jLabel13.setText("Rareza:");
        pnlArma.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel15.setText("Peso:");
        pnlArma.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel16.setText("Ataque:");
        pnlArma.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        pnlCaracteristicas.add(pnlArma);

        pnlArmadura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesoArm.setText("jTextField1");
        pnlArmadura.add(txtPesoArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 420, 30));

        txtResistenciaArm.setText("Sin Montura");
        txtResistenciaArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResistenciaArmActionPerformed(evt);
            }
        });
        pnlArmadura.add(txtResistenciaArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 420, 30));

        txtCalidadArm.setText("jTextField2");
        pnlArmadura.add(txtCalidadArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 420, 30));

        jLabel12.setText("Calidad:");
        pnlArmadura.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel17.setText("Resistencia:");
        pnlArmadura.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel18.setText("Peso:");
        pnlArmadura.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Armadura");
        pnlArmadura.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 550, 20));

        jLabel20.setText("Defensa:");
        pnlArmadura.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtDefensaArm.setText("jTextField2");
        pnlArmadura.add(txtDefensaArm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 420, 30));

        pnlCaracteristicas.add(pnlArmadura);

        jScrollPane2.setViewportView(pnlCaracteristicas);

        pnlGuerreros.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 402, 550, 300));

        pnlInfo.add(pnlGuerreros, "info");

        getContentPane().add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 830, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxGuerreros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGuerreros1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGuerreros1ActionPerformed

    private void txtEdadMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMontActionPerformed

    private void txtPesoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoArmaActionPerformed

    private void txtResistenciaArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResistenciaArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResistenciaArmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxElegir;
    private javax.swing.JComboBox<String> boxGuerreros1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnImagenes;
    private javax.swing.JTextField jtxAltura;
    private javax.swing.JTextField jtxEdad;
    private javax.swing.JTextField jtxEspecialidad;
    private javax.swing.JTextField jtxNumero;
    private javax.swing.JTextField jtxRaza;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbRaza;
    private javax.swing.JPanel pnlArma;
    private javax.swing.JPanel pnlArmadura;
    private javax.swing.JPanel pnlCaracteristicas;
    private javax.swing.JPanel pnlGuerreros;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMontura;
    private javax.swing.JRadioButton rbtnArma;
    private javax.swing.JRadioButton rbtnArmadura;
    private javax.swing.JRadioButton rbtnMontura;
    private javax.swing.JTextField txtAtaqueArma;
    private javax.swing.JTextField txtCalidadArm;
    private javax.swing.JTextField txtDefensaArm;
    private javax.swing.JTextField txtEdadMont;
    private javax.swing.JTextField txtPesoArm;
    private javax.swing.JTextField txtPesoArma;
    private javax.swing.JTextField txtRarezaArma;
    private javax.swing.JTextField txtResistenciaArm;
    private javax.swing.JTextField txtSizeMont;
    private javax.swing.JTextField txtVelocidadMont;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos (){
        btnGenerar.addActionListener(getControl());
        jtxNumero.addActionListener(getControl());
        boxElegir.addActionListener(getControl());
        btnAgregar.addActionListener(getControl());
    }
    
    public void inicializarBoxTiposGuerreros() {
        List<String> tiposGuerreros = Stream.of(TipoPersonaje.values())
                .map(TipoPersonaje::name)
                .collect(Collectors.toList());
        
        boxGuerreros1.setModel(new DefaultComboBoxModel(tiposGuerreros.toArray()));
    }
}

