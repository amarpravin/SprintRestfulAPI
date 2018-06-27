package RestApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CustomerController {

    @RequestMapping(value = "/", method = GET)
    public String index(){
        return "congratulation from customer controller";
    }
}
