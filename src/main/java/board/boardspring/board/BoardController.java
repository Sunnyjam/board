package board.boardspring.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board/update")
    public Board updateBoard (@RequestBody Board board, HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        Board update = boardService.updateBoard(board);
        httpSession.setAttribute("nickName", update);
        return update;
    }

    @GetMapping(value = "/index")
    public void indexGet(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.getAttribute("nickName");
    }

    @DeleteMapping("/board/delete")
    public String deleteBoard (@PathVariable Board board) {
        return boardService.deleteBoard(board);
    }

    @PostMapping("/board/checkBoard")
    public String checkBoard(@RequestBody Board board) {
        return boardService.checkBoard(board);
    }

    @GetMapping("/board/search/{title}/{nickName}")
    public String search (@PathVariable(value = "title") String title, @PathVariable(value = "nickName") String nickName) {
        return boardService.search(title,nickName);
    }

    @PostMapping("/board/insertBoard")
    public String insertBoard(@RequestBody Board board) {
        return boardService.insertBoard(board);
    }

    @GetMapping("/board/listBoard")
    public List<Board> listBoard (@PathVariable Board board) {
        return boardService.listBoard(board);
    }

    @GetMapping("/board/detailBoard/{nickName}")
    public Board detailBoard (@PathVariable String nickName) {
        return boardService.detailBoard(nickName);
    }
}
