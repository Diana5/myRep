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

public class JucatorController {
	
	private List<Jucator> jucatori = new ArrayList<Jucator>();

	  JucatorController() {
	    Jucator j1 = new Jucator(1,"Hagi", "Gheorghe");
	    Jucator j2 = new Jucator(2, "Nicolita" , "Banel");
	    Jucator j3 = new Jucator(3, "Beckam" ,"David");

	    jucatori.add(j1);
	    jucatori.add(j2);
	    jucatori.add(j3);
	  }

	  @RequestMapping(value="/jucator", method = RequestMethod.GET)
	  public List<Jucator> index() {
	    return this.jucatori;
	  }

    
    @RequestMapping(value="/jucator", method = RequestMethod.POST)
  public ResponseEntity create(@RequestBody Jucator j) {
	jucatori.add(j);
	
    return new ResponseEntity<Jucator>(j, new HttpHeaders(), HttpStatus.OK);
  }
    
	  @RequestMapping(value="/jucator/{id}", method = RequestMethod.GET)
	  public ResponseEntity show(@PathVariable("id") int id) {
	    for(Jucator j : this.jucatori) {
	      if(j.getId() == id) {
              return new ResponseEntity<Jucator>(j, new HttpHeaders(), HttpStatus.OK);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }

	  @RequestMapping(value="/jucator/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity remove(@PathVariable("id") int id) {
	    for(Jucator j : this.jucatori) {
	      if(j.getId() == id) {
	        this.jucatori.remove(j);
	        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }


  @RequestMapping(value="/jucator/{id}/{name}", method = RequestMethod.PUT)
  public List<Jucator> update(@PathVariable("id") int id,@PathVariable("name") String name){
    for(Jucator j : this.jucatori){
      if(j.getId() == id)		  {
		  j.setName(name);
      }
    }
    return this.jucatori;
  }
  
}