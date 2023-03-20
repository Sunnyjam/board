package board.boardspring.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private  Post post;

    public List<Post> list() {
        return post.list(post);
    }
}
