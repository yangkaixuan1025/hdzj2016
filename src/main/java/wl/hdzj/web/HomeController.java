package wl.hdzj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.RolesAllowed;

/**
 * Created by micro on 2016/11/3.
 */

@Controller
public class HomeController {
    @RequestMapping(value={"", "/", "index"})
    public String index(ModelMap map) {
        return "index";
    }

    @RequestMapping("/404")
    public String render404(ModelMap map) {
        // Add model attributes
        return "404";
    }

    @RequestMapping("/login")
    public String login(ModelMap map) {
        return "login";
    }

    @RequestMapping("/acdetail")
    public String acdetail(ModelMap map) {
        return "acdetail";
    }

    @RequestMapping("/activity")
    public String activity(ModelMap map) {
        return "activity";
    }

    @RequestMapping("/callme")
    public String callme(ModelMap map) {
        return "callme";
    }

    @RequestMapping("/hoactivity")
    public String hoactivity(ModelMap map) {
        return "hoactivity";
    }

    @RequestMapping("/nudetail")
    public String nudetail(ModelMap map) {
        return "nudetail";
    }

    @RequestMapping("/prdetail")
    public String prdetail(ModelMap map) {
        return "prdetail";
    }

    @RequestMapping("/project")
    public String project(ModelMap map) {
        return "project";
    }

    @RequestMapping("/service")
    @RolesAllowed("ADMIN")
    public String service(ModelMap map) {
        return "service";
    }

    @RequestMapping("/team")
    public String team(ModelMap map) {
        return "team";
    }

    @RequestMapping("/tedetail")
    public String tedetail(ModelMap map) {
        return "tedetail";
    }
}
