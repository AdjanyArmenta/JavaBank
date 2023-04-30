package model;

public class Account {
    
    String noCuenta;
    String saldo;
    String noCliente;

    
    public Account(String noCuenta,String noCliente){
        this.noCuenta = noCuenta;
        this.noCliente = noCliente;
        this.saldo = "0";
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public String getSaldo() {
        return saldo;
    }
    
    
}
