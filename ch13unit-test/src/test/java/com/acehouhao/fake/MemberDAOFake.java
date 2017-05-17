package com.acehouhao.fake;

import com.acehouhao.dao.MemberDAO;
import com.acehouhao.model.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class MemberDAOFake implements MemberDAO {
    private List<Member> members = new ArrayList<>();

    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }
}
