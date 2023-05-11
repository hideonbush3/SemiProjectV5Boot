package hideonbush.springboot.semiproject5v.dao;

import hideonbush.springboot.semiproject5v.model.Member;

public interface MemberDao {
    int selectLogin(Member m);
}
