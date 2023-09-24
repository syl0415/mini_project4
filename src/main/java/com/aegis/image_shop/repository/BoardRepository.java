package com.aegis.image_shop.repository;

import com.aegis.image_shop.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, CustomBoardRepository {
}
