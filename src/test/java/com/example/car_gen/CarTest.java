package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testAccelerateSpeed() {
        Honda civic = new Honda("red",2019, 140,true,true);
        Assert.assertEquals(15,civic.accelerateSpeed());
    }
    @Test
    public void testDeccelerateSpeed() {
        Honda civic = new Honda("red", 2019, 140, true, true);
        Assert.assertEquals(5, civic.deccelerateSpeed());
    }
    @Test
    public void testConvertToElectric() {
        Toyota supra = new Toyota("red", 2019, 140, true, false);
        Assert.assertEquals(true,supra.convertToElectric());
    }
}
