package board.boardspring.board;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class Board {

    private String title;
    private String content;
    private String nickName;

    public List<Board> search(Board board) {
        this.title = board.getTitle();
        this.nickName = board.getNickName();
        this.content = board.getContent();
        return List.of(new Board());
    }


}
