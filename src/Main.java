import jdk.jshell.execution.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static ArrayList<Film> films = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Utils.ajouterFilm();
        Utils.ajouterFilm();

        Utils.listFilmTitles();
        Utils.listFilmDates();

    }


}
