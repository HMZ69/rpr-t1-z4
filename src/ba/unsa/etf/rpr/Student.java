package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    public
    Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }
    String dajIme() { return this.ime; }
    String dajPrezime() { return this.prezime; }
    int dajBrojIndeksa() { return this.brojIndeksa; }

    void postaviIme(String ime) { this.ime = ime; }
    void postaviPrezime(String prezime) { this.prezime = prezime; }
    void postaviBrojIndeksa(int x) { this.brojIndeksa = x; }

    public String toString() {
        return this.ime + " " + this.prezime + " (" + this.brojIndeksa + ")";
    }
}
