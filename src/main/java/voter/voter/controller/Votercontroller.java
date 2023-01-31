package voter.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import voter.voter.model.Voter;
import voter.voter.services.Voterservice;

@Controller
public class Votercontroller {
    @Autowired
    private Voterservice voterservice;

    @PostMapping("/saveVoter")
    public String saveVoter(Voter voter){
        voterservice.insertVoter(voter);
        return "redirect:/";
    }

    @GetMapping("/")
    public  String getvoter(Model model){
        model.addAttribute("voterList",voterservice.getAllVoter());
        return "index";
    }

    @GetMapping("/registerForm")
    public ModelAndView registerForm(){
        ModelAndView mav = new ModelAndView("registerForm");
        Voter voter = new Voter();
        mav.addObject("register",voter);
        return mav;
    }

}
