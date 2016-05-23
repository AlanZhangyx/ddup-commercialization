package com.ddup.commercialization.impl.goods;

import org.springframework.stereotype.Service;

import com.ddup.commercialization.api.goods.GoodsRemoteService;
import com.ddup.commercialization.api.model.GoodsDTO;

@Service("goodsRemoteService")
public class GoodsRemoteServiceImpl implements GoodsRemoteService {

	@Override
	public String getBlessingByName(String username) {
		return "God bless you " + username;
	}

	@Override
	public int addGoods(GoodsDTO goods) {
		System.out.println("server : " + goods.getId());
		System.out.println("server : " + goods.getName());
		return 1;
	}

}
