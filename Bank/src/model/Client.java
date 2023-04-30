package model;

import java.util.ArrayList;

public class Client {

    String noCliente;
    String nombre;
    String CURP;
    String apellido;
    
    ArrayList<Account> cuentas;

    public Client(String noCliente, String nombre, String apellido, String CURP,Account cuenta) {
        this.noCliente = noCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        cuentas = new ArrayList<>();
        cuentas.add(cuenta);
    }

    public String getNoCliente() {
        return noCliente;
    }

    public int indiceCuenta() {
        return cuentas.size();
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }

    public ArrayList<Account> getCuentas() {
        return cuentas;
    }

    public void setCuenta(Account cuenta) {
        cuentas.add(cuenta);
    }
    
    public String getCurp(){
        return CURP;
    }
    

}
