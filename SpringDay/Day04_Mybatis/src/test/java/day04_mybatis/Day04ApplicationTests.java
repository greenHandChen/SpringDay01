package day04_mybatis;

import day04_mybatis.domain.ext.OrdersExt;
import day04_mybatis.domain.ext.OrdersExt2;
import day04_mybatis.domain.ext.OrdersExt3;
import day04_mybatis.mapper.OrderMapper;
import day04_mybatis.mapper.OrdersExt2Mapper;
import day04_mybatis.mapper.OrdersExt3Mapper;
import lombok.Data;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Day04ApplicationTests {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws IOException {
		InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}

	@Test
	public void contextLoads() {
		OrdersExt ordersExt = new OrdersExt();
		ordersExt.setId(5);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

		List<OrdersExt> ordersExt1 = orderMapper.findOrdersExt(ordersExt);
		System.out.println(ordersExt1.get(0).getNumber());
		sqlSession.close();
	}

	@Test
	public void test02(){
		OrdersExt2 ordersExt2 = new OrdersExt2();
		ordersExt2.setId(5);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt2Mapper mapper = sqlSession.getMapper(OrdersExt2Mapper.class);

		List<OrdersExt2Mapper> list = mapper.findOrdersExt(ordersExt2);
		System.out.println(list);
		sqlSession.close();
	}

	@Test
	public void test03(){
		OrdersExt3 ordersExt3 = new OrdersExt3();
		ordersExt3.setId(3);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt3Mapper mapper = sqlSession.getMapper(OrdersExt3Mapper.class);

		List<OrdersExt3> list = mapper.findOrdersExt(ordersExt3);
		System.out.println(list);
		sqlSession.close();

	}

}
