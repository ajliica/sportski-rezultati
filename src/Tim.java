import java.util.ArrayList;
import java.util.List;

public class Tim {
    private int ID_tima;
    private String Naziv;

    private ArrayList<Igraci> igrac;

    public Tim() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_tima = 0;
        this.Naziv = "";
        this.igrac = new ArrayList<>();
    }
    public Tim(String nazivTima){
        this.Naziv=nazivTima;
    }
    public Tim(int ID_tima, String naziv, ArrayList<Igraci> igrac) { //konsturktor koji prima sve parametre postavljajuci vrijednost atributa
        this.ID_tima = ID_tima;
        Naziv = naziv;
        this.igrac =  igrac;
    }

    //getteri i setteri

    public ArrayList<Igraci> getIgrac() {
        return igrac;
    }

    public int getID_tima() {
        return ID_tima;
    }

    public void setID_tima(int ID_tima) {
        this.ID_tima = ID_tima;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        this.Naziv = naziv;
    }

    @Override //metoda za ispis toString
    public String toString(){
        String rezultat = "";
        rezultat = "ID_tima: " + ID_tima +", " + "Naziv kluba: " + Naziv;
        return rezultat;
    }
}
