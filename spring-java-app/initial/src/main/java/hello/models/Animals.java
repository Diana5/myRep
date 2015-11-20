package hello;

public class Animals {


    private final long nr;
    private final String denumire;
    private final String rasa;
    private final String nume;

    public Animals(long nr,String denumire, String rasa, String nume) {
        this.nr = nr;
        this.denumire = denumire;
        this.rasa = rasa;
        this.nume = nume;
    }

    public long getNumar() {
        return nr;
    }
    
    public String getDenumire() {
        return denumire;
    }
    

    public String getRasa() {
        return rasa;
    }
    
    public String getNume() {
        return nume;
    }

}

