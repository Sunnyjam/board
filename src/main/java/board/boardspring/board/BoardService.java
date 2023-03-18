package board.boardspring.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public Board updateBoard (Board board) {
        return boardMapper.updateBoard(board);
    }

    public String deleteBoard (Board board) {
        return boardMapper.deleteBoard(board);
    }

    public String checkBoard (Board board) {
        return boardMapper.checkBoard(board);
    }

    public String search (String title, String nickName) {
        return boardMapper.search(title,nickName);
    }

    public String insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }

    public List<Board> listBoard(Board board) {
        return boardMapper.listBoard(board);
    }

    public Board detailBoard (String nickName) {
        return boardMapper.detailBoard(nickName);
    }

}
