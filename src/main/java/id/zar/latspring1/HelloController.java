package id.zar.latspring1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String welcome()
    {
        return "t1/p1";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "bro") String name, Model model)
    {
        model.addAttribute("name", name);
        return "hello";
    }
}
