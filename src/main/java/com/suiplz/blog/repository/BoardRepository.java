package com.suiplz.blog.repository;

import com.suiplz.blog.model.Board;
import com.suiplz.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
