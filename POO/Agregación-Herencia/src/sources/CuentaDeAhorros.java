package sources;
public class CuentaDeAhorros {
    private double tasaDeInteres;
    private double saldoIni;

    public CuentaDeAhorros(double saldoIni,double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
        this.saldoIni = saldoIni;
    }

    public double consultar() {
        return saldoIni + tasaDeInteres*saldoIni;
    }
}
