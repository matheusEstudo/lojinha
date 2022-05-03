/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.senac.tela;

import br.com.senac.dao.HibernateUtil;
import br.com.senac.dao.cliente.ClienteDao;
import br.com.senac.dao.cliente.ClienteDaoImpl;
import br.com.senac.dao.usuario.UsuarioDao;
import br.com.senac.dao.usuario.UsuarioDaoImpl;
import br.com.senac.dao.vendedor.VendedorDao;
import br.com.senac.dao.vendedor.VendedorDaoimpl;
import br.com.senac.entidade.*;
import static br.com.senac.util.Funcoes.*;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author matheus
 */
public class Cadastro extends javax.swing.JFrame {

    private Session session;
    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private Cliente cliente;
    private ClienteDao clienteDao;
    private Vendedor vendedor;
    private VendedorDao vendedorDao;

    public Cadastro() {
        initComponents();
        usuarioDao = new UsuarioDaoImpl();
        clienteDao = new ClienteDaoImpl();
        vendedorDao = new VendedorDaoimpl();
        lbErro.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VarSenha = new javax.swing.JPasswordField();
        VarNome = new javax.swing.JTextField();
        VarUsuario = new javax.swing.JTextField();
        VarCpf = new javax.swing.JFormattedTextField();
        btCriar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        rbCliente = new javax.swing.JRadioButton();
        rbVendedor = new javax.swing.JRadioButton();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel3.setText("Cpf:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel5.setText("Senha:");

        try {
            VarCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btCriar.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        btCriar.setText("Criar");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        BtLimpar.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        rbCliente.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        rbCliente.setText("Cliente");

        rbVendedor.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        rbVendedor.setText("Vendedor");

        lbErro.setForeground(new java.awt.Color(255, 51, 51));
        lbErro.setText("selecionar apenas um");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbCliente)
                    .addComponent(lbErro))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtLimpar)
                    .addComponent(btCriar))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(VarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VarCpf)
                            .addComponent(VarUsuario)
                            .addComponent(VarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbErro)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed

        String nome = VarNome.getText().trim();
        String user = VarUsuario.getText().trim();
        String cpf = VarCpf.getText().trim();
        String tipoUsuario = radioBoxVerificar();
        String senha = String.valueOf(VarSenha.getPassword()).trim();

        if (validarCadastro(nome, user, cpf, senha) && tipoUsuario != null) {
            System.out.println(tipoUsuario);
            usuario = new Usuario(null, nome, cpf, tipoUsuario, user, senha);
            session = HibernateUtil.abrirConexao();
            usuarioDao.salvarOuAlterar(usuario, session);

            if (tipoUsuario.equals("cliente")) {
                cliente = new Cliente(null, nome, cpf, user, senha);
                clienteDao.salvarOuAlterar(cliente, session);

            } else if (tipoUsuario.equals("vendedor")) {
                vendedor = new Vendedor(null, nome, cpf, null, user, senha);
                vendedorDao.salvarOuAlterar(vendedor, session);
            }

            session.close();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        }

    }//GEN-LAST:event_btCriarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        limpar();
    }//GEN-LAST:event_BtLimparActionPerformed

    private boolean validarCadastro(String nome, String user, String cpf, String senha) {

        if (!quantidadeCaracteres(nome, 3)) {
            JOptionPane.showMessageDialog(null, "nome invalido");
            return false;

        } else if (!quantidadeCaracteres(user, 3)) {
            JOptionPane.showMessageDialog(null, "usuario invalido");
            return false;

        } else if (!validarCpf(cpf, 14)) {
            JOptionPane.showMessageDialog(null, "cpf invalido");
            return false;

        } else if (!quantidadeCaracteres(senha, 8)) {
            JOptionPane.showMessageDialog(null, "senha invalido");
            return false;
        }

        return true;
    }

    private String radioBoxVerificar() {

        if (rbCliente.isSelected()) {
            return "cliente";

        }
        if (rbVendedor.isSelected()) {
            return "vendedor";

        }
        if (!rbCliente.isSelected() && !rbVendedor.isSelected()) {
            lbErro.setVisible(true);
            return null;

        }
        if (rbCliente.isSelected() == true && rbVendedor.isSelected() == true) {
            lbErro.setVisible(true);
            return null;
        }

        return null;
    }

    private void limpar() {
        VarNome.setText("");
        VarCpf.setText("");
        VarUsuario.setText("");
        VarSenha.setText("");
    }

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtLimpar;
    private javax.swing.JFormattedTextField VarCpf;
    private javax.swing.JTextField VarNome;
    private javax.swing.JPasswordField VarSenha;
    private javax.swing.JTextField VarUsuario;
    private javax.swing.JButton btCriar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbErro;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JRadioButton rbVendedor;
    // End of variables declaration//GEN-END:variables
}