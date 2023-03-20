package board.boardspring.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board/update")
    public void updateBoard (@RequestBody Board board) {
        boardService.updateBoard(board);
    }

    @DeleteMapping("/board/delete")
    public void deleteBoard () {
        boardService.deleteBoard();
    }

    @PostMapping("/board/search")
    public List<Board> search (@RequestBody Board board) {
        return boardService.search(board);
    }

    @PostMapping("/board/insertBoard")
    public void insertBoard(@RequestBody Board board) {
        boardService.insertBoard(board);
    }

    @GetMapping("/board/listBoard")
    public List<Board> listBoard () {
        return boardService.listBoard();
    }

    @GetMapping("/board/detail/{title}")
    public Board detail(@PathVariable String title) {
        return boardService.detail(title);
    }
}
