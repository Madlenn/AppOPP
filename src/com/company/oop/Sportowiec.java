package com.company.oop;

public abstract class Sportowiec implements IPoliglota, IInstagramer {
    private String imie;
    private String nazwisko;
    private String NajwiekszySukces;
    private int obserwujacy, jezyki;

    public Sportowiec(String imie, String nazwisko, String NajwiekszySukces) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.NajwiekszySukces = NajwiekszySukces;

    }

    public Sportowiec(String imie, String nazwisko, String najwiekszySukces, int jezyki, int obserwujacy) {
        super();
        this.obserwujacy = obserwujacy;
        this.jezyki = jezyki;
    }
    public Sportowiec(String imie, String nazwisko, String najwiekszySukces,  int obserwujacy) {
        super();
        this.obserwujacy = obserwujacy;

    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNajwiekszySukces() {
        return NajwiekszySukces;
    }

    public void ImieNazwisko() {
        System.out.println("Nazywam się " + this.getImie() + " " + this.getNazwisko());
    }

    protected abstract void DyscyplinaSportu();

    protected abstract void NajwiekszySukces();

    public void ZnajomoscJezykow() {

        System.out.println("Znam takie języki jak: " + this.jezyki);
    }
    @Override
    public void LiczbaObserwujacych() {
        System.out.println("Liczba obserwujących na insta to " + this.obserwujacy);
    }
}
