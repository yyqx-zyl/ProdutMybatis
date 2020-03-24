import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession=factory.openSession();
			int count=sqlSession.selectOne("Dao.ProductMapper.getcount");
			System.out.println(count);
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
