package com.acehouhao.service;

import com.acehouhao.MyUtility;
import com.acehouhao.dao.GarageDAO;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class GarageServiceImpl implements GarageService {
    private GarageDAO garageDAO;
    public GarageServiceImpl(GarageDAO garageDAOArg) {
        this.garageDAO = garageDAOArg;
    }
    public MyUtility rent() {
        return garageDAO.rent();
    }
}
