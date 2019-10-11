package com.sjs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.sjs.domain.Goods;
import com.sjs.domain.Shop;
import com.sjs.service.ShopService;
import com.sjs.vo.ShopVO;

@Controller
public class ShopController {

	@Resource
	private ShopService shopService;
	@RequestMapping("selects")
	public String selects(Model m) {
	
		PageInfo<ShopVO> info = shopService.selects(null, null, 1, 10);
		m.addAttribute("shops",info.getList());
		return "shops";
	
	}

	@GetMapping("add")
	public String add(Model m) {
		List<Goods> list =shopService.getgoods();
		for (Goods goods : list) {
			System.out.println(goods);
		}
		m.addAttribute("list", list);
		return "add";
		
	}
	@RequestMapping("addt")
	public String addt(Shop shop,int[] gid) {
		shopService.addt(shop,gid);
		return "redirect:/selects";
		
	}
}
