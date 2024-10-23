package com.Rishabh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rishabh.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
