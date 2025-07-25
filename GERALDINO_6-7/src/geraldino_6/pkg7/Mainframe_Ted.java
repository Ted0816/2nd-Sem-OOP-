/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geraldino_6.pkg7;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author User
 */
public class Mainframe_Ted extends javax.swing.JFrame {

    /**
     * Creates new form Mainframe_Ted
     */
    public Mainframe_Ted() {
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

        jPanel2 = new javax.swing.JPanel();
        clearProd = new javax.swing.JButton();
        IdProd = new javax.swing.JTextField();
        viewProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        QuantityProd = new javax.swing.JTextField();
        NameProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PriceProd = new javax.swing.JTextField();
        addProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        clearProd.setForeground(new java.awt.Color(51, 51, 51));
        clearProd.setText("Clear Form");
        clearProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearProdActionPerformed(evt);
            }
        });

        IdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdProdActionPerformed(evt);
            }
        });

        viewProd.setForeground(new java.awt.Color(51, 51, 51));
        viewProd.setText("View List of All Products");
        viewProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Quantity:");

        NameProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameProdActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Product Name:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Product ID:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Item Price:");

        addProd.setForeground(new java.awt.Color(51, 51, 51));
        addProd.setText("Add Product");
        addProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ageo Trial SemBd", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRODUCT MANAGEMENT");

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name of Product", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ProductTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameProd, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceProd, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityProd, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PriceProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(QuantityProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(addProd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewProd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearProd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearProdActionPerformed
        IdProd.setText("");
        NameProd.setText("");
        PriceProd.setText("");
        QuantityProd.setText("");
    }//GEN-LAST:event_clearProdActionPerformed

    private void IdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdProdActionPerformed

    private void viewProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdActionPerformed
        ViewProducts showthis = new ViewProducts();
        showthis.show();
        dispose();
    }//GEN-LAST:event_viewProdActionPerformed

    private void NameProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameProdActionPerformed

    private void addProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdActionPerformed
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            boolean isEmptyRow = true;
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                if (value != null && !value.toString().trim().isEmpty()) {
                    isEmptyRow = false;
                    break;
                }
            }
            if (isEmptyRow) {
                model.removeRow(i);
            }
        }
        String id = IdProd.getText().trim();
        String name = NameProd.getText().trim();
        String price = PriceProd.getText().trim();
        String quantity = QuantityProd.getText().trim();

        // Validate empty fields
        if (id.isEmpty() || name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input in all fields");
            return;
        }

        // Validate ID: numbers only
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ID must contain numbers only");
            return;
        }

        // Validate Price: numbers only
        if (!price.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Price must contain numbers only");
            return;
        }

        // Check duplicates BEFORE modifying model
        boolean idExists = false;
        boolean nameExists = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (id.equals(model.getValueAt(i, 0))) {
                idExists = true;
            }
            if (name.equalsIgnoreCase((String) model.getValueAt(i, 1))) {
                nameExists = true;
            }
        }

        if (idExists) {
            JOptionPane.showMessageDialog(null, "Please input another ID (duplicate found)");
            return;
        }

        if (nameExists) {
            JOptionPane.showMessageDialog(null, "Please input another name (duplicate found)");
            return;
        }

        // Now try to insert into database
        try {
            Connection connectionNiTed = connectorNiTed.getConnection(); //input connector name class here

            String sql = "INSERT INTO table_ni_ted (id, name, price, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = connectionNiTed.prepareStatement(sql);

            pst.setString(1, id);
            pst.setString(2, name);
            pst.setDouble(3, Double.parseDouble(price));
            pst.setInt(4, Integer.parseInt(quantity));

            pst.executeUpdate();

            // Only add to table if DB insert was successful
            model.addRow(new Object[]{id, name, price, quantity});

            JOptionPane.showMessageDialog(this, "Product added successfully!");

            // Clear input fields
            IdProd.setText("");
            NameProd.setText("");
            PriceProd.setText("");
            QuantityProd.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price and Quantity must be valid numbers.");
            e.printStackTrace();
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Product ID already exists. Use a different ID.");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: Please check your column types or constraints.");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Please Input Correct Product Details");
            e.printStackTrace();
        }
    }//GEN-LAST:event_addProdActionPerformed

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
            java.util.logging.Logger.getLogger(Mainframe_Ted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe_Ted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe_Ted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe_Ted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe_Ted().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdProd;
    private javax.swing.JTextField NameProd;
    private javax.swing.JTextField PriceProd;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField QuantityProd;
    private javax.swing.JButton addProd;
    private javax.swing.JButton clearProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewProd;
    // End of variables declaration//GEN-END:variables
}
