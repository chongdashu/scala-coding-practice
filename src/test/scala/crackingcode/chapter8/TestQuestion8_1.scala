package test.scala.crackingcode.chapter8

import com.chongdashu.scala.practice.sort.BucketSort
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.crackingcode.chapter8.Question8_1

class TestQuestion8_1 extends TestCase {
    
    override def setUp() = {
    }
    
    def testZeroSteps() = {
        assertEquals("Zero steps should have zero ways.", 0, Question8_1.countWaysToNSteps(0));
    }
    
    def testOneStep() = {
        assertEquals("One steps should have one way.", 1, Question8_1.countWaysToNSteps(1));
    }
    
    def testTwoSteps() = {
        assertEquals("Two steps should have two ways.", 2, Question8_1.countWaysToNSteps(2)); 
    }
    
    def testThreeSteps() = {
        assertEquals("Three steps should have four ways.", 4, Question8_1.countWaysToNSteps(3));
    }
    
    def testFourSteps() = {
        // 1. [step1,step1,step1,step1]
        // 2. [step1,step1,step2]
        // 3. [step1,step2,step1]
        // 4. [step1,step3]
        // 5. [step2,step1,step1]
        // 6. [step2,step2]
        // 7. [step3,step1]
        assertEquals("Four steps should have seven ways.", 7, Question8_1.countWaysToNSteps(4));    
    }
    
    def testFiveSteps() = {
        // 1. [step1,step1,step1,step1,step1]
        // 2. [step1,step1,step1,step2]
        // 3. [step1,step1,step2,step1]
        // 4. [step1,step1,step3]
        // 5. [step1,step2,step1,step1]
        // 6. [step1,step2,step2]
        // 7. [step1,step3,step1]
        
        // 8. [step2,step1,step1,step1]
        // 9. [step2,step1,step2]
        // 10. [step2,step2,step1]
        // 11. [step2,step3]

        // 12. [step3,step1,step1]
        // 13. [step3,step2]
        
        
        assertEquals("Five steps should have thirteen ways.", 13, Question8_1.countWaysToNSteps(5));    
    }
    
    def testSixSteps() = {
        
        assertEquals("Six steps should have thirteen ways.", 24, Question8_1.countWaysToNSteps(6));    
    }
    
}