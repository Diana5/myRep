package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalsController {

	 private final AtomicLong counter = new AtomicLong();
	 private static final String template1 = "Animalul %s " ;
	 private static final String template2 = "de rasa %s" ; 
	 private static final String template3 = "se numeste %s" ; 


	    @RequestMapping("/animal")
	    public Animals animals(@RequestParam(value="denumire", defaultValue="caine") String denumire, 
	    						@RequestParam(value="rasa", defaultValue="ciobanesc") String rasa, 
	    						@RequestParam(value="nume", defaultValue="Fredo") String nume) {
	        return new Animals(counter.incrementAndGet(),
	                          String.format(template1, denumire),
						      String.format(template2, rasa),
						      String.format(template3, nume));}
}
