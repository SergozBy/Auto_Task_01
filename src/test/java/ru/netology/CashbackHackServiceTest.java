package ru.netology;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import org.junit.Test;
import org.junit.Assert;

import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountRemainFor_900() {
        CashbackHackService Count = new CashbackHackService();
        int actual = Count.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountRemainFor_1_000() {
        CashbackHackService Count = new CashbackHackService();
        int actual = Count.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountRemainFor_0() {
        CashbackHackService Count = new CashbackHackService();
        int actual = Count.remain(0);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);
    }
}
