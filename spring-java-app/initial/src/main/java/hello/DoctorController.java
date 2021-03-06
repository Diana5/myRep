package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController

public class DoctorController {
	
	private List<Doctor> doctori = new ArrayList<Doctor>();

	  DoctorController() {
	    Doctor d1 = new Doctor(1,"State", "Vlad");
	    Doctor d2 = new Doctor(2, "Panaite" , "Simona");
	    Doctor d3 = new Doctor(3, "John" ,"Mike");

	    doctori.add(d1);
	    doctori.add(d2);
	    doctori.add(d3);
	  }

	  @RequestMapping(value="/doctor", method = RequestMethod.GET)
	  public List<Doctor> index() {
	    return this.doctori;
	  }

	  @RequestMapping(value="/doctor/{id}", method = RequestMethod.GET)
	  public ResponseEntity show(@PathVariable("id") int id) {
	    for(Doctor d : this.doctori) {
	      if(d.getId() == id) {
	        return new ResponseEntity<Doctor>(d, new HttpHeaders(), HttpStatus.OK);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }

	  @RequestMapping(value="/doctor/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity remove(@PathVariable("id") int id) {
	    for(Doctor d : this.doctori) {
	      if(d.getId() == id) {
	        this.doctori.remove(d);
	        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }

  @RequestMapping(value="/doctor/{id}/{name}", method = RequestMethod.PUT)
  public List<Doctor> update(@PathVariable("id") int id,@PathVariable("name") String name){
    for(Doctor d : this.doctori){
      if(d.getId() == id)		  {
		  d.setName(name);
      }
    }
    return this.doctori; 
  }
	  
@RequestMapping(value="/doctor", method = RequestMethod.POST)
  public ResponseEntity create(@RequestBody Doctor d) {
	doctori.add(d);
	
    return new ResponseEntity<Doctor>(d, new HttpHeaders(), HttpStatus.OK);
  }
	  
}
