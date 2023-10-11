public class Azubi extends Mitarbeiter {
    private int abgelegtePruefungen;

    public Azubi(String nachname, String vorname, double gehalt,int abgelegtePruefungen) {
        super(nachname, vorname, gehalt);
        this.abgelegtePruefungen = abgelegtePruefungen;
    }

    public Azubi(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    public void setPruefungen(int anzahl) {
        this.abgelegtePruefungen = anzahl;
    }

    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("Abgelegte Pruefungen: " + abgelegtePruefungen);
    }

    @Override
    public void addZulage(double betrag) {
        if (abgelegtePruefungen > 3) {
            super.erhoeheGehalt(betrag);
        }
    }

}