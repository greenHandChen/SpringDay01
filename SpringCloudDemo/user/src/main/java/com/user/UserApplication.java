package com.user;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Repository;

@SpringBootApplication(
		scanBasePackages = "com.user"
)
// 定义Mybatis 扫描 dao接口的路径
@MapperScan(
		// 指定扫描的路径
		basePackages = "com.user.*",
		// 指定sqlSessionFactory；如果指定sqlSessionTemplate，则被作废
		sqlSessionFactoryRef = "sqlSessionFactory",
		// 通过@Repository再次精度确认
		annotationClass = Repository.class
)
@EnableFeignClients
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
