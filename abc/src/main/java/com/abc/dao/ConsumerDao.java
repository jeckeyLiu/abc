package com.abc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.abc.model.Consumer;

public interface ConsumerDao {
	
	public Consumer get(@Param("id")Long id);
	
	public List<Consumer> getALL();
	

}
