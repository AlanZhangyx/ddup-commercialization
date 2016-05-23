package com.ddup.commercialization.impl.goods;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ddup.commercialization.api.goods.GoodsRemoteService;
import com.lagou.service.business.buser.api.BUserQueryService;
import com.lagou.service.business.buser.model.BUser;

import base.BaseSpringTestConfig;

public class GoodsRemoteServiceImplTest extends BaseSpringTestConfig{
	
	@Autowired
    private GoodsRemoteService goodsRemoteService;

	@Autowired
    private BUserQueryService bUserQueryService;
	
    @Test
    public void test(){
    	Calendar calendar1 = Calendar.getInstance();
    	Calendar calendar2 = Calendar.getInstance();
    	calendar1.set(2016, 01, 01);
    	
    	calendar2.set(2016, 05, 05);
    	
    	List<BUser> list = bUserQueryService.queryBUsersByLoginTime(calendar1.getTime(), calendar2.getTime(), 1, 100);
    	
    	System.out.println(list.size());
    	
    	System.out.println(goodsRemoteService.getBlessingByName("alan"));
    }
	
	
}
