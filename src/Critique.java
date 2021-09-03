public class Critique {

    private String nom;
    private String adresseWeb;
    private int note;

    public Critique(String nom, String adresseWeb, int note) {
        this.nom = nom;
        this.adresseWeb = adresseWeb;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseWeb() {
        return adresseWeb;
    }

    public void setAdresseWeb(String adresseWeb) {
        this.adresseWeb = adresseWeb;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
