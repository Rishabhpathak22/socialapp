package com.Rishabh.service;

import java.util.List;

import com.Rishabh.exception.UserException;
import com.Rishabh.model.Reels;
import com.Rishabh.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
