package com.acehouhao.service;

import com.acehouhao.dao.MemberDAO;
import com.acehouhao.model.Member;

import java.util.List;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;
    public void setMemberDAO(MemberDAO memberDAOArg) {
        this.memberDAO = memberDAOArg;
    }

    @Override
    public void add(Member member) {
        memberDAO.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return memberDAO.getMembers();
    }
}
