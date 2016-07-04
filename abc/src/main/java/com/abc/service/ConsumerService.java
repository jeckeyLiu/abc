package com.abc.service;

import java.util.List;

import com.abc.model.Consumer;

public interface ConsumerService {
	
	public List<Consumer> getAll();
	
	public Consumer get(Long id);

}
