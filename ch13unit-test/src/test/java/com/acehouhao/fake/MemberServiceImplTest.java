package com.acehouhao.fake;

import com.acehouhao.dao.MemberDAO;
import com.acehouhao.model.Member;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class MemberServiceImplTest {
    @Test
    public void testAddMember() {
        MemberDAO memberDAO = new MemberDAOFake();
        memberDAO.add(new Member(1, "John Diet"));
        memberDAO.add(new Member(2, "Jane Biteman"));
        Assert.assertEquals(2, memberDAO.getMembers().size());
    }
}
