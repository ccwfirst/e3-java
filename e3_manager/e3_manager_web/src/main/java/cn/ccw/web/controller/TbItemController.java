package cn.ccw.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ccw.pojo.TbItem;
import cn.ccw.service.ItemService;

@Controller
public class TbItemController {

	@Autowired
	private ItemService itemService;
	//根据id查询商品
	@RequestMapping("findTbItemById/{id}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long id) throws Exception{
		TbItem item = itemService.findItemById(id);
		return item;
	}
}
