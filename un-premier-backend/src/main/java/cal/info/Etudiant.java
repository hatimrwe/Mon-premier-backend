package cal.info;

public class Etudiant {

    String nomEtudiant;
    int ageEtudiant ;
    double noteEtudiant;

    public Etudiant(String nomEtudiant, int ageEtudiant, double noteEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.ageEtudiant = ageEtudiant;
        this.noteEtudiant = noteEtudiant;
    }

    public String obtenirNom() {
        return nomEtudiant;
    }

    public int obtenirAge() {
        return ageEtudiant;
    }

    public double obtenirNote() {
        return noteEtudiant;
    }

    void ajouterPreferenceHackathon(Hackathon hackathon) {
        // Implémentation de l'ajout de préférence pour un hackathon
    }

    void afficherPreference( ){
        // Implémentation de l'affichage des préférences
    }
}
