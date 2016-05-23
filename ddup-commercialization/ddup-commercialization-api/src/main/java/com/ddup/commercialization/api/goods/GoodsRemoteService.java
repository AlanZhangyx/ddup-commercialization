package com.ddup.commercialization.api.goods;

import com.ddup.commercialization.api.model.GoodsDTO;

/**
 * @Description: 商品服务
 * @Author alanzhang
 * @Date 2016年5月23日 下午4:06:22 
 */
public interface GoodsRemoteService {
	
	/**
	 * 根据名字获得一个祝福语。
	 * 
	 * @param username
	 * @return
	 */
	public String getBlessingByName(String username);
	
	
    /**
     * 增加一个商品。
     * 
     * @param goods
     * @return
     */
    public int addGoods(GoodsDTO goods);
}
