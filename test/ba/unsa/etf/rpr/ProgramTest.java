package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void dajStudenti() {
        Program p = new Program();
        assertDoesNotThrow(
                () -> {
                    p.getStudenti();
                });
    }

    @Test
    void dajPredmeti() {
        Program p = new Program();
        assertDoesNotThrow(
                () -> {
                    p.getPredmeti();
                });
    }

    @Test
    void kreirajPredmet() {
        Program p = new Program();
        assertThrows(Exception.class,
                () -> {
                    p.kreirajPredmet("Matematika", 1, 5);
                    p.kreirajPredmet("Fizika", 2, 5);
                    p.kreirajPredmet("Hemija", 3, 5);
                });
    }

    @Test
    void kreirajPredmet2() {
        Program p = new Program();
        assertThrows(Exception.class,
                () -> {
                    p.kreirajPredmet("Matematika", 1, 5);
                    p.kreirajPredmet("Matematika", 1, 5);
                });
    }

    @Test
    void kreirajStudenta() {
        Program p = new Program();
        assertThrows(Exception.class,
                () -> {
                    p.kreirajStudenta("Hamza", "Muminovic", 17543);
                    p.kreirajStudenta("Hamza", "Muminovic", 17543);

                });
    }

    @Test
    void upisiStudenta() {
        Program p = new Program();
        assertDoesNotThrow(
                () -> {
                    p.kreirajStudenta("Hamza", "Muminovic", 17543);
                    p.kreirajPredmet("Matematika", 1, 5);
                    p.upisiStudenta(p.getStudenti()[0], p.getPredmeti()[0]);
                });
    }

    @Test
    void ispisiStudenta() {
        Program p = new Program();
        try {
            p.kreirajStudenta("Hamza", "Muminovic", 17543);
            p.kreirajPredmet("Matematika", 1, 5);
            p.upisiStudenta(p.getStudenti()[0], p.getPredmeti()[0]);
        }
        catch(Exception e) {
            //do nothing
        }
        assertDoesNotThrow(
                () -> {
                    p.ispisiStudenta(p.getStudenti()[0], p.getPredmeti()[0]);
                });
    }

    @Test
    void ispisiStudenta2() {
        Program p = new Program();
        assertThrows(Exception.class,
                () -> {
                    p.kreirajStudenta("Hamza", "Muminovic", 17543);
                    p.kreirajPredmet("Matematika", 1, 5);
                    Student st = new Student("Ibrahim", "Ibrahimovic", 16666);
                    p.ispisiStudenta(st, p.getPredmeti()[0]);
                });
    }

    @Test
    void izbrisiStudenta() {
        Program p = new Program();
        try {
            p.kreirajStudenta("Hamza", "Muminovic", 17543);
        }
        catch(Exception e) {
            //do nothing
        }
        assertDoesNotThrow(
                () -> p.izbrisiStudenta(p.getStudenti()[0])
        );
    }

    @Test
    void izbrisiPredmet() {
        Program p = new Program();
        assertDoesNotThrow(
                () -> {
                    p.kreirajPredmet("Matematika", 1, 5);
                    p.izbrisiPredmet(p.getPredmeti()[0]);
                }
        );
    }

    @Test
    void ispisSpiskaStudenata() {
        Program p = new Program();
        try {
            p.kreirajStudenta("Hamza", "Muminovic", 17543);
            p.kreirajPredmet("Matematika", 1, 5);
            Student st = new Student("Ibrahim", "Ibrahimovic", 16666);
            p.upisiStudenta(p.getStudenti()[0], p.getPredmeti()[0]);
            p.upisiStudenta(st, p.getPredmeti()[0]);
            Predmet pr = p.getPredmeti()[0];
            assertEquals(ispisSpiskaStudenata(p.getPredmeti()[0]), "1. Hamza Muminovic (17543)\n2. IbrahimIbrahimovic (16666)");
        }
        catch(Exception e) {
            //
        }
    }
}