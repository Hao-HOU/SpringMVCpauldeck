package com.acehouhao.spy;

import com.acehouhao.MyUtility;
import com.acehouhao.dao.GarageDAO;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class GarageDAOSpy implements GarageDAO {
    private int carCount = 3;
    @Override
    public MyUtility rent() {
        if (carCount == 0) {
            return null;
        } else {
            carCount--;
            return new MyUtility();
        }
    }
}
