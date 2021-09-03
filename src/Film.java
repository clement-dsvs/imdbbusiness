import java.util.ArrayList;
import java.util.Date;

public class Film {

    private String titre;
    private ArrayList<Personne> acteurs;
    private ArrayList<Personne> realisateurs;
    private Date dateDeSortie;
    private String[] categories;
    private String synopsis;
    private ArrayList<Critique> critiques;


    public Film(String titre) {
        this.acteurs = new ArrayList<>();
        this.realisateurs = new ArrayList<>();
        this.critiques = new ArrayList<>();

        this.titre = titre;
        this.synopsis = "";
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Personne> getActeurs() {
        return acteurs;
    }

    public void addRealisateur(Personne realisateur) {
        this.realisateurs.add(realisateur);
    }

    public void addCritique(Critique critique){
        this.critiques.add(critique);
    }

    public Date getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(Date dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
