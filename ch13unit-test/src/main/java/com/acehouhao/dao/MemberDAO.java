package com.acehouhao.dao;

import com.acehouhao.model.Member;

import java.util.List;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public interface MemberDAO {
    void add(Member member);
    List<Member> getMembers();
}
