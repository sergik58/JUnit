package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void adviceToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void adviceBuyMoreBeforeMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(expected, actual );
    }

    @Test
    public void buyNotEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1750;
        int expected = 250;
        int actual = service.remain(1750);
        assertEquals(expected, actual);
    }

    @Test
    public void buyEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int expected = 0;
        int actual = service.remain(3000);
        assertEquals(expected,actual);
    }

    @Test
    public void buyThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual );
    }
}

