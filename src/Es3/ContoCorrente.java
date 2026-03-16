package Es3;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}

