package thomasmore.be.springtest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;


@Controller
public class HomeController {
    //    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    final String applicationName = "Mijn applicatie om Spring te testen";

@Value("${tekstje}")
    private String uploadTekstje;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", applicationName);
        model.addAttribute("tekstje",uploadTekstje);
        return "home";
    }

}
