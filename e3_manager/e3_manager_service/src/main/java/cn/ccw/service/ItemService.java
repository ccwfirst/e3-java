package cn.ccw.service;

import cn.ccw.pojo.TbItem;

public interface ItemService {

	//根据Id查询商品信息
	public TbItem findItemById(Long id) throws Exception;
}
