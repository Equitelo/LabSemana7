// Carlos Rodriguez
// Samuel Isaac
package labweek7;

import javax.swing.JComboBox;

public class adminUsrs {
    private String nombre;
    private int puntos;
    public String usr;
    private String password;
    
    public adminUsrs(String nombre, String usr, String password){
        this.usr=usr;
        this.password=password;
        this.puntos=0;
    }

    public adminUsrs()
    {
        nombre = "";
        password = "";
        usr = "";
        puntos = 0;
    }
    
    public void setUsr(String usr) {
        this.usr = usr;
    }
    
    public String getUsr() {
        return usr;
    }

    public String getPassword() {
        return password;
    }
    
    public adminUsrs admin[]=new adminUsrs[100];
    
    public adminUsrs getArreglo(int index){
        return admin[index];
    }
    
    public adminUsrs buscarUser(String user){
        for (adminUsrs i : admin) {
            if (i!= null && i.getUsr().equals(user)){
                return i;
            }
        }
        return null;
    }
    
    public boolean agregarUsuario(String nombre, String usr, String password){
            for (int i = 0; i < admin.length; i++) {
                if(admin[i]==null){
                    admin[i] = new adminUsrs(nombre, usr, password);
                    return true;
                }
            }
        return false;
    }
    
    public String[] mostrar(){
        int cantidad = 0;
        for (int i = 0; i < admin.length; i++) {
            if(admin[i]!=null){
                cantidad++;
            }
        }
        String[] nombres = new String[cantidad];
        cantidad = 0;
        for (int i = 0; i < admin.length; i++) {
            if(admin[i]!=null){
                nombres[cantidad] = admin[i].usr;
                cantidad++;
            }
        }
        return nombres;
    }
}
