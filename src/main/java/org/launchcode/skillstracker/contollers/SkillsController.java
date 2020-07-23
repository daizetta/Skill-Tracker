package org.launchcode.skillstracker.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to learn</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsTrackerForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to learn</h2>" +
                        "<form method = 'post' action = '/success'>" +
                        "<label>Enter your name: <input type = 'text' name = 'username' /></label><hr>" +
                        "<label>Choose a skill:" +
                            "<select name='firstSkill'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                            "</select></label><br>" +
                        "<label>Choose a skill:" +
                            "<select name='secondSkill'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                            "</select></label><br>" +
                        "<label>Choose a skill:" +
                            "<select name='thirdSkill'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                            "</select></label><br>" +
                        "<input type = 'submit' value = 'Show me the skills!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="success")
    @ResponseBody
    public String skillsTrackerSuccess(@RequestParam String username,
                                       @RequestParam String firstSkill,
                                       @RequestParam String secondSkill,
                                       @RequestParam String thirdSkill) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker for " + username + "</h1>" +
                        "<h2>Skills to learn</h2>" +
                        "<ol>" +
                        "<li>"+ irstSkill + "</li>" +
                        "<li>"+ secondSkill + "</li>" +
                        "<li>"+ thirdSkill+ "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
