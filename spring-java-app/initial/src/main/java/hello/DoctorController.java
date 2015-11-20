package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	 private static final String template1 = "Doctorul %s " ;
	 private static final String template2 = "%s este specializat pe neurochirurgie" ; 

	 private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/doctor")
	    public Doctor doctor(@RequestParam(value="nume", defaultValue="Popescu") String nume, 
	    						@RequestParam(value="prenume", defaultValue="Ion") String prenume) {
	        return new Doctor(counter.incrementAndGet(),
	                          String.format(template1, nume),
						String.format(template2, prenume));}
}
