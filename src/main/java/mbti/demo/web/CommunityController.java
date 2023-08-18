package mbti.demo.web;

import lombok.Generated;
import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Community;
import mbti.demo.service.CommunityServi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommunityController {
    private final CommunityServi communityServi;

    @GetMapping("/community")
    public String communityList(Model model){
        List<Community> community = communityServi.findAll();
        model.addAttribute("communities", community);
        return "index";
    }

    @GetMapping("/community")
    public String communityForm(Model model){
        model.addAttribute("community", new Community());
        return "index";
    }

    @PostMapping("/community")
    public String community(@ModelAttribute Community community, RedirectAttributes redirectAttributes){
        Community saveCommunity = communityServi.save(community);
        redirectAttributes.addAttribute("content", saveCommunity.getContent());
        return "redirect:/index";
    }

}
