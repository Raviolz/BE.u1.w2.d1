package Es3;

public class ContoCorrente {

    // attributi

    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;


    //costruttore

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }


    // METODI

    // getter

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public double getSaldo() {
        return saldo;
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

