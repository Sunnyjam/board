package board.boardspring.board;

import lombok.*;

@Data
public class Board {

    private String title;
    private String content;
    private String nickName;

    public Board() {
    }

    public Board(String title, String content, String nickName) {
        this.title = title;
        this.content = content;
        this.nickName = nickName;
    }
}
