package board.boardspring.board;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    /**
     *         map.put("title", board);
     *         map.put("content", board);
     *         map.put("nickName", board);
     * */
    Map<String, Board> map = new HashMap<>();
    List<Board> boards = new ArrayList<>();

    public void updateBoard (Board board) {
        map.put("title", board);
        map.put("content", board);
        map.put("nickName", board);
    }

    public void deleteBoard () {
        map.clear();
    }
    public List<Board> search (Board board) {
        return board.search(board);
    }

    public void insertBoard(Board board) {
        map.put("title", board);
        map.put("content", board);
        map.put("nickName", board);
    }

    public List<Board> listBoard() {
        map.get("title");
        map.get("content");
        map.get("nickName");

        System.out.println(map);
        return null;
    }

    public Board detail(String title) {
        return map.get(title);
    }

}
