package sources;
public class CuentaDeCheques extends Cuenta{
    private double montoSobregiro;
    public CuentaDeCheques(double saldo, double montoSobregiro) {
        super(saldo);
        this.montoSobregiro = montoSobregiro;
    }
    public CuentaDeCheques(double saldo) {
        super(saldo);
    }
    @Override
    public void retirar(double monto){
        if(saldo <=0){
            if(monto > montoSobregiro)
            System.out.println("No te podemos prestar más :v");
        else
            saldo = saldo - monto;
        }
        else{
            if(monto > saldo+montoSobregiro)
            System.out.println("No te podemos prestar más :v");
        else
            saldo = saldo - monto;
        }
       
    }
}
