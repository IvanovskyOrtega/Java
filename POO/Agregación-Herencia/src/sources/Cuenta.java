package sources;
public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto){
        saldo += monto;
    }
    public void retirar(double monto){
        saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta:" + "\n\tSaldo =" + saldo + '}';
    }
    
}
