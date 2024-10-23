package com.Rishabh.service;

import com.Rishabh.exception.CommentException;
import com.Rishabh.exception.PostException;
import com.Rishabh.exception.UserException;
import com.Rishabh.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
