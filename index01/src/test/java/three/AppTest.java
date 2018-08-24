package three;

import static org.junit.Assert.assertTrue;

import dao.IdepMapper;
import entity.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.SessionFactoryUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {
    SqlSession sqlSession = null;
    IdepMapper mapper = null;

    @Before
    public void before() {
//        抢先执行
        sqlSession = SessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(IdepMapper.class);
    }

    @After
    public void after() {
//        结束执行
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void shouldAnswerWithTrue() {
        Country country = mapper.selectCountry(1);
        System.out.println(country);
    }
}
