import java.util.ArrayList;
import java.util.Date;

public class Utakmica {
    private int ID_utakmice;
    private String Stadion;
    private Date Datum_odrzavanja;
    private String Vrijeme_odrzavanja;
    private ArrayList<Rezultat> rezultat;

    public Utakmica() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_utakmice = 0;
        this.Stadion = "";
        this.Datum_odrzavanja = new Date();
        this.Vrijeme_odrzavanja = "";
    }

    public Utakmica(int ID_utakmice,Date datum_odrzavanja,String vrijeme_odrzavanja){
        this.ID_utakmice=ID_utakmice;
        this.Datum_odrzavanja=datum_odrzavanja;
        this.Vrijeme_odrzavanja=vrijeme_odrzavanja;
        this.rezultat=new ArrayList<>();
    }
    public Utakmica(int ID_utakmice, String stadion, Date datum_odrzavanja, String vrijeme_odrzavanja, Rezultat ID_rezultata) {
        //konstruktor koji prima sve parametre postavljajuci vrijednost
        this.ID_utakmice = ID_utakmice;
        Stadion = stadion;
        Datum_odrzavanja = datum_odrzavanja;
        Vrijeme_odrzavanja = vrijeme_odrzavanja;
    }
    //getteri i setteri

    public int getID_utakmice() {
        return ID_utakmice;
    }

    public void setID_utakmice(int ID_utakmice) {
        this.ID_utakmice = ID_utakmice;
    }

    public String getStadion() {
        return Stadion;
    }

    public void setStadion(String stadion) {
        Stadion = stadion;
    }

    public Date getDatum_odrzavanja() {
        return Datum_odrzavanja;
    }

    public void setDatum_odrzavanja(Date datum_odrzavanja) {
        Datum_odrzavanja = datum_odrzavanja;
    }

    public String getVrijeme_odrzavanja() {
        return Vrijeme_odrzavanja;
    }

    public void setVrijeme_odrzavanja(String vrijeme_odrzavanja) {
        Vrijeme_odrzavanja = vrijeme_odrzavanja;
    }

    public void dodajRezultat(Rezultat rezultati){
        rezultat.add(rezultati);
    }

    public Rezultat getRezultat(int ID_utakmice){
        for (Rezultat utakmicaRezultat : rezultat){
            if (utakmicaRezultat.getID_utakmice()==ID_utakmice){
                return utakmicaRezultat;
            }
        }
        return null;
    }
}

