public class Sparbuch {
    private String kontonummer;
    private double kapital;
    private float zinssatz;

    public String getKontonummer() {
        return this.kontonummer;
    }

    public double getKapital() {
        return this.kapital;
    }

    public float getZinssatz() {
        return this.zinssatz;
    }

    public double zahleEin(double betrag) {
        return getKapital() + betrag;
    }

    public double hebeAb(double betrag) {
        return getKapital() - betrag;
    }

    public double verzinse(float jahreszins) {
        return getKapital() + getKapital() * jahreszins / 100;
    }

    public double getErtrag(float zins, int laufzeit) {
        double guthaben = getKapital() * Math.pow((1 + zins / 100), laufzeit);
        return guthaben;
    }
}
