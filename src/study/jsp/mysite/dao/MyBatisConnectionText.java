package study.jsp.mysite.dao;

import org.apache.ibatis.session.SqlSession;

public class MyBatisConnectionText {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		sqlSession.close();
	}
}
