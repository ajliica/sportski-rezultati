import java.util.ArrayList;

public class Liga {
    private int ID_lige;
    private String Naziv_lige;
    private int Br_timova;


    public Liga() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_lige = 0;
        this.Naziv_lige = "";
        this.Br_timova = 0;
    }

    public Liga(int ID_lige, String naziv_lige, int br_timova) { //konstruktor koji prima sve parametre postavljajuci vrijednost atributa
        this.ID_lige = ID_lige;
        Naziv_lige = naziv_lige;
        Br_timova = br_timova;
    }
    //geteri i setteri
    public int getID_lige() {
        return ID_lige;
    }

    public void setID_lige(int ID_lige) {
        this.ID_lige = ID_lige;
    }

    public String getNaziv_lige() {
        return Naziv_lige;
    }

    public void setNaziv_lige(String naziv_lige) {
        Naziv_lige = naziv_lige;
    }

    public int getBr_timova() {
        return Br_timova;
    }

    public void setBr_timova(int br_timova) {
        Br_timova = br_timova;
    }

    @Override //metoda za ispis toString
    public String toString(){
        String rezultat = "";
        rezultat = " ID_lige:" + ID_lige + " Naziv lige:" + Naziv_lige + "Broj timova: " + Br_timova;
        return rezultat;
    }
}
