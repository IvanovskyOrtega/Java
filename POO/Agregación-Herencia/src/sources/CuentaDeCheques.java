package sources;
public class CuentaDeCheques {
    private double montoSobregiro;
    private double saldoIni;

    public CuentaDeCheques(double montoSobregiro, double saldoIni) {
        this.montoSobregiro = 1000;
        this.saldoIni = saldoIni;
    }

    public CuentaDeCheques(double saldoIni) {
        this.saldoIni = saldoIni;
    }
    public void retirar(double monto){
        if(monto > saldoIni+montoSobregiro)
              System.out.println("No te podemos prestar más :v");
        else
            saldoIni -= monto;
    }
}
