import java.util.ArrayList;
import java.util.Date;

public class Rezultat extends Utakmica{
    private int ID_rezultata;
    private String Rezultat;
    private int homeScore;
    private int awayScore;

    public Rezultat() {//konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_rezultata = 0;
        this.Rezultat = "-";
        this.awayScore=0;
        this.homeScore=0;
    }

    public Rezultat(int utakmicaID, Date datumOdrzavanja, String vrijemeOdrzavanja, int ID_rezultata, String rezultat, int homeScore, int awayScore) { //konstruktor koji prima sve parametre postavljajuci vrijednost atributa
        super(utakmicaID,datumOdrzavanja,vrijemeOdrzavanja);
        this.ID_rezultata = ID_rezultata;
        Rezultat = rezultat;
        this.homeScore=homeScore;
        this.awayScore=awayScore;
    }
    //getteri i setteri

    public int getID_rezultata() {
        return ID_rezultata;
    }

    public void setID_rezultata(int ID_rezultata) {
        this.ID_rezultata = ID_rezultata;
    }

    public String getRezultat() {
        return Rezultat;
    }

    public void setRezultat(String rezultat) {
        Rezultat = rezultat;
    }

    public int getAwayScore() {
        return awayScore;
    }
    public int getHomeScore() {
        return homeScore;
    }

  public void setHomeScore(int homeScore) {
       this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override //metoda za ispis toString
    public String toString(){
        String rezultat = "";
        rezultat = "Rezultat za utakmicu pod ID brojem " + getID_utakmice() +" je "+" " + Rezultat;
        return rezultat;
    }
}


