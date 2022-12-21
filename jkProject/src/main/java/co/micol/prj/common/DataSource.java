package co.micol.prj.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {  //싱글톤 클래스
	private static SqlSessionFactory sqlSessionFactory; //Mybatis 사용
	
	private DataSource() {}  //생성자를 다른곳에서 생성할 수 없도록
	
	public static SqlSessionFactory getInstance() {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return sqlSessionFactory;
	}
		
}
