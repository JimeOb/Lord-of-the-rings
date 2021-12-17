package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
        jtxArma.setEditable(false);
        jtxArnadura.setEditable(false);
        jtxEdad.setEditable(false);
        jtxEspecialidad.setEditable(false);
        jtxMontura.setEditable(false);
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

    public JComboBox<String> getBoxGuerreros() {
        return boxGuerreros;
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
        this.boxGuerreros = boxGuerreros;
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

    public JTextField getJtxArma() {
        return jtxArma;
    }

    public void setJtxArma(JTextField jtxArma) {
        this.jtxArma = jtxArma;
    }

    public JTextField getJtxArnadura() {
        return jtxArnadura;
    }

    public void setJtxArnadura(JTextField jtxArnadura) {
        this.jtxArnadura = jtxArnadura;
    }

    public JTextField getJtxEdad() {
        return jtxEdad;
    }

    public void setJtxEdad(JTextField jtxEdad) {
        this.jtxEdad = jtxEdad;
    }

    public JTextField getJtxEspecialidad() {
        return jtxEspecialidad;
    }

    public void setJtxEspecialidad(JTextField jtxEspecialidad) {
        this.jtxEspecialidad = jtxEspecialidad;
    }

    public JTextField getJtxMontura() {
        return jtxMontura;
    }

    public void setJtxMontura(JTextField jtxMontura) {
        this.jtxMontura = jtxMontura;
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

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxNumero = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        boxGuerreros = new javax.swing.JComboBox<>();
        pnlGuerreros = new javax.swing.JPanel();
        lbRaza = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxArma = new javax.swing.JTextField();
        jtxEdad = new javax.swing.JTextField();
        jtxAltura = new javax.swing.JTextField();
        jtxEspecialidad = new javax.swing.JTextField();
        jtxMontura = new javax.swing.JTextField();
        jtxArnadura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("El señor de los anillos");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 274, 62));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Numero de guerreros : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 37));
        getContentPane().add(jtxNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 220, 41, -1));

        btnGenerar.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        btnGenerar.setText("GENERAR");
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 366, 159, 48));

        boxGuerreros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxGuerreros, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 500, -1));

        pnlGuerreros.setBackground(new java.awt.Color(255, 102, 153));
        pnlGuerreros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRaza.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbRaza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRaza.setText("Raza del personaje");
        pnlGuerreros.add(lbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 500, 40));

        lbImagen.setBackground(new java.awt.Color(0, 153, 153));
        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/elfo.jpg"))); // NOI18N
        pnlGuerreros.add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 230));

        jLabel6.setText("Edad : ");
        pnlGuerreros.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel7.setText("Altura :");
        pnlGuerreros.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel8.setText("Especialidad :");
        pnlGuerreros.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel9.setText("Montura :");
        pnlGuerreros.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel10.setText("Armadura :");
        pnlGuerreros.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel11.setText("Arma :");
        pnlGuerreros.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jtxArma.setText("jTextField1");
        pnlGuerreros.add(jtxArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 230, 30));

        jtxEdad.setText("jTextField1");
        pnlGuerreros.add(jtxEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 230, 30));

        jtxAltura.setText("jTextField1");
        pnlGuerreros.add(jtxAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 230, 30));

        jtxEspecialidad.setText("jTextField1");
        pnlGuerreros.add(jtxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 230, 30));

        jtxMontura.setText("jTextField1");
        pnlGuerreros.add(jtxMontura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 230, 30));

        jtxArnadura.setText("jTextField1");
        pnlGuerreros.add(jtxArnadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 230, 30));

        getContentPane().add(pnlGuerreros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 750, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGuerreros;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtxAltura;
    private javax.swing.JTextField jtxArma;
    private javax.swing.JTextField jtxArnadura;
    private javax.swing.JTextField jtxEdad;
    private javax.swing.JTextField jtxEspecialidad;
    private javax.swing.JTextField jtxMontura;
    private javax.swing.JTextField jtxNumero;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbRaza;
    private javax.swing.JPanel pnlGuerreros;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos (){
        btnGenerar.addActionListener(getControl());
        jtxNumero.addActionListener(getControl());

        
    }
}

