package hello;

public class Jucator {


    private long id;
    private  String name;
    private  String prename;
    private  String echipa;

    public Jucator(long id, String name, String prename) {
        this.id = id;
        this.name = name;
        this.prename = prename;
	  }

    public long getId() {
        return id;
       }

    public String getName() {
        return name;
       }
    
    public String getPrename() {
        return prename;
        }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public void setPrename(String prename) {
        this.prename=prename;
    }
	
}

