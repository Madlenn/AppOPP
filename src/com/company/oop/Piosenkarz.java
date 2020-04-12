package com.company.oop;

public class Piosenkarz extends Artysta implements IInstagramer {

    private int obserwujacy;

    public Piosenkarz(String imie, String nazwisko, String dzielo) {
        super(imie, nazwisko, dzielo);
    }

    public Piosenkarz(String imie, String nazwisko, String dzielo, int obserwujacy) {
        super(imie, nazwisko, dzielo);
        this.obserwujacy = obserwujacy;
    }

    @Override
    protected void DziedzinaSztuki() {
        System.out.println("Moja dziedzina sztuki to muzyka");
    }

    @Override
    protected void WazneDzielo() {
        System.out.println("Moje wazne dzieło to " + this.getDzielo());
    }

    @Override
    public void LiczbaObserwujacych() {
        System.out.println("Liczba obserwujących na insta to " + this.obserwujacy);
    }
}
