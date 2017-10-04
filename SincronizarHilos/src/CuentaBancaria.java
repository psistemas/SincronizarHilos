/**
 *
 * @author Rental Servicios
 */
public class CuentaBancaria {
    private int saldoActual = 50;
    
    
  
    public int getSaldoActual(){
        return saldoActual;
    }
    
    public void retiroCuenta(int valorRetiro){
        saldoActual-=valorRetiro; //Saldo actual menos el retiro
    }
}
