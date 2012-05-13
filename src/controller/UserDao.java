package controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserBean;

public class UserDao {

    private Connection connection;

    public UserDao(Connection c) {
        connection = c;
    }
    
    public int Login(UserBean userBean) throws SQLException {
        int returnValue = 0;
        
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT "
                    + "NivelUsuario FROM t_usuario WHERE LoginUsuario=? "
                    + "AND SenhaUsuario=?");
            statement.setString(1, userBean.getLogin());
            statement.setString(2, userBean.getPassword());
            ResultSet rs = statement.executeQuery();
            if (rs.first()) {
                returnValue = rs.getInt(0);
            }
            rs.close();
        } catch (SQLException e) {
            throw new SQLException();
        }
        
        return returnValue;
    }

    public UserBean getById(String login) {
        UserBean user = new UserBean();

        try {
            PreparedStatement statement = connection.prepareStatement("select * from User where email = ?");
            statement.setString(1, login);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                user.setLogin(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                return user;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public int getNivel(UserBean userBean) throws SQLException {
        int returnValue = 0;
        
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT "
                    + "NivelUsuario FROM t_usuario WHERE LoginUsuario=?");
            statement.setString(1, userBean.getLogin());
            ResultSet rs = statement.executeQuery();
            returnValue = rs.getInt(0);
            rs.close();
        } catch (SQLException e) {
            throw new SQLException();
        }
        
        return returnValue;
    }
}