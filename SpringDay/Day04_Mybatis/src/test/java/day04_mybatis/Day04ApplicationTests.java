package day04_mybatis;

import day04_mybatis.domain.User;
import day04_mybatis.domain.ext.OrdersExt;
import day04_mybatis.domain.ext.OrdersExt2;
import day04_mybatis.domain.ext.OrdersExt3;
import day04_mybatis.mapper.OrdersExt1Mapper;
import day04_mybatis.mapper.OrdersExt2Mapper;
import day04_mybatis.mapper.OrdersExt3Mapper;
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
	// 一对一
	public void test01() {
		OrdersExt ordersExt = new OrdersExt();
		ordersExt.setId(5);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt1Mapper ordersExt1Mapper = sqlSession.getMapper(OrdersExt1Mapper.class);

		OrdersExt ordersExt1 = ordersExt1Mapper.findOrdersExt(ordersExt);
		System.out.println(ordersExt1.toString());
		sqlSession.close();
	}

	@Test
	// 一对多
	public void test02(){
		OrdersExt2 ordersExt2 = new OrdersExt2();
		ordersExt2.setId(3);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt2Mapper mapper = sqlSession.getMapper(OrdersExt2Mapper.class);

		OrdersExt2 ordersExt = mapper.findOrdersExt(ordersExt2);
		System.out.println(ordersExt);
		sqlSession.close();
	}

	@Test
	// 一对一和一对多同时存在
	public void test03(){
		OrdersExt3 ordersExt3 = new OrdersExt3();
		ordersExt3.setId(3);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt3Mapper mapper = sqlSession.getMapper(OrdersExt3Mapper.class);

		OrdersExt3 OrdersExt3 = mapper.findOrdersExt(ordersExt3);
		System.out.println(OrdersExt3);
		sqlSession.close();

	}

	@Test
	// 一对一懒加载
	public void test04(){
		OrdersExt ordersExt = new OrdersExt();
		ordersExt.setId(5);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt1Mapper ordersExt1Mapper = sqlSession.getMapper(OrdersExt1Mapper.class);


		OrdersExt ordersExt1 = ordersExt1Mapper.findOrdersExt(ordersExt);

		ordersExt1.getUserId();

		ordersExt1.getUser();

		sqlSession.close();
	}

	@Test
	// 一对一和一对多同时存在
	public void test05(){
		OrdersExt3 ordersExt3 = new OrdersExt3();
		ordersExt3.setId(3);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersExt3Mapper mapper = sqlSession.getMapper(OrdersExt3Mapper.class);

		OrdersExt3 OrdersExt3 = mapper.findOrdersExt(ordersExt3);

		System.out.println(OrdersExt3);
		sqlSession.close();

	}
}
