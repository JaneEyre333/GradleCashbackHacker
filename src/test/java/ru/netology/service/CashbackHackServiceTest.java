package ru.netology.service;

import org.junit.Test;

////import org.testng.annotations.Test;

public class CashbackHackServiceTest {

////   @Test // для TestNG
    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3950;
        int expected = 50;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
////        org.testng.Assert.assertEquals(actual, expected);  // для TestNG
    }
}


