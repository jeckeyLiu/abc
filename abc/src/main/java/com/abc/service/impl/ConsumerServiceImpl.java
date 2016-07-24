package com.abc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.ConsumerDao;
import com.abc.model.Consumer;
import com.abc.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {
	
	@Autowired
	private ConsumerDao consumerDao; 

	@Override
	public List<Consumer> getAll() {
		return consumerDao.getALL();
	}

	public Consumer get(Long id) {
		return consumerDao.get(id);
	}

}
