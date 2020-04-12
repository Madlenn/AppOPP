package com.company.oop;

public class Pilkarz extends Sportowiec {

    private int obserwujacy;
    private String jezyki;

    public Pilkarz(String imie, String nazwisko, String NajwiekszySukces) {
        super(imie, nazwisko, NajwiekszySukces);
    }

    public Pilkarz(String imie, String nazwisko, String najwiekszySukces, String jezyki) {
        super(imie, nazwisko, najwiekszySukces);
        this.jezyki=jezyki;
    }
    public Pilkarz(String imie, String nazwisko, String najwiekszySukces, int obserwujacy) {
        super(imie, nazwisko, najwiekszySukces);
        this.obserwujacy=obserwujacy;
    }

    @Override
    protected void DyscyplinaSportu() {
        System.out.println("Moja dyscyplina sportu to piłka nożna");
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