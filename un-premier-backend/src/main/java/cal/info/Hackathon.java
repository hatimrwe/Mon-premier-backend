package cal.info;

import java.util.Date;

public class Hackathon {

    String nomHackathon;
    Date dateHackathon ;
    String themeHackathon;

    public Hackathon(String nomHackathon, Date dateHackathon, String themeHackathon) {
        this.nomHackathon = nomHackathon;
        this.dateHackathon = dateHackathon;
        this.themeHackathon = themeHackathon;
    }

    public String obtenirNom() {
        return nomHackathon;
    }

    public Date obterirDate() {
        return dateHackathon;
    }

    public String obtenirLieu() {
        return themeHackathon;
    }
}
