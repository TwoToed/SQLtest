package sg.edu.nus.iss.paf22_jul2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.paf22_jul2023.model.RSVP;

@Controller
@RequestMapping("/rsvps")
public class RsvpUIController {
    
    @GetMapping("/add")
    public String RSVPAdd(Model model) {

        RSVP newRSVP = new RSVP();
        model.addAttribute("rsvp", newRSVP);

        return "rsvpadd";

    }
}
