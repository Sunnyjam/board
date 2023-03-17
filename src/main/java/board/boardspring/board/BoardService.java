package board.boardspring.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> BoardList() {
        return boardRepository.selectAll();
    }

    public Optional<Board> BoardOne(String nickName) {
        return boardRepository.selctOne(nickName);
    }

    public void BoardAdd(Board board) {
        boardRepository.insertOne(board);
    }
}
