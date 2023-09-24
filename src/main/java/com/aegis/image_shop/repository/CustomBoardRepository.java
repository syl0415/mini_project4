package com.aegis.image_shop.repository;

import com.aegis.image_shop.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomBoardRepository {
    public Page<Board> getSearchPage(String type, String keyword, Pageable pageable);
}
