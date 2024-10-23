package com.Rishabh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rishabh.exception.StoryException;
import com.Rishabh.exception.UserException;
import com.Rishabh.model.Story;
import com.Rishabh.model.User;
import com.Rishabh.service.StoryService;
import com.Rishabh.service.UserService;

@RestController
@RequestMapping("/api/stories")
public class StoryController {
	
	@Autowired
	private StoryService storyService;
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Story> createStoryHandler(@RequestBody Story story, @RequestHeader("Authorization") String token) throws UserException{
		
		User reqUser=userService.findUserProfileByJwt(token);
		
		Story createdStory =storyService.createStory(story, reqUser.getId());
		return new ResponseEntity<Story>(createdStory,HttpStatus.OK);
	}
	
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Story>> findAllStoryByUserIdHandler(@PathVariable Integer userId) throws UserException, StoryException{
		
		List<Story> stories= storyService.findStoryByUserId(userId);
		
		System.out.println("stories userid --------- ");
		
		return new ResponseEntity<List<Story>>(stories,HttpStatus.OK);
	}

}