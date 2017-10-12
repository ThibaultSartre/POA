package fr.parisnanterre.poa.td2;

import org.testng.annotations.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by thsartre on 02/10/2017.
 */
public class RockPaperScissorsTest {

    private RockPaperScissors rps;
    private Player p1;
    private Player p2;

    @BeforeMethod
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @BeforeMethod
    public void setUpClass() throws Exception {
        p1 = new Player("Thibault",new ArrayList<RPSEnum>());
        p2 = new Player("Thibault",new ArrayList<RPSEnum>());
    }

    @AfterMethod
    public void tearDownClass() throws Exception {
        p1 = null;
        p2 = null;
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
    }
/*
    @Parameters({"paper","rock"})
    @Test
    public void testPlayWIN(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testPlayLOST(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);
    }

    @Parameters({"paper","paper"})
    @Test
    public void testPlayTIE(String p1,String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
    }
*/
    @DataProvider(name = "WinData")
    public Object[][] createWinData(){
        return new Object[][]{
                {RPSEnum.PAPER,RPSEnum.ROCK},
                {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS,RPSEnum.PAPER}
        };
    }

    @DataProvider(name = "TieData")
    public Object[][] createTieData(){

        return new Object[][]{
                {RPSEnum.PAPER,RPSEnum.PAPER},
                {RPSEnum.ROCK,RPSEnum.ROCK},
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS}
        };
    }

    @DataProvider(name = "LostData")
    public Object[][] createLostData(){

        return new Object[][]{
                {RPSEnum.PAPER,RPSEnum.SCISSORS},
                {RPSEnum.ROCK,RPSEnum.PAPER},
                {RPSEnum.SCISSORS,RPSEnum.ROCK}
        };
    }


    @Test(dataProvider = "WinData")
    public void testPlayWIN(RPSEnum p1,RPSEnum p2) throws Exception {
        assertEquals(rps.play(p1, p2),Result.WIN);
    }


    @Test(dataProvider = "LostData")
    public void testPlayLOST(RPSEnum p1,RPSEnum p2) throws Exception {
        assertEquals(rps.play(p1, p2),Result.LOST);
    }


    @Test(dataProvider = "TieData")
    public void testPlayTIE(RPSEnum p1,RPSEnum p2) throws Exception {
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    @Test
    public void testPlayerPlayWin() throws Exception {
        p1.addCoup(RPSEnum.PAPER);
        p1.addCoup(RPSEnum.ROCK);
        p1.addCoup(RPSEnum.SCISSORS);
        p1.addCoup(RPSEnum.PAPER);

        p2.addCoup(RPSEnum.SCISSORS);
        p2.addCoup(RPSEnum.ROCK);
        p2.addCoup(RPSEnum.PAPER);
        p2.addCoup(RPSEnum.ROCK);

        assertEquals(rps.play(p1,p2), Result.WIN);

    }

    @Test
    public void testPlayerPlayLost() throws Exception {
        p1.addCoup(RPSEnum.PAPER);
        p1.addCoup(RPSEnum.ROCK);
        p1.addCoup(RPSEnum.SCISSORS);
        p1.addCoup(RPSEnum.PAPER);

        p2.addCoup(RPSEnum.SCISSORS);
        p2.addCoup(RPSEnum.ROCK);
        p2.addCoup(RPSEnum.PAPER);
        p2.addCoup(RPSEnum.SCISSORS);

        assertEquals(rps.play(p1,p2), Result.LOST);

    }


    @Test
    public void testPlayerPlayTie() throws Exception {
        p1.addCoup(RPSEnum.PAPER);
        p1.addCoup(RPSEnum.ROCK);
        p1.addCoup(RPSEnum.SCISSORS);
        p1.addCoup(RPSEnum.PAPER);

        p2.addCoup(RPSEnum.SCISSORS);
        p2.addCoup(RPSEnum.ROCK);
        p2.addCoup(RPSEnum.PAPER);
        p2.addCoup(RPSEnum.PAPER);

        assertEquals(rps.play(p1,p2), Result.TIE);

    }



}