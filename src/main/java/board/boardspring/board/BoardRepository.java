package board.boardspring.board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {

    public List<Board> selectAll();

    public Optional<Board> selctOne(String nickName);

    public void updateContent(String nickName);
}
