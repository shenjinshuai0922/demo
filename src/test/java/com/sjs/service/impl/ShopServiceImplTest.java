package com.sjs.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.sjs.service.ShopService;
import com.sjs.vo.ShopVO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-beans.xml")
public class ShopServiceImplTest {

	@Resource
	private ShopService shopService;
	
	@Test
	public void testSelects() {
		PageInfo<ShopVO> info = shopService.selects(null, null, 1, 3);
		System.out.println(info);
	}

}
