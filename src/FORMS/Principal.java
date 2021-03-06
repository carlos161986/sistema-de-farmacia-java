package FORMS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on Jul 10, 2011, 1:35:16 PM
 */




import CLASES.Empleado;
import CLASES.Venta;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.sql.SQLException;
import javax.swing.JDesktopPane;

/**
 *
 * @author Anita
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuEmpleado = new javax.swing.JMenu();
        menuMedicamento = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia");
        setBackground(new java.awt.Color(51, 51, 51));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 48));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("\"FARMABOL\" ");
        jLabel4.setBounds(540, 60, 300, 60);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cruz_Roja.svg.png"))); // NOI18N
        jLabel5.setBounds(630, 140, 130, 150);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/enfermera.png"))); // NOI18N
        jLabel3.setBounds(850, 10, 260, 520);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FBE.GIF"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 490, 590);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jLabel2.setMaximumSize(new java.awt.Dimension(1958, 1080));
        jLabel2.setBounds(490, 0, 630, 570);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 51));

        menuCliente.setForeground(new java.awt.Color(255, 0, 51));
        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        menuCliente.setText("Cliente              ");
        menuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCliente);

        menuEmpleado.setForeground(new java.awt.Color(255, 0, 51));
        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/emmpleado.png"))); // NOI18N
        menuEmpleado.setText("Empleado            ");
        menuEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpleadoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmpleado);

        menuMedicamento.setForeground(new java.awt.Color(255, 0, 51));
        menuMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medicamento1.png"))); // NOI18N
        menuMedicamento.setText("Compra          ");
        menuMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMedicamentoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuMedicamento);

        jMenu1.setForeground(new java.awt.Color(255, 0, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ventass.png"))); // NOI18N
        jMenu1.setText(" Venta                   ");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 0, 51));
        jMenu2.setText("Proveedor            ");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setForeground(new java.awt.Color(255, 0, 51));
        jMenu4.setText("Categoria          ");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(255, 0, 51));
        jMenu3.setText("Medicamentos      ");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        FORM_VENTAS f = new FORM_VENTAS();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void menuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClienteMouseClicked
        // TODO add your handling code here:
        formCliente fc=new formCliente();
        jDesktopPane1.add(fc);
        fc.show();

    }//GEN-LAST:event_menuClienteMouseClicked

    private void menuEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpleadoMouseClicked
        // TODO add your handling code here:
        FormEmpleado fe=new FormEmpleado();
        jDesktopPane1.add(fe);
        fe.show();
    }//GEN-LAST:event_menuEmpleadoMouseClicked

    private void menuMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMedicamentoMouseClicked
        // TODO add your handling code here:
        FormCompras fc = new FormCompras();
        jDesktopPane1.add(fc);
        fc.show();
}//GEN-LAST:event_menuMedicamentoMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        formproveedor fp = new formproveedor();
        jDesktopPane1.add(fp);
        fp.show();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        FromCategoria fc = new FromCategoria();
        jDesktopPane1.add(fc);
        fc.show();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        formMedicamento fm = new formMedicamento();
        jDesktopPane1.add(fm);
        fm.show();
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuMedicamento;
    // End of variables declaration//GEN-END:variables

}
