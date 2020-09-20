import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester
{
    
    GradeBook gradebook;

    @BeforeEach
    void setUp() throws Exception
    {
	gradebook = new GradeBook(5);
	gradebook.addScore(70.0);
	gradebook.addScore(80.0);
	gradebook.addScore(90.0);
	gradebook.addScore(80.0);
    }

    @AfterEach
    void tearDown() throws Exception
    {
	gradebook = null;
    }

    @Test
    void testaddScore()
    {
	gradebook.addScore(70.0);
	assertEquals(gradebook.toString(),"70.0 80.0 90.0 80.0 70.0 ");

    }
    
    @Test
    void testSum()
    {
	gradebook.sum();
	assertEquals(gradebook.sum(),320.0);

    }
    
    @Test
    void testMinimum()
    {
	gradebook.sum();
	assertEquals(gradebook.minimum(),70.0);

    }
    void testFinalScore()
    {
	gradebook.sum();
	assertEquals(gradebook.finalScore(),250.0);

    }

}
