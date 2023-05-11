package hideonbush.springboot.semiproject5v.dao;

import hideonbush.springboot.semiproject5v.model.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mdao")
public class MemberDaoImpl implements MemberDao{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public int selectLogin(Member m) {
        return sqlSession.selectOne("member.selectLogin", m);
    }
}
