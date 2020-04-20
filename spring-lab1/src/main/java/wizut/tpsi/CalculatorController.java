package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

    @RequestMapping("/zad1result")
        public String hello(Model model, int x, int y) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        int result = x +y;
        
        model.addAttribute("result", result);
        return "zad1result";
    }
        
    @RequestMapping("/zad2result")
        public String zad2(Model model, int x, int y, String action) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        int result = 0;
        String znak = "";
        if (action.equals("dodawanie")) {
         result = x + y;
         znak = "+";
        } else if (action.equals("odejmowanie")) {
            result = x - y;
            znak = "-";
        } else {
            result = x * y;
            znak = "*";
        }
        model.addAttribute("result", result);
        model.addAttribute("znak", znak);
        return "zad2result";
    }
        
    @RequestMapping("/zad3result")
        public String zad3(Model model, CalcForm calcForm) {
        model.addAttribute("calcForm", calcForm);
        if (calcForm.getAction().equals("+")) {
         calcForm.setResult(calcForm.getX() + calcForm.getY());
         
        } else if (calcForm.getAction().equals("-")) {
            calcForm.setResult(calcForm.getX() - calcForm.getY());
        
        } else {
            calcForm.setResult(calcForm.getX() * calcForm.getY());
        }
        model.addAttribute("calcForm", calcForm);
        return "zad3result";
    }
    
}
