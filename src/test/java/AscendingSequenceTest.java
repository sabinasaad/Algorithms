import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {

    AscendingSequence aS;

    @BeforeEach
    void setUp() {
        aS = new AscendingSequence();
    }

    @RepeatedTest(10)
    @Order(1)
    @Test
    public void testAscendingSequenceHappyPathPositiveNums() {
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNums() {
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10,-9,-8,-7};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNums() {
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5,-4,-3,-2,-1,0,1,2,3,4,5};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        int start = -0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0,2,4};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThanEnd() {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartEqualsEnd() {
        int start = 5;
        int end = 5;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepZero() {
        int start = 5;
        int end = 5;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepNegative() {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence aS = new AscendingSequence();
        int[] actualResult = aS.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
