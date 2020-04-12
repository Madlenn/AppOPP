package com.company.oop;

public class Elektrotechnik extends Naukowiec {
    private String jezyki;
    public Elektrotechnik(String imie, String nazwisko, String najwiekszeOsiagniecie) {
        super(imie, nazwisko, najwiekszeOsiagniecie);
    }
    public Elektrotechnik(String imie, String nazwisko, String najwiekszeOsiagniecie, String jezyki) {
        super(imie, nazwisko, najwiekszeOsiagniecie);
        this.jezyki=jezyki;
    }
    @Override
    protected void DyscyplinaNaukowa() {
        System.out.println("Moja dyscyplina naukowa to elektrotechnika");
    }

    @Override
    protected void NajwiekszeOsiagniecie() {
        System.out.println("Moje największe osiągniecie to "+ this.getNajwiekszeOsiagniecie());

    }

    @Override
    public void ZnajomoscJezykow() {

        System.out.println("Znam takie języki jak: " + this.jezyki);
    }
}
