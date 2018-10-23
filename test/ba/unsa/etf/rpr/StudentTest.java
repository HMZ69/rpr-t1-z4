package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void dajIme() {
        Student s = new Student("Student", "Studentić", 17777);
        assertEquals(s.dajIme(), "Student");
    }

    @Test
    void dajPrezime() {
        Student s = new Student("Student", "Studentić", 17777);
        assertEquals(s.dajPrezime(), "Studentić");
    }

    @Test
    void dajBrojIndeksa() {
        Student s = new Student("Student", "Studentić", 17777);
        assertEquals(s.dajBrojIndeksa(), 17777);
    }

    @Test
    void postaviIme() {
        Student s = new Student("Student", "Studentić", 17777);
        s.postaviIme("Novostudent");
        assertEquals(s.dajIme(), "Novostudent");
    }

    @Test
    void postaviPrezime() {
        Student s = new Student("Student", "Studentić", 17777);
        s.postaviPrezime("Novostudentić");
        assertEquals(s.dajPrezime(), "Novostudentić");
    }

    @Test
    void postaviBrojIndeksa() {
        Student s = new Student("Student", "Studentić", 17777);
        s.postaviBrojIndeksa(18888);
        assertEquals(s.dajBrojIndeksa(), 18888);
    }
}