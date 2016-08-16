package com.iyihua.sample.web;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iyihua.sample.domain.customer.Customer;
import com.iyihua.sample.domain.order.Order;
import com.iyihua.sample.service.StoreService;

@Controller
public class SampleController  {
	
	@Autowired StoreService storeService;
	
    @ResponseBody
    @RequestMapping(value = "/index")
    String home() {   
        return "Hello World!";
    }
    
    
    
    @ResponseBody
    @RequestMapping(value = "/store")
    Object store() {
    	Map<String, Object> result = new HashMap<String, Object>();
    	try {
    		Customer c = new Customer();
    		c.setName("test");
    		c.setAge(30);
    		Order o = new Order();
    		o.setCode(1);
    		o.setQuantity(7);
    		storeService.store(c, o);

    		Assert.notNull(c.getId());
    		Assert.notNull(o.getId());
    		result.put("status", "0");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "1");
			result.put("msg", e.getMessage());
		}
    	return result;
    }

    @ResponseBody
    @RequestMapping(value = "/save")
    Object save() {
    	Map<String, Object> result = new HashMap<String, Object>();
    	try {
    		
    		storeService.transfer();
//    		storeService.transferWithStoreException();
    		result.put("status", "0");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "1");
			result.put("msg", e.getMessage());
		}
    	return result;
    }
}
