package com.sjs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.sjs.domain.Goods;
import com.sjs.domain.Shop;
import com.sjs.vo.ShopVO;

public interface ShopService {

	PageInfo<ShopVO> selects(String name,Integer gids[],Integer page,Integer pageSize);

	List<Goods> getgoods();

	void addt(Shop shop, int[] gid);
}
