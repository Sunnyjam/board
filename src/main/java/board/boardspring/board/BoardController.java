package board.boardspring.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public String boards (Model model) {
        List<Board> boards = boardService.BoardList();
        model.addAttribute("boards", boards);
        return "boards/boards";
    }

    @GetMapping("/{nickName}")
    public String board(@PathVariable("nickName") String nickName, Model model) {
        boardService.BoardList(nickName);
        Optional<Board> result = boardService.BoarOne(nickName);
        Board board = result.get();
        model.addAttribute("board", board);
        log.info("board={}", board);
        return "boards/board";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("board", new Board());
        return "boards/addFoarm";
    }

    @PostMapping("/add")
    public String addBoard(@ModelAttribute Board board, RequiredArgsConstructor requiredArgsConstructor) {
        boardService.BoardAdd(board);
        return "redirect/boards";
    }
}
