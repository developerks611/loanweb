package com.loan.web.database;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.loan.web.model.Brand;

public class BrandDbTest {



	@Test
	public void testdelete() throws ClassNotFoundException, SQLException {
		Brand brand=new Brand();
		Brand brand2=new Brand();
		brand.setBrandid(1);
		brand2=BrandDb.search(brand);
		assertNotNull(brand2);

	}


}
