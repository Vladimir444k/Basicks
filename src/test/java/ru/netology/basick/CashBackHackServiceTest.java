package ru.netology.basick;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldCashBackService(){
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void shouldCashBackServiceTwo(){
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}