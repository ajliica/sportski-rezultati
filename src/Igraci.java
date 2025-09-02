import java.util.Date;
public class Igraci {
    private int ID_igraca;
    private String Ime;
    private String Prezime;
    private Date Datum_rodjenja;
    private int Godina;
    private String Pozicija;
    private Tim Naziv;

    public Igraci() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_igraca = 0;
        this.Ime = "";
        this.Prezime = "";
        this.Datum_rodjenja = new Date();
        this.Godina = 0;
        this.Pozicija = "";
        this.Naziv = new Tim();
    }

    public Igraci(int ID_Igraca,String Ime, String Prezime, Date datumRodjenja, int godina, String pozicija, Tim Tim ){
        this.ID_igraca = ID_Igraca;
        this.Ime=Ime;
        this.Prezime=Prezime;
        this.Datum_rodjenja=datumRodjenja;
        this.Godina=godina;
        this.Pozicija=pozicija;
        this.Naziv= Tim;
    }

//    Getteri

    public int getID_igraca() {
        return ID_igraca;
    }
    public String getIme(){
        return Ime;
    }
    public String getPrezime() {
        return Prezime;
    }

    public Date getDatum_rodjenja() {
        return Datum_rodjenja;
    }

    public int getGodina() {
        return Godina;
    }
    public String getPozicija(){
        return Pozicija;
    }

    public Tim getNaziv() {
        return Naziv;
    }

//    Setteri

    public void setID_igraca(int ID_igraca){this.ID_igraca=ID_igraca;}
    public void setIme(String ime) {
        Ime = ime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        Datum_rodjenja = datum_rodjenja;
    }

    public void setGodina(int godina) {
        Godina = godina;
    }

    public void setPozicija(String pozicija) {
        Pozicija = pozicija;
    }

    public void setNaziv(Tim Naziv) {
    this.Naziv = Naziv;
}
    @Override
    public String toString(){
        String igrac=" ";
        igrac = this.ID_igraca + " " + this.Ime + " " + this.Prezime + ", " + this.Datum_rodjenja + ", Godine " +
                this.Godina + ", Pozicija: " + this.Pozicija + " " + this.Naziv;
        return igrac;
    }
}
