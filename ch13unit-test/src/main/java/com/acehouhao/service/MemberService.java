package com.acehouhao.service;

import com.acehouhao.model.Member;

import java.util.List;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public interface MemberService {
    public void add(Member member);
    public List<Member> getMembers();
}
