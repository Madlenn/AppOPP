package com.company.oop;

public class Matematyk extends Naukowiec {
    private String jezyki;
    public Matematyk(String imie, String nazwisko, String najwiekszeOsiagniecie) {
        super(imie, nazwisko, najwiekszeOsiagniecie);
    }
    public Matematyk(String imie, String nazwisko, String najwiekszeOsiagniecie, String jezyki) {
        super(imie, nazwisko, najwiekszeOsiagniecie);
        this.jezyki = jezyki;
    }
    @Override
    protected void DyscyplinaNaukowa() {
        System.out.println("Moja dyscyplina naukowa to matematyka");
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
