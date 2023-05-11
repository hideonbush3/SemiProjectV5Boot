package hideonbush.springboot.semiproject5v.service;

import hideonbush.springboot.semiproject5v.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checkLogin(Member m, HttpSession sess);


}
