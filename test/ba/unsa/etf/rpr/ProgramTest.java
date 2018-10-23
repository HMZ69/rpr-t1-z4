package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void dajStudenti() {
        Predmet[] predmeti = null;
        Student[] studenti = null;
        Program p = new Program(predmeti, studenti);
        assertSame(p.dajStudenti(), null);
    }

    @Test
    void dajPredmeti() {
        Predmet[] predmeti = null;
        Student[] studenti = null;
        Program p = new Program(predmeti, studenti);
        assertSame(p.dajPredmeti(), null);
    }

    @Test
    void kreirajPredmet() {

    }

    @Test
    void kreirajStudenta() {
    }

    @Test
    void upisiStudenta() {
    }

    @Test
    void ispisiStudenta() {
    }

    @Test
    void izbrisiStudenta() {
    }

    @Test
    void izbrisiPredmet() {
    }

    @Test
    void ispisSpiskaStudenata() {
    }

    @Test
    void main() {
    }
}