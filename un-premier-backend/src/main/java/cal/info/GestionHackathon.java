package cal.info;

import java.util.ArrayList;

public class GestionHackathon {

    private ArrayList<Hackathon> listeHackathon = new ArrayList<>();


    public void ajouterHackathon(Hackathon hackathon) {
        listeHackathon.add(hackathon);
    }

    public void modifierHackathon(int index, Hackathon hackathon) {
        if (index >= 0 && index < listeHackathon.size()) {
            listeHackathon.set(index, hackathon);
        }
    }

    public void supprimerHackathon(String nomHackathon) {
        listeHackathon.removeIf(h -> h.obtenirNom().equals(nomHackathon));
    }

    public void afficherHackathons() {
        for (Hackathon hackathon : listeHackathon) {
            // Afficher les détails du hackathon
        }
    }

    public void creerEtudiants(Etudiant etudiant) {
        // Ajouter l'étudiant à une liste ou effectuer d'autres opérations
    }

    public void formerEquipes(Equipe equipe) {
        // Ajouter l'équipe à une liste ou effectuer d'autres opérations
    }
}
