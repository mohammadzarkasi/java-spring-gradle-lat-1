package id.zar.latspring1.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/admin/pages")
    public String home()
    {
        return "admin/page1";
    }
}
