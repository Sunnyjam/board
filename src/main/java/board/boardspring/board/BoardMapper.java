package board.boardspring.board;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {

    Board updateBoard (Board board);

    String deleteBoard (Board board);

    String checkBoard (Board board);

    String search (@Param("title") String title, @Param("nickName") String nickName);

    String insertBoard (Board board);

    List<Board> listBoard (Board board);

    Board detailBoard (String nickName);

    }
