/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author user
 */
public class GUISobreUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUISobreUsuario
     */
    public GUISobreUsuario() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jpCabecalhoSobre = new javax.swing.JPanel();
        jlCabecalhoSobre = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Sobre");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Em Casa - Quarentena contra o COVID-19  \n\nAplicativo desenvolvido pelo grupo de \nestudantes do Curso Técnico em Desenvolvimento\nde Sistemas do Senac Tech Porto Alegre nos\nsemestres 2020/2021.  \n\nVersão 1.0.");
        jScrollPane1.setViewportView(jTextArea1);

        jpCabecalhoSobre.setBackground(new java.awt.Color(51, 204, 255));

        jlCabecalhoSobre.setBackground(new java.awt.Color(51, 204, 255));
        jlCabecalhoSobre.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jlCabecalhoSobre.setForeground(new java.awt.Color(255, 255, 255));
        jlCabecalhoSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCabecalhoSobre.setText("SOBRE A APLICAÇÃO");

        javax.swing.GroupLayout jpCabecalhoSobreLayout = new javax.swing.GroupLayout(jpCabecalhoSobre);
        jpCabecalhoSobre.setLayout(jpCabecalhoSobreLayout);
        jpCabecalhoSobreLayout.setHorizontalGroup(
            jpCabecalhoSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoSobreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCabecalhoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jpCabecalhoSobreLayout.setVerticalGroup(
            jpCabecalhoSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCabecalhoSobre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpCabecalhoSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpCabecalhoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlCabecalhoSobre;
    private javax.swing.JPanel jpCabecalhoSobre;
    // End of variables declaration//GEN-END:variables
}
