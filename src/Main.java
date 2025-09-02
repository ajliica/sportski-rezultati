import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//TIM 1
        Tim Manchester = new Tim(1, "Manchester", new ArrayList<>());
        Igraci igrac1 = new Igraci();
        igrac1.setID_igraca(1);
        igrac1.setIme("David");
        igrac1.setPrezime("De Gea");
        igrac1.setDatum_rodjenja(new Date(1990, 11, 07));
        igrac1.setGodina(32);
        igrac1.setPozicija("Goalkeeper");
//        igrac1.setID_tima(1);
        igrac1.setNaziv(Manchester);

        Igraci igrac2 = new Igraci();
        igrac2.setID_igraca(2);
        igrac2.setIme("Raphaël");
        igrac2.setPrezime("Varane");
        igrac2.setDatum_rodjenja(new Date(1993, 4, 19));
        igrac2.setPozicija("Defender");
        igrac2.setNaziv(Manchester);

        Manchester.getIgrac().add(igrac1);
        Manchester.getIgrac().add(igrac2);

//  TIM 2
        Tim PSG = new Tim(1, "PSG", new ArrayList<>());
        Igraci igrac3 = new Igraci();
        igrac3.setID_igraca(1);
        igrac3.setIme("Neymar");
        igrac3.setPrezime("Da Silva Santos Junior");
        igrac3.setDatum_rodjenja(new Date(1992, 02, 05));
        igrac3.setGodina(30);
        igrac3.setPozicija("Forward");
        igrac3.setNaziv(PSG);
        PSG.getIgrac().add(igrac3);

        Igraci igrac4 = new Igraci();
        igrac4.setID_igraca(2);
        igrac4.setIme("Kylian");
        igrac4.setPrezime("Mbappé");
        igrac4.setDatum_rodjenja(new Date(1998, 12, 20));
        igrac4.setPozicija("Forward");
        igrac4.setNaziv(PSG);
        PSG.getIgrac().add(igrac4);

        List<Igraci> listaIgraca = new ArrayList<>();
        Scanner team = new Scanner(System.in);
        System.out.println("Unesite naziv tima: ");
        String korisnikovUnos = team.nextLine();

        listaIgraca.addAll(Manchester.getIgrac());
        listaIgraca.addAll(PSG.getIgrac());



//        System.out.println(listaIgraca);

        //NA KORISNIKOV UNOS DA ISPISE IGRACA U ODNOSU NA TIM
        for (Igraci igrac : listaIgraca) {
            if (igrac.getNaziv().getNaziv().equals(korisnikovUnos)) {
                System.out.println(igrac.toString());
            }
        }

//        rezultat

        Rezultat rezultat = new Rezultat(1,new Date(2023,1,12),"20:30",1,"2:1",2,1);

        Utakmica newUtakmica = new Utakmica(1,new Date(2023,2,12),"20:30");
        newUtakmica.dodajRezultat(rezultat);

        Scanner unesi = new Scanner(System.in);
        System.out.println("Unesite ID utakmice: ");
        int userInput = unesi.nextInt();
        Rezultat getRezultatByUserInput = newUtakmica.getRezultat(userInput);

        if(getRezultatByUserInput != null){
            System.out.println(getRezultatByUserInput.toString());
        }else{
            System.out.println("Nije pronadjen nijedan rezultat za unesenu vrijednost ID-a utakmice!");
        }

        if (rezultat.getHomeScore() > rezultat.getAwayScore()) {
            System.out.println("Domaci tim je pobijedio!");
        } else if (rezultat.getHomeScore() < rezultat.getAwayScore()) {
            System.out.println("Gostujuci tim je pobijedio.");
        } else {
            System.out.println("Nerijeseno.");
        }
//        liga
        Liga liga1 = new Liga();
        liga1.setID_lige(1);
        liga1.setBr_timova(2);
        liga1.setNaziv_lige("Liga prvaka");
        System.out.println(liga1);


        Liga liga2 = new Liga();
        liga2.setID_lige(2);
        liga2.setBr_timova(2);
        liga2.setNaziv_lige("Premier liga");
        System.out.println(liga2);
    }
}