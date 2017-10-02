package fr.parisnanterre.poa.td2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by thsartre on 02/10/2017.
 */
public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
    }

    @Parameters({"paper","rock"})
    @Test
    public void testPlayWIN(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);
    }
/*
    @Parameters({"paper","rock"})
    @Test
    public void testPlayLOST(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);
    }

    @Parameters({"paper","rock"})
    @Test
    public void testPlayTIE(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
    }*/
}