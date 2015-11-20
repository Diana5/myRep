package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AngajatController {
	
	private final AtomicLong counter = new AtomicLong();
	 private static final String template1 = "Angajatul %s " ;
	 private static final String template2 = "%s" ; 
	 private static final String template3 = "are drept supervizor pe %s" ; 
	 private static final String template4 = "%s" ; 


	    @RequestMapping("/angajat")
	    public Angajat angajat(@RequestParam(value="nume", defaultValue="Ionescu") String nume, 
	    						@RequestParam(value="prenume", defaultValue="Vasile") String prenume, 
	    						@RequestParam(value="numeSupervizor", defaultValue="Popescu") String numeSupervizor,
	    						@RequestParam(value="prenumeSupervizor", defaultValue="Gica") String prenumeSupervizor) {
	        return new Angajat(counter.incrementAndGet(),
	                          String.format(template1, nume),
						      String.format(template2, prenume),
						      String.format(template3, numeSupervizor),
						      String.format(template4, prenumeSupervizor));}

}
