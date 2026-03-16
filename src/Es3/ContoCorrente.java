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

    public void preleva(double x) throws BancaException { // se hai sforato il massimo di movimenti: 50 hai una commissione di 50 cent.
        nMovimenti++;
        if (nMovimenti < maxMovimenti) {
            if (saldo - x < 0) {
                throw new BancaException("Conto in rosso");
            } else {
                saldo = saldo - x;
            }
        } else saldo = saldo - x - 0.50;


    }

    public double restituisciSaldo() {
        return saldo;
    }
}

