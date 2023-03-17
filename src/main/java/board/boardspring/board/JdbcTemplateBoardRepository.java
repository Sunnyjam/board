package board.boardspring.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JdbcTemplateBoardRepository implements BoardRepository {

    private final JdbcTemplateBoardRepository jdbcTemplateBoardRepository;

    @Override
    public List<Board> selectAll() {
        return jdbcTemplateBoardRepository.query("select * from test_write", BoardMapper());
    }

    @Override
    public Optional<Board> selectOne(String nickName) {
        List<Board> result = jdbcTemplateBoardRepository.query("select * from test_write where wr_nickName?", BoardMapper(), nickName);
        return result.stream().findAny();
    }

    @Override
    public void insertOne(Board board) {
        jdbcTemplateBoardRepository.update("insert into test_write (wr_subject, wr_content, wr_nickName) values ( ?, ?, ?)"),
        board.getSubject(), board.getContent(), board.getNickName();
    }
    }

