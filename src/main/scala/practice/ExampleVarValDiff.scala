package com.chongdashu.scala.practice

class Person(age_ : Int, testScore_ : GradeReport) {
    val age = age_;
    var gradeReport = testScore_;
}

class GradeReport(score_ : Int) {
    val score = score_;
}

object ExampleVarValDiff extends App {
    val testScoreA = new GradeReport(100); // A scored full marks
    val testScoreB = new GradeReport(45);  // B failed.
    
    var personA = new Person(25, testScoreA); // A is 25 years old
    var personB = new Person(30, testScoreB); // B is 30 years old
    
    println("Initially:");
    printGradeReports();
    
    // Can we modify a person's age?
    // personA.age = 30;           // WRONG: Can't modify someone's age (val)
    
    // Can we modify a grade report's score?
    // testScoreB.score = 100;     // WRONG: Can't modify a score, that's cheating! (val)
    
    // But we can change B's grade-report and swap it with A's! (var)
    personB.gradeReport = personA.gradeReport;
    
    println("Finally:");
    printGradeReports();
   
    /**
     * Retrieves the grade report for each person and prints it out.
     * Method trusts that each person is holding their own grade report 
     * in the <code>Person.gradeReport</code>.
     */
    def printGradeReports() = {
         println("Person A, aged:" + personA.age + ", got a score of:" + personA.gradeReport.score);
         println("Person B, aged:" + personB.age + ", got a score of:" + personB.gradeReport.score);
    }
}