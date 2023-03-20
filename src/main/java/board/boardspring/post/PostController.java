package board.boardspring.post;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping("/post")
    public ModelAndView post(Model model) {
        ModelAndView mv = new ModelAndView("/post");
        List<Post> posts = postService.list();
        mv.addObject("posts", posts);
        return mv;
    }
}