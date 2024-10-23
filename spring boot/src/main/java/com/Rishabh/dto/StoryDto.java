package com.Rishabh.dto;

import java.time.LocalDateTime;

import com.Rishabh.model.User;

import lombok.Data;

@Data
public class StoryDto {

	private Integer id;
	private User user;
	private String image;
	private String captions;
	private LocalDateTime timestamp;
	
}
