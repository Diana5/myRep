package hello;

public class Animals {


    private long id;
    private String denumire;
    private String rasa;

    public Animals(long id,String denumire, String rasa) {
        this.id = id;
        this.denumire = denumire;
        this.rasa = rasa;
    }

    public long getId() {
        return id;
    }
    
    public String getDenumire() {
        return denumire;
    }
    

    public String getRasa() {
        return rasa;
    }
    
    
    public void setDenumire(String denumire) {
        this.denumire=denumire;
    }
    
    public void setRasa(String rasa) {
        this.rasa=rasa;
    }

}

