
package Vista;

public class VozBraille extends javax.swing.JFrame {
    
    public VozBraille() {
        initComponents();
        misComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Traducir = new javax.swing.JLabel();
        ImagenBraille = new javax.swing.JLabel();
        TextoBraille = new javax.swing.JLabel();
        BrailleTexto = new javax.swing.JLabel();
        VozBraille = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BackGround.add(Traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 250, 100));

        ImagenBraille.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenBrailleMouseClicked(evt);
            }
        });
        BackGround.add(ImagenBraille, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 70));

        TextoBraille.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoBrailleMouseClicked(evt);
            }
        });
        BackGround.add(TextoBraille, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 80));

        BrailleTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrailleTextoMouseClicked(evt);
            }
        });
        BackGround.add(BrailleTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 80));

        VozBraille.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VozBrailleMouseClicked(evt);
            }
        });
        BackGround.add(VozBraille, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 300, 80));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VozBraille.png"))); // NOI18N
        BackGround.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenBrailleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenBrailleMouseClicked
        ImagenBraille ventana = new ImagenBraille();
        this.dispose();
    }//GEN-LAST:event_ImagenBrailleMouseClicked

    private void TextoBrailleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoBrailleMouseClicked
        TextoBraille ventana = new TextoBraille();
        this.dispose();
    }//GEN-LAST:event_TextoBrailleMouseClicked

    private void BrailleTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrailleTextoMouseClicked
        BrailleTexto ventana = new BrailleTexto();
        this.dispose();
    }//GEN-LAST:event_BrailleTextoMouseClicked

    private void VozBrailleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VozBrailleMouseClicked
        VozBraille ventana = new VozBraille();
        this.dispose();
    }//GEN-LAST:event_VozBrailleMouseClicked
    
    private void misComponentes(){
        this.setTitle("Voz a Braille");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    
/*    public static void main(String[]args){
        BrailleTexto inicio = new BrailleTexto();
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BrailleTexto;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenBraille;
    private javax.swing.JLabel TextoBraille;
    private javax.swing.JLabel Traducir;
    private javax.swing.JLabel VozBraille;
    // End of variables declaration//GEN-END:variables
}
