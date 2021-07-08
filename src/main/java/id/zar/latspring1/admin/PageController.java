package id.zar.latspring1.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("adminx")
public class PageController {

    @GetMapping("/pages")
    public String home()
    {
        return "admin/page1";
    }
}
