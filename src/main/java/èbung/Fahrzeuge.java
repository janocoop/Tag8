package èbung;

public class Fahrzeuge {
    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    private String Hersteller;
        private String Modell;

    public String getModell() {
        return Modell;
    }





    public void setModell(String modell) {
        Modell = modell;
    }

    public String getBaujahr() {
        return Baujahr;
    }

    public void setBaujahr(String baujahr) {
        Baujahr = baujahr;
    }

    private String Baujahr;

    public void printInformation() {
        System.out.println(Hersteller);

    }






}
