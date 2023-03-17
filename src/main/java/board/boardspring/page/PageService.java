package board.boardspring.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PageService {

    private final PageMapper pageMapper;

    public List<Page> selectBoardList (Page page) {
        return pageMapper.selectBoardList(page);
    }
}
