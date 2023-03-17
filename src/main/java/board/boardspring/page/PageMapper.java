package board.boardspring.page;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PageMapper {

    List<Page> selectBoardList (Page page);

    int selectBoardTotalCount(Page page);

}
