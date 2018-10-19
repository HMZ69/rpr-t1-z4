package ba.unsa.etf.rpr;

public class Predmet {
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxBrojStudenata;
    private Student[] studenti = new Student[maxBrojStudenata];
    public
    Predmet(Student[] studenti, String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata) {
        this.studenti = studenti;
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.maxBrojStudenata = maxBrojStudenata;
    }
    Student[] dajStudente() { return this.studenti; }                     //getter
    String dajNazivPredmeta() { return this.nazivPredmeta; }              //getter
    int dajSifraPredmeta() { return this.sifraPredmeta; }                 //getter
    int dajMaxBrojStudenata() { return this.maxBrojStudenata; }           //getter

    void postaviStudente(Student[] s) { this.studenti = s; }              //setter
    void postaviNazivPredmeta(String s) { this.nazivPredmeta = s; }       //setter
    void postaviSifraPredmeta(int x) { this.sifraPredmeta = x; }          //setter
    void postaviMaxBrojStudenata(int x) { this.maxBrojStudenata = x; }    //setter

    void upisi(Student s) {
        for (int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == null) {
                studenti[i] = s;
                System.out.println("Student uspješno upisan na predmet " + this.dajNazivPredmeta() + "!");
                return;
            }
        }
        System.out.println("Dostignut je maksimalan broj studenata na predmetu " + nazivPredmeta + ".");
    }
    void ispisi(Student s) {
        for (int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == s) {
                studenti[i] = null;
                for (int j = i; j < maxBrojStudenata - 1; j++) {
                    Student tmp = studenti[j];
                    studenti[j] = studenti[j+1];
                    studenti[j+1] = tmp;
                }
                System.out.println("Student uspješno ispisan sa predmeta " + this.dajNazivPredmeta() + "!");
                return;
            }
        }
        System.out.println("Student " + s.dajIme() + " " + s.dajPrezime() + " ne sluša predmet " + this.nazivPredmeta + ".");
    }

    void ispisStudenata() {
        for (int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == null)
                break;
            int j = i + 1;
            System.out.print(j + ". ");
            System.out.println(studenti[i]);
        }
    }
}
