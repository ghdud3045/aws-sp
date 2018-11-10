package com.bdi.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.dao.AwsDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBtest {
	
	@Autowired
	private AwsDAO awdao;
	
	
	@Test
	public void test() throws SQLException {
//		Aws aws = ss.selectOne("com.bdi.sp.AWS_TEST.selectAWS",2);
//		assertNotNull(aws);
//		
//		aws.setAwname("변경");
//		aws.setAwage(24);
//		assertEquals(1, ss.update("com.bdi.sp.AWS_TEST.updateAWS",aws));
//		
//		aws = ss.selectOne("com.bdi.sp.AWS_TEST.selectAWS",2);
//		assertEquals("변경", aws.getAwname());
//		
//		assertEquals(1, ss.delete("com.bdi.sp.AWS_TEST.deleteAWS",2));
//		
//		assertEquals(1, ss.insert("com.bdi.sp.AWS_TEST.insertAWS",aws));
//		
//		List<Aws> atList = ss.selectList("com.bdi.sp.AWS_TEST.selectAWSList");
//		
//		assertEquals(2, atList.size());
		
		
		assertNotNull(awdao.selectAwsList());
		assertEquals(2, awdao.selectAwsList().size());
	}

}
