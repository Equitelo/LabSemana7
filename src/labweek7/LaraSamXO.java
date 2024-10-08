// Samuel Isaac Lara
// Carlos Mauricio Altamirano
package labweek7;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LaraSamXO extends javax.swing.JFrame {
    adminUsrs s;
    private String usuario;
    String nombreX = usuario;
    String nombreO = JOptionPane.showInputDialog("player O: ");
    JLabel tablero[][]=new JLabel[3][3];
    String ronda="X";
    int contador=0;
    String ganador="X";
    int filas;
    int columnas;
    public LaraSamXO(adminUsrs s) {
        initComponents();
        //filas 0
        tablero[0][0]=caja0_0;
        tablero[0][1]=caja0_1;
        tablero[0][2]=caja0_2;
        //filas 1
        tablero[1][0]=caja1_0;
        tablero[1][1]=caja1_1;
        tablero[1][2]=caja1_2;
        //filas 2
        tablero[2][0]=caja2_0;
        tablero[2][1]=caja2_1;
        tablero[2][2]=caja2_2;
        this.s=s;
    }
    
    boolean respuestas(){
        if(contador>4){
            if(tablero[0][0].getText().equals("X") && tablero[0][1].getText().equals("X") && tablero[0][2].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][0].getText().equals("O") && tablero[0][1].getText().equals("O") && tablero[0][2].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[0][0].getText().equals("X") && tablero[1][0].getText().equals("X") && tablero[2][0].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][0].getText().equals("O") && tablero[1][0].getText().equals("O") && tablero[2][0].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[0][1].getText().equals("X") && tablero[1][1].getText().equals("X") && tablero[2][1].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][1].getText().equals("O") && tablero[1][1].getText().equals("O") && tablero[2][1].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[0][2].getText().equals("X") && tablero[1][2].getText().equals("X") && tablero[2][2].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][2].getText().equals("O") && tablero[1][2].getText().equals("O") && tablero[2][2].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[1][0].getText().equals("X") && tablero[1][1].getText().equals("X") && tablero[1][2].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[1][0].getText().equals("O") && tablero[1][1].getText().equals("O") && tablero[1][2].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[2][0].getText().equals("X") && tablero[2][1].getText().equals("X") && tablero[2][2].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[2][0].getText().equals("O") && tablero[2][1].getText().equals("O") && tablero[2][2].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[0][0].getText().equals("X") && tablero[1][1].getText().equals("X") && tablero[2][2].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][0].getText().equals("O") && tablero[1][1].getText().equals("O") && tablero[2][2].getText().equals("O")){
                ganador="O";
                return true;
            }else if(tablero[0][2].getText().equals("X") && tablero[1][1].getText().equals("X") && tablero[2][0].getText().equals("X")){
                ganador="X";
                return true;
            }else if(tablero[0][2].getText().equals("O") && tablero[1][1].getText().equals("O") && tablero[2][0].getText().equals("O")){
                ganador="O";
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        caja1_0 = new javax.swing.JLabel();
        caja0_0 = new javax.swing.JLabel();
        caja0_1 = new javax.swing.JLabel();
        caja0_2 = new javax.swing.JLabel();
        caja1_2 = new javax.swing.JLabel();
        caja2_0 = new javax.swing.JLabel();
        caja2_1 = new javax.swing.JLabel();
        caja2_2 = new javax.swing.JLabel();
        caja1_1 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        labelX = new javax.swing.JLabel();
        labelO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        caja1_0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja0_0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja0_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja0_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja1_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja2_0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja2_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja2_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caja1_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Columnas:");

        jLabel2.setText("Filas:");

        jLabel3.setText("0");

        jLabel4.setText("1");

        jLabel5.setText("2");

        jLabel6.setText("0");

        jLabel7.setText("1");

        jLabel8.setText("2");

        btnAgregar.setText("Enviar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        labelX.setText("jLabel9");

        labelO.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caja1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(caja0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(caja0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caja1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caja2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 72, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelX)
                .addGap(29, 29, 29)
                .addComponent(labelO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
        filas=Integer.parseInt(txtFilas.getText());
        columnas=Integer.parseInt(txtColumnas.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "falta una casilla por llenar");
            return;
        }
        if((filas<0||filas>2)||(columnas<0||columnas>2)){
            JOptionPane.showMessageDialog(null, "No se puede colocar ahi");
        }
        if(txtFilas.getText()==null){
            JOptionPane.showMessageDialog(null, "Ingrese valor en filas");
        }else if(txtColumnas.getText()==null){
            JOptionPane.showMessageDialog(null, "Ingrese valor en columna ");
        }
        //si es distinto a vacio
        if ( ! tablero[filas][columnas].getText().equals("")) {
            txtFilas.setText("");
            txtColumnas.setText("");
            JOptionPane.showMessageDialog(null, "Posicion no valida");
            return;
        }
        
        tablero[filas][columnas].setText(ronda);
        ronda = (ronda.equals("X"))?"O":"X";
        txtFilas.setText("");
        txtColumnas.setText("");
        contador++;
        if(contador==9){
            JOptionPane.showMessageDialog(null, "EMPATE");
            this.dispose();
        }
        ganador = (ganador.equalsIgnoreCase("X"))?nombreX:nombreO;
        if(respuestas()){
            JOptionPane.showMessageDialog(null,"Ganaste "+ganador);
            this.dispose();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    public void setlblUser(String usuario){
        this.usuario=usuario;
        labelX.setText(usuario);
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LaraSamuelXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LaraSamuelXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LaraSamuelXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LaraSamuelXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LaraSamuelXO().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel caja0_0;
    private javax.swing.JLabel caja0_1;
    private javax.swing.JLabel caja0_2;
    private javax.swing.JLabel caja1_0;
    private javax.swing.JLabel caja1_1;
    private javax.swing.JLabel caja1_2;
    private javax.swing.JLabel caja2_0;
    private javax.swing.JLabel caja2_1;
    private javax.swing.JLabel caja2_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelO;
    private javax.swing.JLabel labelX;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
