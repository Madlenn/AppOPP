package com.company.oop;

public class Skoczek extends Sportowiec {

    private int obserwujacy;
    private String jezyki;

    public Skoczek(String imie, String nazwisko, String NajwiekszySukces) {
        super(imie, nazwisko, NajwiekszySukces);
    }
    public Skoczek(String imie, String nazwisko, String NajwiekszySukces, int obserwujacy) {
        super(imie, nazwisko, NajwiekszySukces);
        this.obserwujacy=obserwujacy;
    }
    public Skoczek(String imie, String nazwisko, String najwiekszySukces, int jezyki, int obserwujacy) {
        super(imie, nazwisko, najwiekszySukces, jezyki, obserwujacy);
    }

    @Override
    protected void DyscyplinaSportu() {
        System.out.println("Moja dyscyplina sportu to  skoki narciarskie");
    }

    @Override
    protected void NajwiekszySukces() {
        System.out.println("Mój największy sukces to " + this.getNajwiekszySukces());
    }

    @Override
    public void LiczbaObserwujacych() {
        System.out.println("Liczba obserwujących na insta to " + this.obserwujacy);
    }

    @Override
    public  void ZnajomoscJezykow(){
        System.out.println("Znam takie języki jak: " + this.jezyki);
    }
}
