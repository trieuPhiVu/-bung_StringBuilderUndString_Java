public class Angestellter extends Mitarbeiter {
    // private static final int MAX_STUFE = 5;
    private int stufe;

    public Angestellter(String nachname, String vorname, double gehalt,int stufe) {
        super(nachname, vorname, gehalt);
        this.stufe = stufe;
    }

    public Angestellter(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    public void befoerdere() {
        stufe++;
    }

    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("Stufe: " + stufe);
    }

    @Override
    public void addZulage(double betrag) {
        if (stufe > 1) {
            super.erhoeheGehalt(betrag);
        }
    }
}