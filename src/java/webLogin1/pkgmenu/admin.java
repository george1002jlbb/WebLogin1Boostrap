/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webLogin1.pkgmenu;

/**
 *
 * @author jbermudezb
 */
public class admin {

    private String usuario;
    private String contrasena;


//    public String insertar3() {
//        if ((verificau(usuario) == true) && (verificac(contrasena) == true)) {
//            return "-1";
//        }
//
//        return "1";
//    }
//
//    public boolean verificau(String key) {
//        String sql = "SELECT * From usuario where usuario='" + key.toString() + "'";
//        if (getCnn().verificar(sql) == 1) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean verificac(String key) {
//        String sql = "SELECT * From contrasena where contrasena='" + key.toString() + "'";
//        if (getCnn().verificar(sql) == 1) {
//            return true;
//        }
//        return false;
//    }

    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getcontrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setcontrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
