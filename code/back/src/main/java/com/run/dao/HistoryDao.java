package com.run.dao;

import org.apache.ibatis.annotations.Param;

public interface HistoryDao {
	void insert(@Param("uid") int uid, @Param("bid") int bid, @Param("kind") String kind, @Param("lst") String lst);
	void clear(int uid);
}
