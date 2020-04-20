package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping("/hello")
        public String hello(Model model, String imie, Integer wiek) {
        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);

        return "hello";
    }

    
}
