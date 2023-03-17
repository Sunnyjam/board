package board.boardspring.page;

import lombok.*;

@Getter
@Setter
public class Page {

    private int currentPage;               //현재 페이지 번호
    private int recordsPerPage;         //페이지마다 출력할 데이터 갯수
    private int pageSize;           //화면에 출력할 페이지 크기
    private String keyword;         //검색키워드
    private String searchType;      //검색 유형

    public Page() {
        this.currentPage = 1;
        this.recordsPerPage = 10;
        this.pageSize = 10;
    }

    public int getStartPage() {
        return (currentPage - 1 ) * recordsPerPage;
    }
}
