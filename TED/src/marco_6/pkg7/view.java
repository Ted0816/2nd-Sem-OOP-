/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marco_6.pkg7;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        refreshProductTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LIST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 530, 38));

        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 190, 50));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 311, 30));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search for Product: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        ProductTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCT ID", "Product Name", "Item Price (IN PHP)", "Quantity Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ProductTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 450, 549));

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 193, 60));

        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 193, 60));

        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("EDIT PRODUCT DETAIL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 193, 60));

        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("REMOVE A PRODUCT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 193, 60));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        searchButton.setForeground(new java.awt.Color(51, 51, 51));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(840, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(searchButton)
                .addContainerGap(490, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        searchField.setText("");

        DefaultTableModel model = (DefaultTableModel) ProductTable2.getModel();
        model.setRowCount(0);

        try {
            Connection conn = connector_marco.getConnection();
            String sql = "SELECT * FROM lamesa";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getInt("id"),
                    rs.getString("nameProduct"),
                    rs.getDouble("priceProduct"),
                    rs.getInt("quantProduct")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed
private void refreshProductTable() {
    DefaultTableModel model = (DefaultTableModel) ProductTable2.getModel();
    model.setRowCount(0); // Clear table

    try {
        Connection conn = connector_marco.getConnection();
        String sql = "SELECT * FROM lamesa";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nameProduct"),
                rs.getDouble("priceProduct"),
                rs.getInt("quantProduct")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading products: " + e.getMessage());
        e.printStackTrace();
    }
}
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String keyword = searchField.getText().trim();

        DefaultTableModel model = (DefaultTableModel) ProductTable2.getModel();
        model.setRowCount(0); // Clear current rows

        try {
            Connection conn = connector_marco.getConnection();

            String sql;
            PreparedStatement pst;

            if (keyword.isEmpty()) {
                // If search field empty, show all products
                sql = "SELECT * FROM lamesa";
                pst = conn.prepareStatement(sql);
            } else {
                // Search by id or name containing the keyword (case insensitive for name)
                sql = "SELECT * FROM lamesa WHERE CAST(id AS CHAR) LIKE ? OR LOWER(nameProduct) LIKE ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, "%" + keyword + "%");
                pst.setString(2, "%" + keyword.toLowerCase() + "%");
            }

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getInt("id"),
                    rs.getString("nameProduct"),
                    rs.getDouble("priceProduct"),
                    rs.getInt("quantProduct")
                };
                model.addRow(row);
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No products found matching: " + keyword);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
main_frame showThis = new main_frame();
showThis.show();
dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String inputId = JOptionPane.showInputDialog(this, "Enter the Product ID to edit:");

        if (inputId == null || inputId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Edit cancelled or ID is empty.");
            return;
        }

        if (!inputId.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid ID. Please enter numbers only.");
            return;
        }

        try {
            Connection conn = connector_marco.getConnection();

            // Check if product exists
            String checkQuery = "SELECT * FROM lamesa WHERE id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, Integer.parseInt(inputId));
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No product found with ID: " + inputId);
                return;
            }

            String currentName = rs.getString("nameProduct");
            double currentPrice = rs.getDouble("priceProduct");
            int currentQuantity = rs.getInt("quantProduct");

            String newName = JOptionPane.showInputDialog(this, "Enter new product name:", currentName);
            if (newName == null || newName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Edit cancelled or name is empty.");
                return;
            }

            String newPriceStr = JOptionPane.showInputDialog(this, "Enter new product price:", String.valueOf(currentPrice));
            double newPrice;
            try {
                newPrice = Double.parseDouble(newPriceStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid price.");
                return;
            }

            String newQuantityStr = JOptionPane.showInputDialog(this, "Enter new product quantity:", String.valueOf(currentQuantity));
            int newQuantity;
            try {
                newQuantity = Integer.parseInt(newQuantityStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid quantity.");
                return;
            }

            // Update
            String updateQuery = "UPDATE lamesa SET nameProduct = ?, pricePrice = ?, quantProduct = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, newName);
            updateStmt.setDouble(2, newPrice);
            updateStmt.setInt(3, newQuantity);
            updateStmt.setInt(4, Integer.parseInt(inputId));

            int rowsUpdated = updateStmt.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Product updated successfully!");
                refreshProductTable();
            } else {
                JOptionPane.showMessageDialog(this, "Update failed.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unexpected Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String inputId = JOptionPane.showInputDialog(this, "Enter the Product ID to delete:");

        if (inputId == null || inputId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deletion cancelled or ID is empty.");
            return;
        }

        if (!inputId.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid ID. Please enter numbers only.");
            return;
        }

        try {
            Connection con = connector_marco.getConnection();

            String checkQuery = "SELECT * FROM lamesa WHERE id = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setInt(1, Integer.parseInt(inputId));
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No product found with ID: " + inputId);
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this product?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;

            String deleteQuery = "DELETE FROM lamesa WHERE id = ?";
            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, Integer.parseInt(inputId));
            deleteStmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Product deleted successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
        refreshProductTable();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }
private void loadAllProducts() {
       DefaultTableModel model = (DefaultTableModel) ProductTable2.getModel();
        model.setRowCount(0);

        try {
            java.sql.Connection storeConnection = connector_marco.getConnection();
            String sql = "SELECT * FROM products";
            PreparedStatement pst = storeConnection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) { //DATABSE COLUMN NAME HERE DAPAT
                Object[] row = new Object[]{
                    rs.getInt("id"),
                    rs.getString("item_name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),};
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductTable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
