package com.loan.web.database;

import java.util.ArrayList;
import java.util.List;

import com.loan.web.model.Customer;

public class CustomerDb {

	
		public static List<Customer>getcustomer(){
			
			List<Customer> c=new ArrayList();
			Customer cg=new Customer();
			cg.setCname("aaaaa");
			cg.setCname("aaaaa");
			cg.setCname("aaaaa");
			cg.setCname("aaaaa");
			c.add(cg);
			return c;
			
		}
}
