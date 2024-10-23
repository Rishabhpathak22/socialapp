package com.Rishabh.service;

import java.util.List;

import com.Rishabh.exception.ChatException;
import com.Rishabh.exception.MessageException;
import com.Rishabh.exception.UserException;
import com.Rishabh.model.Message;
import com.Rishabh.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
