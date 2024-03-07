/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.dao.ItemVendaDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.dao.VendasDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class FrmPagamentos extends javax.swing.JFrame {

    Clientes cliente = new Clientes();
    DefaultTableModel carrinho;

    public FrmPagamentos() {
        initComponents();
        txtcartao.setText("0");
        txtdinheiro.setText("0");
        txtcheque.setText("0");
        txttroco.setText("0");
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
        jLabel3 = new javax.swing.JLabel();
        txtdinheiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcartao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttroco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnfinalizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setText("Obs:");

        txtdinheiro.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel4.setText("CARTÃO:");

        txtcartao.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setText("CHEQUE:");

        txtcheque.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel6.setText("TROCO:");

        txttroco.setEditable(false);
        txttroco.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("TOTAL:");

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        btnfinalizar.setBackground(new java.awt.Color(204, 204, 204));
        btnfinalizar.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btnfinalizar.setText("Finalizar Venda");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setText("DINHEIRO:");

        txtobs.setColumns(20);
        txtobs.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtobs.setRows(5);
        jScrollPane1.setViewportView(txtobs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txttroco)
                            .addComponent(txtcartao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdinheiro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcheque, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcartao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        //finalizar venda
        double pcartao, pcheque, pdinheiro, totalpago, totalvenda, troco;

        pcartao = Double.parseDouble(txtcartao.getText());
        pcheque = Double.parseDouble(txtcheque.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());
        totalvenda = Double.parseDouble(txttotal.getText());
        //calcular o troco
        totalpago = pcartao + pcheque + pdinheiro;
        troco = totalpago - totalvenda;
        txttroco.setText(String.valueOf(troco));

        Vendas objv = new Vendas();
        //dados do cliente(cliente id)
        objv.setCliente(cliente);
        //pega a data da venda

        Date agora = new Date();
        SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
        String datamysql = dataEUA.format(agora);

        objv.setData_venda(datamysql);
        //TOTAL DA VENDA
        objv.setTotal_venda(totalvenda);
        objv.setObs(txtobs.getText());

        VendasDAO dao_v = new VendasDAO();
        dao_v.cadastrarVenda(objv);

        //retorna o id da ultima venda realizada
        objv.setId(dao_v.retornaUltimaVenda());

        //System.out.println("id da ultima venda"+objv.getId());
        //cadastrando os produtos na tabela itemvendas
        for (int i = 0; i < carrinho.getRowCount(); i++) {
            int qtd_estoque,qtd_comprada,qtd_atualizada;
            
            Produtos objp = new Produtos();
            ProdutosDAO dao_produto=new ProdutosDAO();
            
            ItemVenda item = new ItemVenda();
            item.setVenda(objv);
            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
            //baixa no estoque
            qtd_estoque = dao_produto.retornaEstoqueAtual(objp.getId());
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque-qtd_comprada;
            
            dao_produto.baixaEstoque(objp.getId(),qtd_atualizada);
                    
                    
            ItemVendaDAO daoitem = new ItemVendaDAO();
            daoitem.cadastraItem(item);

        }
        //*************************************
        JOptionPane.showMessageDialog(null, "venda registrada com sucesso! ");


    }//GEN-LAST:event_btnfinalizarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcartao;
    private javax.swing.JTextField txtcheque;
    private javax.swing.JTextField txtdinheiro;
    private javax.swing.JTextArea txtobs;
    public javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttroco;
    // End of variables declaration//GEN-END:variables
}