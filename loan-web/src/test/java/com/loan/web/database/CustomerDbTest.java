package com.loan.web.database;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.loan.web.model.Customer;

public class CustomerDbTest {

	@Test
	public void testGetcustomer() {
		List<Customer>customerdata =new ArrayList();
		customerdata=CustomerDb.getcustomer();
		assertNotNull(customerdata);
		
	}

}
