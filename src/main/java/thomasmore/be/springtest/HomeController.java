package thomasmore.be.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    final String applicationName = "Mijn applicatie om Spring te testen";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", applicationName);
        return "home";
    }
}
