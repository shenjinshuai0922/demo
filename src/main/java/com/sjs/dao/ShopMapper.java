package com.sjs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjs.domain.Goods;
import com.sjs.domain.Shop;
import com.sjs.vo.ShopVO;

public interface ShopMapper {

	
	List<ShopVO> selects(@Param("name")String name,@Param("gids")Integer gids[]);

	List<Goods> getgoods();

	void addt(Shop shop);

	void addtp(@Param("id")Integer id, int[] gid);
}
