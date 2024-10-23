package com.Rishabh.service;

import java.util.List;

import com.Rishabh.exception.StoryException;
import com.Rishabh.exception.UserException;
import com.Rishabh.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
