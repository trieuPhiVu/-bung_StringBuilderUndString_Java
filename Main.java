public class Main {
    public static void main(String[] args) {
        Azubi vu = new Azubi("Trieu", "Vu", 1000, 2);
        vu.setPruefungen(4);
        vu.addZulage(500);
        vu.zeigeDaten();

        Angestellter ngoc = new Angestellter("Vu", "Ngoc", 3000, 1);
        ngoc.befoerdere();
        ngoc.addZulage(2000);
        ngoc.zeigeDaten();

    }
}
