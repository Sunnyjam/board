package board.boardspring.post;

import board.boardspring.board.Board;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
public class Post {

    private String title;
    private String content;
    private String nickName;

    public List<Post> list(Post post) {
        this.title = post.getTitle();
        this.nickName = post.getNickName();
        this.content = post.getContent();
        return post.list(post);
    }
}
