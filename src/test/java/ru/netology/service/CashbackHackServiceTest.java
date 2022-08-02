package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

   @Test
    public void shouldCalculateCashback () {
        CashbackHackService service = new CashbackHackService();
        int amount = 3950;
        int expected = 50;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }
}
