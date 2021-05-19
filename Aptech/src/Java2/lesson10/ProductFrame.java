/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson10;

import com.google.gson.Gson;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MyPC
 */
public class ProductFrame extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    DefaultTableModel tblModel1;
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    int index = -1;
    int index1 = -1;

    /**
     * Creates new form ProductFrame
     */
    public ProductFrame() {
        initComponents();
        tblModel = (DefaultTableModel) tblCategory.getModel();
        tblModel1 = (DefaultTableModel) tblProduct.getModel();
        tblCategory.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                index = tblCategory.getSelectedRow();
                txtCategory.setText(categoryList.get(index).getCategoryName());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        tblProduct.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                index1 = tblProduct.getSelectedRow();
                txtName.setText(productList.get(index1).getName());
                boxCategory.setSelectedItem(productList.get(index1).getCategoryName());
                txtPrice.setText(String.valueOf(productList.get(index1).getPrice()));
                txtDescription.setText(productList.get(index1).getDescription());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btnInsertCategory = new java.awt.Button();
        btnEditCategory = new java.awt.Button();
        btnDeleteCategory = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        boxCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnInsertProduct = new java.awt.Button();
        btnEditProduct = new java.awt.Button();
        btnDeleteProduct = new java.awt.Button();
        btnProductSearch = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin"));

        jLabel1.setText("Ten danh muc:");

        btnInsertCategory.setLabel("Them");
        btnInsertCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCategoryActionPerformed(evt);
            }
        });

        btnEditCategory.setLabel("Sua");
        btnEditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setLabel("Xoa");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ten danh muc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnInsertCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnEditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnInsertCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin san pham"));

        jLabel2.setText("Ten SP:");

        jLabel3.setText("Danh muc SP:");

        jLabel4.setText("Gia SP:");

        jLabel5.setText("Mo ta SP:");

        btnInsertProduct.setLabel("Them");
        btnInsertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertProductActionPerformed(evt);
            }
        });

        btnEditProduct.setLabel("Sua");
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setLabel("Xoa");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnProductSearch.setLabel("Tim kiem");
        btnProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSearchActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ten", "Danh muc", "Gia", "Mo ta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(boxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(btnInsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCategoryActionPerformed
        // TODO add your handling code here:
        Category category = new Category(txtCategory.getText());
        categoryList.add(category);
        boxCategory.addItem(category.getCategoryName());
        txtCategory.setText("");
        tblModel.setRowCount(0);
        for (Category category1 : categoryList) {
            tblModel.addRow(new Object[]{tblModel.getRowCount() + 1, category1.getCategoryName()});
        }
        saveXML();
    }//GEN-LAST:event_btnInsertCategoryActionPerformed

    private void saveXML() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("category.xml");
            String categoryList1 = "";
            for (Category category : categoryList) {
                categoryList1 += category.toXML();
            }
            String content = toXML(categoryList1);
            byte[] b = content.getBytes();
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private String toXML(String categoryList) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "\n"
                + "<category-list>\n"
                + categoryList
                + "</category-list>";
    }
    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        // TODO add your handling code here:
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui long lua chon danh muc muon xoa!!");
        } else {
            categoryList.remove(index);
            tblModel.setRowCount(0);
            for (Category category1 : categoryList) {
                tblModel.addRow(new Object[]{tblModel.getRowCount() + 1, category1.getCategoryName()});
            }
            txtCategory.setText("");
            index = -1;
        }
        saveXML();
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void btnEditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCategoryActionPerformed
        // TODO add your handling code here:
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui long lua chon danh muc muon sua!!");
        } else {
            categoryList.get(index).setCategoryName(txtCategory.getText());
            tblModel.setRowCount(0);
            for (Category category1 : categoryList) {
                tblModel.addRow(new Object[]{tblModel.getRowCount() + 1, category1.getCategoryName()});
            }
            txtCategory.setText("");
            index = -1;
        }
        saveXML();
    }//GEN-LAST:event_btnEditCategoryActionPerformed

    private void btnInsertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertProductActionPerformed
        // TODO add your handling code here:
        Product product = new Product(txtName.getText(), String.valueOf(boxCategory.getSelectedItem()),
                txtDescription.getText(), Float.parseFloat(txtPrice.getText()));
        productList.add(product);
        txtName.setText("");
        boxCategory.setSelectedIndex(0);
        txtPrice.setText("");
        txtDescription.setText("");
        tblModel1.setRowCount(0);
        for (Product product1 : productList) {
            tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
        }
        saveJSON();
    }//GEN-LAST:event_btnInsertProductActionPerformed
    
    private void saveJSON(){
        Gson gson = new Gson();
        String json = gson.toJson(productList);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("products.json");
            byte[] b = json.getBytes();
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        // TODO add your handling code here:
        if (index1 < 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui long lua chon san pham muon sua!!");
        } else {
            productList.get(index1).setName(txtName.getText());
            productList.get(index1).setCategoryName(String.valueOf(boxCategory.getSelectedItem()));
            productList.get(index1).setPrice(Float.parseFloat(txtPrice.getText()));
            productList.get(index1).setDescription(txtDescription.getText());
            tblModel1.setRowCount(0);
            for (Product product1 : productList) {
                tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                    product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
            }
            txtName.setText("");
            boxCategory.setSelectedIndex(0);
            txtPrice.setText("");
            txtDescription.setText("");
            index1 = -1;
        }
        saveJSON();
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
        if (index1 < 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui long lua chon san pham muon xoa!!");
        } else {
            productList.remove(index1);
            tblModel1.setRowCount(0);
            for (Product product1 : productList) {
                tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                    product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
            }
            txtName.setText("");
            boxCategory.setSelectedIndex(0);
            txtPrice.setText("");
            txtDescription.setText("");
            index1 = -1;
        }
        saveJSON();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSearchActionPerformed
        // TODO add your handling code here:
        String nameSearch = JOptionPane.showInputDialog("Ten san pham muon tim kiem:");
        try {
            if (nameSearch.isEmpty()) {
                tblModel1.setRowCount(0);
                for (Product product1 : productList) {
                    tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                        product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
                }
            }
        } catch (Exception e) {
            return;
        }
        tblModel1.setRowCount(0);
        int check = 0;
        for (Product product1 : productList) {
            if (product1.getName().equalsIgnoreCase(nameSearch)) {
                tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                    product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
                check++;
            }
        }
        if (check == 0) {
            JOptionPane.showMessageDialog(rootPane, "Khong tim thay san pham can tim kiem!!");
            tblModel1.setRowCount(0);
            for (Product product1 : productList) {
                tblModel1.addRow(new Object[]{tblModel1.getRowCount() + 1, product1.getName(),
                    product1.getCategoryName(), product1.getPrice(), product1.getDescription()});
            }
        }
    }//GEN-LAST:event_btnProductSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCategory;
    private java.awt.Button btnDeleteCategory;
    private java.awt.Button btnDeleteProduct;
    private java.awt.Button btnEditCategory;
    private java.awt.Button btnEditProduct;
    private java.awt.Button btnInsertCategory;
    private java.awt.Button btnInsertProduct;
    private java.awt.Button btnProductSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}