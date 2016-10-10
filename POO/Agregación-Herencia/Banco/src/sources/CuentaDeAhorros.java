package sources;
public class CuentaDeAhorros extends Cuenta {
    private double tasaDeInteres;

    public CuentaDeAhorros(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaDeInteres = tasaInteres;
    }

    @Override
    public double consultar() {
        return saldo = saldo + tasaDeInteres*saldo;
    }
}
