package hideonbush.springboot.semiproject5v.service;

import hideonbush.springboot.semiproject5v.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> readBoard(int cpage);

    int countBoard();

    List<Board> readBoard(int cpg, String ftype, String fkey);

    int countBoard(String ftype, String fkey);

    Board readOneBoard(String bno);

    boolean newBoard(Board bd);
}
