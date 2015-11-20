package hello;

public class Doctor {


    private final long numar;
    private final String nume;
    private final String prenume;

    public Doctor(long numar, String nume, String prenume) {
        this.numar = numar;
        this.nume = nume;
        this.prenume = prenume;
    }

    public long getNumar() {
        return numar;
    }

    public String getNume() {
        return nume;
    }
    
    public String getPrenume() {
        return prenume;
    }

}

