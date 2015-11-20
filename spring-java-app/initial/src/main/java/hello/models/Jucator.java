package hello;

public class Jucator {


    private final long nr;
    private final String nume;
    private final String prenume;
    private final String echipa;

    public Jucator(long nr, String nume, String prenume, String echipa) {
        this.nr = nr;
        this.nume = nume;
        this.prenume = prenume;
	    this.echipa = echipa;
	  }

    public long getNr() {
        return nr;
       }

    public String getNume() {
        return nume;
       }
    
    public String getPrenume() {
        return prenume;
        }

	 public String getEchipa() {
        return echipa;}

}

