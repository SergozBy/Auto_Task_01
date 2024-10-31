package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountRemain_900() {
        CashbackHackService Count = new CashbackHackService();
        int actual = Count.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
}
