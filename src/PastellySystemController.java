/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.UserBean;
import view.FrmMenu;
import view.FrmLogin;

/**
 *
 * @author USER
 */
public class PastellySystemController {

    private FrmMenu guiMenu = null;
    private FrmLogin guiLogin = null;

    public PastellySystemController() {
        guiLogin = new FrmLogin();
        guiLogin.setActionListener(new LoginListener());
        guiLogin.setVisible(true);
    }

    class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("Logar".equals(e.getActionCommand())) {
                UserBean userBean = new UserBean();
                userBean.setLogin(String.valueOf(guiLogin.txtUsuario.getText()));
                userBean.setPassword(String.valueOf(guiLogin.txtSenha.getPassword()));
                try {
                    UserDao userDao = new UserDao(ConnectionFactory.getConnection());
                    // Descomentar if e comentar else if para utilizar o banco
                    /*if (userDao.Login(userBean) != 0) {
                        userBean.setNivel(userDao.getNivel(userBean));
                        guiLogin.dispose();
                        guiMenu = new FrmMenu();
                        guiMenu.setActionListener(new MenuListener());
                    } else*/ if (userBean.getLogin().equals("admin")
                            && userBean.getPassword().equals("admin")){
                        userBean.setNivel(1);
                        guiLogin.dispose();
                        guiMenu = new FrmMenu();
                        guiMenu.setActionListener(new MenuListener());
                        guiMenu.setVisible(true);
                        // TODO Frame sendo exibido sem bordas
                    } else {
                        JOptionPane.showMessageDialog(guiMenu, "O usuário "
                                + userBean.getLogin() + " não existe ou a senha "
                                + "digitada é inválida.", "Falha de login.",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PastellySystemController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PastellySystemController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if ("Sair".equals(e.getActionCommand())) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(guiLogin, "Um evento inesperado "
                        + "foi lançado no sistema.", "Contate os desenvolvedo"
                        + "res", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    class MenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
}
