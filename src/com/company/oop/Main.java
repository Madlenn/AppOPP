package com.company.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        

        List<Artysta> artysci = new ArrayList<Artysta>();
        artysci.add(new Piosenkarz("Phil", "Collins", "In the air tonight"));
        artysci.add(new Aktor("Al", "Pacino", "Ojciec chrzestny"));
        artysci.add(new Piosenkarz("Freddy", "Mercury", "The Show Must Go On"));
        artysci.add(new Pisarka("J.K.", "Rowling", "Harry Potter"));
        for (Artysta element : artysci) {
            printInformacjeArtysta(element);
        }

        List<Sportowiec> sportowcy = new ArrayList<Sportowiec>();
        sportowcy.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec"));
        sportowcy.add(new Skoczek("Kamil", "Stoch", "Mistrzostwo Olimpijskie"));
        sportowcy.add(new Lekkoatletka("Anita", "Włodarczyk", "Mistrzostwo Olimpijskie"));
        for (Sportowiec element : sportowcy) {
            printInformacjeSportowiec(element);
        }

        List<Naukowiec> naukowcy = new ArrayList<Naukowiec>();
        naukowcy.add(new Matematyk("Stanisław", "Ulam", "Metody numeryczne"));
        naukowcy.add(new Elektrotechnik("Nikola", "Tesla", "Silnik indukcyjny"));
        for (Naukowiec element : naukowcy) {
            printInformacjeNaukowiec(element);
        }
        List<IInstagramer> instagramerzy = new ArrayList<IInstagramer>();
        instagramerzy.add(new Piosenkarz( "Phil" ,"Collins" ,"In the air tonight", 398000));
        instagramerzy.add(new Pilkarz ("Robert", "Lewandowski" ,"Mistrzostwo Niemiec", 16800000));
        instagramerzy.add(new Skoczek ("Kamil", "Stoch", "Mistrzostwo Olimpijskie ", 320000));
        instagramerzy.add(new Lekkoatletka( "Anita", "Włodarczyk", "Mistrzostwo Olimpijskie", 30100));
        for (IInstagramer element : instagramerzy) {
            printInformacjeIInstagramer(element);
        }
        List<IPoliglota> poligloci = new ArrayList<IPoliglota>();
        poligloci.add(new Pilkarz("Robert", "Lewandowski", "Mistrzostwo Niemiec", "polski, niemiecki"));
        poligloci.add(new Matematyk("Stanisław", "Ulam","Metody numeryczne","polski, angielski,niemiecki"));
        poligloci.add(new Elektrotechnik("Nikola","Tesla", "Silnik indukcyjny","serbski, chorwacki,niemiecki, angielski"));
        for (IPoliglota element : poligloci) {
            printInformacjeIPoligloci(element);
        }
    }



    static void printInformacjeArtysta(Artysta element) {
        element.ImieNazwisko();
        element.DziedzinaSztuki();
        element.WazneDzielo();
    }
    static void printInformacjeSportowiec(Sportowiec element) {
        element.ImieNazwisko();
        element.NajwiekszySukces();
        element.DyscyplinaSportu();
    }
    static void printInformacjeNaukowiec(Naukowiec element) {
        element.ImieNazwisko();
        element.DyscyplinaNaukowa();
        element.NajwiekszeOsiagniecie();
    }
    static void printInformacjeIInstagramer(IInstagramer element) {
        element.LiczbaObserwujacych();
    }
    static void printInformacjeIPoligloci(IPoliglota element) {
        element.ZnajomoscJezykow();
    }
}
