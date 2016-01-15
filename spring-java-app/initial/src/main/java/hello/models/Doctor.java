package hello;

import java.util.List;
import java.util.ArrayList;

public class Doctor {

    private long id;
    private String name;
    private String prenume;
    
    public Doctor() {}

    public Doctor(long id, String name, String prenume) {
        this.id = id;
        this.name = name;
        this.prenume = prenume;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getPrenume() {
        return prenume;
    }

	public void setName(String name) {
        this.name=name;
    }
    
    public void setPrenume(String prenume) {
        this.prenume=prenume;
    }


}

