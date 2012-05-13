package model;

public class UserBean implements java.io.Serializable {

    private String login;
    private String password;
    private String dica;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}