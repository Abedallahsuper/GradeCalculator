import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GradeCalculatorTest {
    @Test
    public void testLetterGradeA() {
        GradeCalculator calc = new GradeCalculator();
        assertEquals("A", calc.getLetterGrade(95));
    }
    @Test
    public void testPassingGrade() {
        GradeCalculator calc = new GradeCalculator();
        assertTrue(calc.isPassing(75));
    }
    @Test
    public void testCalculateAverageNormal() {
        GradeCalculator calc = new GradeCalculator();
        double[] grades = {80, 90, 100};
        assertEquals(90, calc.calculateAverage(grades), 0.001);
    }
}
