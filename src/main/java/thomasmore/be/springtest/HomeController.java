package thomasmore.be.springtest;

import lombok.Value;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;


@Controller
@RequestMapping("/admin")
public class HomeController {
//    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    final String applicationName = "Mijn applicatie om Spring te testen";


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", applicationName);
        return "home";
    }

}
