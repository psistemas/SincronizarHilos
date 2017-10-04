

/**
 *
 * @author Rental Servicios
 */
public class Cajero implements Runnable{
    CuentaBancaria miCuenta = new CuentaBancaria();

    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            retirarDinero(10);
            System.out.println();
            if (miCuenta.getSaldoActual() < 0) {
                System.out.println("Cuenta con saldo negativo");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Exception: " + ex.getMessage());
            }
        }
    }

    private synchronized void retirarDinero(int valorRetiro) {
        if(miCuenta.getSaldoActual() >= valorRetiro){
            System.out.println("Saldo actual: " + miCuenta.getSaldoActual());
            System.out.println("El usuario: " + Thread.currentThread().getName() + " retirando: " + valorRetiro);
            miCuenta.retiroCuenta(valorRetiro);
            System.out.println("Retiro Exitoso");
            System.out.println("Saldo Final: " + miCuenta.getSaldoActual());
        }else{
            System.out.println("No hay saldo suficiente para realizar la transaccion " + Thread.currentThread().getName());
        }
    }
    
}
