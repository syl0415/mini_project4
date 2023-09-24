package com.aegis.image_shop.service;

import com.aegis.image_shop.domain.Board;
import com.aegis.image_shop.repository.BoardRepository;
import com.aegis.image_shop.vo.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServieImpl implements BoardService {

    private final BoardRepository repository;

    @Override
    public void register(Board board) throws Exception{
        repository.save(board);
    }

    @Override
    public Page<Board> list(PageRequestVO pageRequestVO) throws Exception{
     /*   int pageNumber = pageRequestVO.getPage() -1;
        int sizePerPage = pageRequestVO.getSizePerPage();

        Pageable pageRequest = PageRequest.of(pageNumber, sizePerPage, Sort.Direction.DESC, "boardNo");

        Page<Board> page = repository.findAll(pageRequest);

        return page;

      */

        String searchType = pageRequestVO.getSearchType();
        String keyword = pageRequestVO.getKeyword();

        int pageNumber = pageRequestVO.getPage() -1;
        int sizPerPage = pageRequestVO.getSizePerPage();

        Pageable pageRequest = PageRequest.of(pageNumber, sizPerPage, Sort.Direction.DESC, "boardNo");

        return repository.getSearchPage(searchType, keyword, pageRequest);
    }

    @Override
    public Board read(Long boardNo) throws Exception{
        return repository.getOne(boardNo);
    }

    @Override
    public void modify(Board board) throws Exception{
        Board boardEntity = repository.getOne(board.getBoardNo());

        boardEntity.setTitle(board.getTitle());
        boardEntity.setContent(board.getContent());

        repository.save(boardEntity);
    }

    @Override
    public void remove(Long boardNo) throws Exception{
        repository.deleteById(boardNo);
    }
}
