package com.company.oop;

public abstract class Naukowiec implements IPoliglota {
    private String imie;
    private String nazwisko;
    private String NajwiekszeOsiagniecie;
    private int jezyki;

    public Naukowiec(String imie, String nazwisko, String NajwiekszeOsiagniecie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.NajwiekszeOsiagniecie = NajwiekszeOsiagniecie;
    }

    public Naukowiec(String imie, String nazwisko, String najwiekszeOsiagniecie, int jezyki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.NajwiekszeOsiagniecie = najwiekszeOsiagniecie;
        this.jezyki = jezyki;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNajwiekszeOsiagniecie() {
        return NajwiekszeOsiagniecie;
    }

    public int getJezyki() {
        return jezyki;
    }

    protected abstract void DyscyplinaNaukowa();

    protected abstract void NajwiekszeOsiagniecie();

    public void ZnajomoscJezykow() {

        System.out.println("Znam takie języki jak: " + this.jezyki);
    }

    public void ImieNazwisko() {
        System.out.println("Nazywam się " + this.getImie() + " " + this.getNazwisko());
    }
}
