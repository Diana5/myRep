package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JucatorController {

    private static final String template1 = "Jucatorul %s";
    private static final String template2 = "%s";
    private static final String template3 = "este titular la echipa %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/jucator")
    public Jucator jucator(@RequestParam(value="nume", defaultValue="Hagi") String nume, 
    						@RequestParam(value="prenume", defaultValue="Gheorghe") String prenume, 
    						@RequestParam(value="echipa", defaultValue="Dinamo") String echipa) {
        
    	return new Jucator(counter.incrementAndGet(),
                    		String.format(template1, nume),
                    		String.format(template2, prenume),
                    		String.format(template3, echipa));}
}


