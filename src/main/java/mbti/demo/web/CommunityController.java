package mbti.demo.web;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Community;
import mbti.demo.domain.Reply;
import mbti.demo.repository.CommunityRepository;
import mbti.demo.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommunityController {

    @Autowired
    private final CommunityRepository communityRepository;
    private final ReplyRepository replyRepository;

    @GetMapping("/community")
    public String communityList(Model model){
        List<Community> list = communityRepository.findAll();
        List<Reply> comments = replyRepository.findAll();
        model.addAttribute("list", list);
        model.addAttribute("comments",comments);
        return "community/index_login";
    }
    @PostMapping("/community/{memberId}")
    public String community(@RequestParam(required = false, defaultValue = "created",value = "orderby") @PathVariable("memberId")String memberId, Community community, Model model){
        System.out.println(memberId);
//        community.setMemberId(id);
        System.out.println(community.getMemberId());
        communityRepository.save(community);
        List<Community> list = communityRepository.findAll();
        List<Reply> comments = replyRepository.findAll();
        model.addAttribute("list", list);
        model.addAttribute("comments",comments);
        return "community/index_login";
    }


//    @GetMapping("/{loginId}/community_login")
//    public String All_list_login(@PathVariable String loginId, Model model){
//        List<Community> list = communityRepository.findAll();
//        List<Comment> comments = commentRepository.findAll();
//        Member member = memberServiceInterface.findByLoginId(loginId).get();
//        model.addAttribute("member",member);
//        model.addAttribute("list", list);
//        model.addAttribute("comments",comments);
//        return "index_login";
//    }
//
//    @PostMapping("/{loginId}/community_login")
//    public String All_list(@PathVariable String loginId, Community community, Model model){
//
//        communityRepository.save(community);
//        List<Community> list = communityRepository.findAll();
//        List<Comment> comments = commentRepository.findAll();
//        Member member = memberServiceInterface.findByLoginId(loginId).get();
//        model.addAttribute("member",member);
//        model.addAttribute("list", list);
//        model.addAttribute("comments",comments);
//        return "index_login";
//    }

@GetMapping("/community/delete")
public String test(Long id, Model model) {
    System.out.println(id);
    communityRepository.deleteById(id);
//    replyRepository.save(reply);
    List<Community> list = communityRepository.findAll();
    List<Reply> comments = replyRepository.findAll();
    model.addAttribute("list", list);
    model.addAttribute("comments",comments);
    return "community/index_login";
}

}
