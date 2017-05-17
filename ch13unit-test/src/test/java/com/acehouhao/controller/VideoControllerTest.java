package com.acehouhao.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class VideoControllerTest {
    @Test
    public void testGetMostViewed() {
        VideoController videoController = new VideoController();
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI("/mostViewed");
        request.setAttribute("id", 1);
        MockHttpServletResponse response = new MockHttpServletResponse();

        //must invoke
        videoController.getMostViewed(request, response);

        Assert.assertEquals(200, response.getStatus());
        Assert.assertEquals(100L, (int)request.getAttribute("viewed"));
    }

    @Test
    public void testGetMostViewedWithNoId() {
        VideoController videoController = new VideoController();
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI("/mostViewed");
        MockHttpServletResponse response = new MockHttpServletResponse();

        //must invoke
        videoController.getMostViewed(request, response);

        Assert.assertEquals(500, response.getStatus());
        Assert.assertNull(request.getAttribute("viewed"));

    }
}
