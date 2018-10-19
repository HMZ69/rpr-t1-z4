package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Program {

    public static void kreirajPredmet(String naziv, int sifra, int maxBrStudenata, Predmet[] predmeti) {
        for (int i = 0; i < predmeti.length; i++) {
            if (predmeti[i] == null) {
                predmeti[i] = new Predmet(new Student[maxBrStudenata], naziv, sifra, maxBrStudenata);
                System.out.println("Predmet uspješno kreiran!");
                return;
            }
        }
        System.out.println("Dostignut je maksimalan broj predmeta!");
    }

    public static void kreirajStudenta(String ime, String prezime, int brojIndeksa, Student[] studenti) {
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] == null) {
                studenti[i] = new Student(ime, prezime, brojIndeksa);
                System.out.println("Student uspješno kreiran!");
                return;
            }
        }
        System.out.println("Dostignut je maksimalan broj studenata!");
    }

    public static void upisiStudenta(Student s, Predmet p) {
        p.upisi(s);
    }

    public static void ispisiStudenta(Student s, Predmet p) {
        p.ispisi(s);
    }

    public static void izbrisiStudenta(Student s, Student[] studenti) {
        for(int i = 0; i < studenti.length; i++) {
            if (studenti[i] == s) {
                studenti[i] = null;
                for (int j = i; j < studenti.length - 1; j++) {
                    Student tmp = studenti[j];
                    studenti[j] = studenti[j+1];
                    studenti[j+1] = tmp;
                }
                return;
            }
        }
    }

    public static void izbrisiPredmet(Predmet p, Predmet[] predmeti) {
        for(int i = 0; i < predmeti.length; i++) {
            if (predmeti[i] == p) {
                predmeti[i] = null;
                for (int j = i; j < predmeti.length - 1; j++) {
                    Predmet tmp = predmeti[j];
                    predmeti[j] = predmeti[j+1];
                    predmeti[j+1] = tmp;
                }
                return;
            }
        }
    }

    public static void ispisSpiskaStudenata(Predmet p) {
        p.ispisStudenata();
    }

    /*public static void Meni() {
        System.out.println("Dobro došli! Unosom broja birate odgovarajuću funkcionalnost:");
        System.out.println("1 - Kreiranje novog predmeta");
        System.out.println("2 - Kreiranje novog studenta");
        System.out.println("3 - Upis studenta na predmet");
        System.out.println("4 - Ispis studenta sa predmeta");
        System.out.println("5 - Brisanje studenta");
        System.out.println("6 - Brisanje predmeta");
        System.out.println("7 - Ispis spiska studenata na predmetu");
        System.out.println("Za izlaz iz programa unesite -1.");
    }

    public static void Izbori(int izbor) {
        if (izbor == 1) {
            System.out.println("Unesite ime predmeta, šifru predmeta i maksimalan broj studenata (poslije svakog unosa pritisnite ENTER)");
            Scanner ulaz = new Scanner(System.in);
        }
    }*/

    public static void main(String[] args) {
	    Predmet[] predmeti = new Predmet[15];
	    Student[] studenti = new Student[100];

	    /*int izbor = 0;

	    do {
            Meni();
	        Scanner ulaz = new Scanner(System.in);
	        izbor = ulaz.nextInt();
	        Izbori(izbor);
        } while(izbor != -1);

	    System.out.println("Doviđenja!");*/

	    kreirajPredmet("Matematika", 1, 10, predmeti);
	    kreirajStudenta("Hamza", "Muminović", 17543, studenti);
	    kreirajStudenta("Haris", "Šikić", 17656, studenti);
	    kreirajStudenta("Tin", "Vidović", 17345, studenti);
	    kreirajStudenta("Dženita", "Škulj", 17832, studenti);
	    kreirajPredmet("Inženjerska fizika 1", 2, 10, predmeti);
	    upisiStudenta(studenti[3], predmeti[1]);
	    upisiStudenta(studenti[0], predmeti[1]);
	    ispisSpiskaStudenata(predmeti[1]);
    }
}
