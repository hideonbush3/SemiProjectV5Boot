package hideonbush.springboot.semiproject5v.dao;

import hideonbush.springboot.semiproject5v.model.Member;
import hideonbush.springboot.semiproject5v.model.Zipcode;

import java.util.List;

public interface JoinDao {
    List<Zipcode> selectZipcode(String dong);

    int insertMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);
}
