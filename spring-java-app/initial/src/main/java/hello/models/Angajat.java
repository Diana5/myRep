package hello;

public class Angajat {
	
	private final long nr;
    private final String nume;
    private final String prenume;
    private final String numeSupervizor;
    private final String prenumeSupervizor;

    public Angajat(long nr, String nume, String prenume,String numeSupervizor, String prenumeSupervizor) {
        this.nr = nr;
        this.nume = nume;
        this.prenume = prenume;
	    this.numeSupervizor = numeSupervizor;
	    this.prenumeSupervizor = prenumeSupervizor;
	    
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

	 public String getNumeSupervizor() {
        return numeSupervizor;
        }
	 
	 public String getPrenumeSupervizor() {
	        return prenumeSupervizor;
	    }

}
