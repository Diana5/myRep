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

public class AnimalsController {
	
	private List<Animals> animals = new ArrayList<Animals>();

	  AnimalsController() {
	    Animals a1 = new Animals(1,"caine", "ciobanesc");
	    Animals a2 = new Animals(2, "pisica" , "persana");
	    Animals a3 = new Animals(3, "cal" ,"palomino");

	    animals.add(a1);
	    animals.add(a2);
	    animals.add(a3);
	  }

	  @RequestMapping(value="/animal", method = RequestMethod.GET)
	  public List<Animals> index() {
	    return this.animals;
	  }

	  @RequestMapping(value="/animal/{id}", method = RequestMethod.GET)
	  public ResponseEntity show(@PathVariable("id") int id) {
	    for(Animals a : this.animals) {
	      if(a.getId() == id) {
              return new ResponseEntity<Animals>(a, new HttpHeaders(), HttpStatus.OK);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }

	  @RequestMapping(value="/animal/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity remove(@PathVariable("id") int id) {
	    for(Animals a : this.animals) {
	      if(a.getId() == id) {
	        this.animals.remove(a);
	        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
	      }
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	  }

 @RequestMapping(value="/animal/{id}/{denumire}", method = RequestMethod.PUT)
  public List<Animals> update(@PathVariable("id") int id,@PathVariable("denumire") String denumire){
    for(Animals a : this.animals){
      if(a.getId() == id)		  {
		  a.setDenumire(denumire);
      }
    }
    return this.animals;
  }
	  
	 
@RequestMapping(value="/animal", method = RequestMethod.POST)
  public ResponseEntity create(@RequestBody Animals a) {
	animals.add(a);
	
    return new ResponseEntity<Animals>(a, new HttpHeaders(), HttpStatus.OK);
  }
	  
}
