
package Vista;

import java.awt.Font;
import Controlador.OyenteTraduccion;

public class BrailleTexto extends javax.swing.JFrame {
    
    public BrailleTexto() {
        initComponents();
        misComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        IntroducirTexto = new javax.swing.JScrollPane();
        Introducido = new javax.swing.JTextArea();
        TextTraducido = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        nueve = new javax.swing.JLabel();
        cero = new javax.swing.JLabel();
        Traducir = new javax.swing.JLabel();
        ImagenBraille = new javax.swing.JLabel();
        TextoBraille = new javax.swing.JLabel();
        BrailleTexto = new javax.swing.JLabel();
        VozBraille = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IntroducirTexto.setBorder(null);
        IntroducirTexto.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        IntroducirTexto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Introducido.setColumns(20);
        Introducido.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Introducido.setLineWrap(true);
        Introducido.setRows(5);
        Introducido.setWrapStyleWord(true);
        IntroducirTexto.setViewportView(Introducido);

        BackGround.add(IntroducirTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 360, 390));

        TextTraducido.setBorder(null);
        TextTraducido.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        TextTraducido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Resultado.setEditable(false);
        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Resultado.setLineWrap(true);
        Resultado.setRows(5);
        Resultado.setWrapStyleWord(true);
        TextTraducido.setViewportView(Resultado);

        BackGround.add(TextTraducido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 240, 350, 390));

        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        BackGround.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, 60));

        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        BackGround.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 40, 60));

        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        BackGround.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 40, 60));

        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        BackGround.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 40, 60));

        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        BackGround.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 40, 60));

        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });
        BackGround.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 40, 60));

        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });
        BackGround.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 40, 60));

        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hMouseClicked(evt);
            }
        });
        BackGround.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 40, 60));

        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        BackGround.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 40, 60));

        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });
        BackGround.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 40, 60));

        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMouseClicked(evt);
            }
        });
        BackGround.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 40, 60));

        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mMouseClicked(evt);
            }
        });
        BackGround.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 40, 60));

        n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nMouseClicked(evt);
            }
        });
        BackGround.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 40, 60));

        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
        });
        BackGround.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 40, 60));

        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        BackGround.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 40, 60));

        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qMouseClicked(evt);
            }
        });
        BackGround.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 40, 60));

        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMouseClicked(evt);
            }
        });
        BackGround.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 40, 60));

        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
        });
        BackGround.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 40, 60));

        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        BackGround.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 40, 60));

        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        BackGround.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 40, 60));

        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vMouseClicked(evt);
            }
        });
        BackGround.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 40, 60));

        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        BackGround.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 40, 60));

        z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zMouseClicked(evt);
            }
        });
        BackGround.add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 40, 60));

        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoMouseClicked(evt);
            }
        });
        BackGround.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 50, 60));

        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosMouseClicked(evt);
            }
        });
        BackGround.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, 60));

        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });
        BackGround.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 60, 60));

        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuatroMouseClicked(evt);
            }
        });
        BackGround.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 60, 60));

        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });
        BackGround.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 40, 60));

        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });
        BackGround.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 50, 60));

        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sieteMouseClicked(evt);
            }
        });
        BackGround.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 50, 60));

        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ochoMouseClicked(evt);
            }
        });
        BackGround.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 50, 60));

        nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nueveMouseClicked(evt);
            }
        });
        BackGround.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 60, 60));

        cero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceroMouseClicked(evt);
            }
        });
        BackGround.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 50, 60));

        Traducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TraducirMouseClicked(evt);
            }
        });
        BackGround.add(Traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 640, 250, 80));

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

        jScrollPane1.setBackground(new java.awt.Color(255, 238, 191));
        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 238, 191));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane1.setViewportView(jTextArea3);

        BackGround.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 626, 260, 110));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BrailleTexto.png"))); // NOI18N
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

    private void TraducirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TraducirMouseClicked
        OyenteTraduccion Listener = new OyenteTraduccion();
        
        String ingresado = Introducido.getText();
        String resultado = Listener.BrialleToText(ingresado);
        Resultado.setText(resultado);
    }//GEN-LAST:event_TraducirMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠁"));
    }//GEN-LAST:event_aMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠃"));
    }//GEN-LAST:event_bMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠉"));
    }//GEN-LAST:event_cMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠙"));
    }//GEN-LAST:event_dMouseClicked

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠑"));
    }//GEN-LAST:event_eMouseClicked

    private void fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠋"));
    }//GEN-LAST:event_fMouseClicked

    private void gMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠛"));
    }//GEN-LAST:event_gMouseClicked

    private void hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠓"));
    }//GEN-LAST:event_hMouseClicked

    private void iMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠊"));
    }//GEN-LAST:event_iMouseClicked

    private void jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠚"));
    }//GEN-LAST:event_jMouseClicked

    private void lMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠇"));
    }//GEN-LAST:event_lMouseClicked

    private void mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠍"));
    }//GEN-LAST:event_mMouseClicked

    private void nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠝"));
    }//GEN-LAST:event_nMouseClicked

    private void oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠕"));
    }//GEN-LAST:event_oMouseClicked

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠏"));
    }//GEN-LAST:event_pMouseClicked

    private void qMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠟"));
    }//GEN-LAST:event_qMouseClicked

    private void rMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠗"));
    }//GEN-LAST:event_rMouseClicked

    private void sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠎"));
    }//GEN-LAST:event_sMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠞"));
    }//GEN-LAST:event_tMouseClicked

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠥"));
    }//GEN-LAST:event_uMouseClicked

    private void vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠧"));
    }//GEN-LAST:event_vMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠭"));
    }//GEN-LAST:event_xMouseClicked

    private void zMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠵"));
    }//GEN-LAST:event_zMouseClicked

    private void unoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠁"));
    }//GEN-LAST:event_unoMouseClicked

    private void dosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠃"));
    }//GEN-LAST:event_dosMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠉"));
    }//GEN-LAST:event_tresMouseClicked

    private void cuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠙"));
    }//GEN-LAST:event_cuatroMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠑"));
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠋"));
    }//GEN-LAST:event_seisMouseClicked

    private void sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠛"));
    }//GEN-LAST:event_sieteMouseClicked

    private void ochoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠓"));
    }//GEN-LAST:event_ochoMouseClicked

    private void nueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nueveMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠊"));
    }//GEN-LAST:event_nueveMouseClicked

    private void ceroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceroMouseClicked
        String texto = Introducido.getText();
        Introducido.setText(texto.concat("⠼⠚"));
    }//GEN-LAST:event_ceroMouseClicked
    
    private void misComponentes(){
        this.setTitle("Braille a Texto");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        Font font = new Font("Code2000", Font.PLAIN, 36);
        Introducido.setFont(font);
        Resultado.setFont(font);
    }

/*    public static void main(String[]args){
        BrailleTexto inicio = new BrailleTexto();
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BrailleTexto;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenBraille;
    private javax.swing.JTextArea Introducido;
    private javax.swing.JScrollPane IntroducirTexto;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JScrollPane TextTraducido;
    private javax.swing.JLabel TextoBraille;
    private javax.swing.JLabel Traducir;
    private javax.swing.JLabel VozBraille;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel cero;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel d;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JLabel i;
    private javax.swing.JLabel j;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel l;
    private javax.swing.JLabel m;
    private javax.swing.JLabel n;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel o;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel p;
    private javax.swing.JLabel q;
    private javax.swing.JLabel r;
    private javax.swing.JLabel s;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel t;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel u;
    private javax.swing.JLabel uno;
    private javax.swing.JLabel v;
    private javax.swing.JLabel x;
    private javax.swing.JLabel z;
    // End of variables declaration//GEN-END:variables
}
