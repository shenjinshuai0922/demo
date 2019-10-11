package com.sjs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjs.dao.ShopMapper;
import com.sjs.domain.Goods;
import com.sjs.domain.Shop;
import com.sjs.service.ShopService;
import com.sjs.vo.ShopVO;
@Service
public class ShopServiceImpl implements ShopService {

	@Resource
	private ShopMapper shopMapper;
	@Override
	public PageInfo<ShopVO> selects(String name, Integer[] gids, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		List<ShopVO> lists = shopMapper.selects(name, gids);
		return new PageInfo<ShopVO>(lists);
	}
	@Override
	public List<Goods> getgoods() {
		// TODO Auto-generated method stub
		return shopMapper.getgoods();
	}
	@Override
	public void addt(Shop shop,int[] gid) {
		// TODO Auto-generated method stub
		shopMapper.addt(shop);
		if(gid!=null) {
		shopMapper.addtp(shop.getId(),gid);
		}
	}

}
