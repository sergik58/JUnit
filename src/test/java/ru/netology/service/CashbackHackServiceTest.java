package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void adviceToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void adviceBuyMoreBeforeMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }

    @Test
    public void buyNotEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1750;
        int expected = 250;
        int actual = service.remain(1750);
        assertEquals(actual, expected);
    }

    @Test
    public void buyEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int expected = 0;
        int actual = service.remain(3000);
        assertEquals(actual, expected);
    }

    @Test
    public void buyThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}

