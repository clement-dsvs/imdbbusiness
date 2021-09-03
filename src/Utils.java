import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Utils {

    public static void listFilmTitles() {
        Main.films.sort((f1, f2) -> f1.getTitre().compareTo(f2.getTitre()));

        System.out.println("Films par ordre alphabetique : ");
        for (Film film : Main.films) {
            System.out.println(film.getTitre());
        }
    }

    public static void listFilmDates() {
        Main.films.sort((f1, f2) -> f1.getDateDeSortie().compareTo(f2.getDateDeSortie()) * -1);

        System.out.println("Films par année de sortie :");
        for (Film film : Main.films) {
            System.out.println(film.getTitre());
        }
    }

    public static void ajouterFilm() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ajout d'un nouveau Film");
        System.out.println("titre :");
        String titre = Main.scanner.nextLine();

        Film film = new Film(titre);

        System.out.println("Date de sortie (dd/mm/yyyy) : ");
        String date = Main.scanner.nextLine();
        film.setDateDeSortie(dateFormat.parse(date));

        //realisateurs
        System.out.println("Réalisateurs :");
        do {
            String realNom = "";
            System.out.println("Nom (skip if empty): ");
            realNom = Main.scanner.nextLine();
            if (realNom.isBlank() || realNom.isBlank()) {
                break;
            }

            System.out.println("Prenom :");
            String realPrenom = Main.scanner.nextLine();

            System.out.println("Date de naissance (dd/mm/yyyy) : ");
            String dateNaissance = Main.scanner.nextLine();

            film.addRealisateur(new Personne(realPrenom, realNom, dateFormat.parse(dateNaissance)));

        } while (true);

        //acteurs

        System.out.println("Acteurs :");
        do {
            String acteurNom = "";
            System.out.println("Nom (skip if empty): ");
            acteurNom = Main.scanner.nextLine();
            if (acteurNom.isBlank() || acteurNom.isBlank()) {
                break;
            }

            System.out.println("Prenom :");
            String acteurPrenom = Main.scanner.nextLine();

            System.out.println("Date de naissance (dd/mm/yyyy) : ");
            String dateNaissance = Main.scanner.nextLine();

            film.addRealisateur(new Personne(acteurPrenom, acteurNom, dateFormat.parse(dateNaissance)));

        } while (true);

        //critiques

        do {
            String titreCritique = "";
            System.out.println("Nom du critique :");
            titreCritique = Main.scanner.nextLine();
            if(titreCritique.isBlank() || titreCritique.isEmpty()) {
                break;
            }

            System.out.println("adresse site internet :");
            String adresseCritique = Main.scanner.nextLine();

            System.out.println("Note /10 :");
            int note = Main.scanner.nextInt();

            film.addCritique(new Critique(titreCritique, adresseCritique, note));

        } while (true);


        Main.films.add(film);
    }


    public static Film[] getFilmWithActor(Personne acteur) {
        ArrayList<Film> films = new ArrayList<>();
        for (Film film : Main.films) {
            for (Personne tempActeur : film.getActeurs()) {
                if (tempActeur.getPrenom().equals(acteur.getPrenom()) && tempActeur.getNom().equals(acteur.getNom())) {
                    films.add(film);
                    break;
                }
            }
        }
        return films.toArray(new Film[0]);
    }

    public static Film[] getFilmWithTitleLike(String title) {
        ArrayList<Film> films = new ArrayList<>();
        for (Film film : Main.films) {
            if (film.getTitre().contains(title)) {
                films.add(film);
                break;
            }
        }
        return films.toArray(new Film[0]);
    }

}
