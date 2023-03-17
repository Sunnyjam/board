package board.boardspring.board;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {

    Board updateBoard (Board board);

    String deleteBoard (Board board);

    String checkBoard (Board board);

    String search (@Param("title") String title, @Param("nickName") String nickName);

}
