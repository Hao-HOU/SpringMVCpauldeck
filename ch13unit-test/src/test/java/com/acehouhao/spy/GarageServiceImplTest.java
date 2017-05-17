package com.acehouhao.spy;

import static org.junit.Assert.*;

import com.acehouhao.MyUtility;
import com.acehouhao.dao.GarageDAO;
import com.acehouhao.service.GarageService;
import com.acehouhao.service.GarageServiceImpl;
import org.junit.Test;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class GarageServiceImplTest {
    @Test
    public void testRentCar() {
        GarageDAO garageDAO = new GarageDAOSpy();
        GarageService garageService = new GarageServiceImpl(garageDAO);
        MyUtility car1 = garageService.rent();
        MyUtility car2 = garageService.rent();
        MyUtility car3 = garageService.rent();
        MyUtility car4 = garageService.rent();

        assertNotNull(car1);
        assertNotNull(car2);
        assertNotNull(car3);
        assertNull(car4);
    }
}
