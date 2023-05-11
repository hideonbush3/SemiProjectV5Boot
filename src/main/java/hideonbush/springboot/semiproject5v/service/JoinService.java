package hideonbush.springboot.semiproject5v.service;

import hideonbush.springboot.semiproject5v.model.Member;

public interface JoinService {
    String findZipcode(String dong);

    boolean newMember(Member m);

    int checkUserid(String uid);

    boolean loginMember(Member m);
}
