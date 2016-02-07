## Setup

### Homebrew

```
$ brew install scala
$ brew install sbt
```

### Simple Build Tools (`sbt`)

It appears that people promote using the Simple Build Tools (`sbt`)
system for managing projects.

#### Project Structure

```
.
|-- build.sbt
|-- lib
|-- project
    |- plugins.sbt
|-- src
|   |-- main
|   |   |-- java
|   |   |-- resources
|   |   |-- scala
|   |-- test
|       |-- java
|       |-- resources
|       |-- scala
|-- target
```
(Credits to [Alvin Alexander](http://alvinalexander.com/scala/how-to-create-sbt-project-directory-structure-scala))

#### Quick-Start

+ Run using `sbt run`
+ Generate Eclipse `.project` files using `sbt eclipse`

#### Plugins

Place plugins (like the sbteclipse plugin)  into the `./project/plugins.sbt` file.

#### Dependencies

Depedencies go into the `./build.sbt` file.


### Command Line

Assuming a structure as follows:

```
|- project
    |- bin
    |- src
        |- com
            |- chongdashu
                |- scala
                    |- Main.scala
```

Assuming the working directory is `project` 
(i.e. first, `cd` into the  `project` folder)

#### Compiling

Compile using the following command:

```bash
scalac src/com/chongdashu/scala/Main.scala -d bin
```

The `-d bin` places compiled classes into the `bin` folder.

#### Running

Run the `Main` class using the following command:

```bash
scala -cp bin com.chongdashu.scala.Main
```

The `-cp bin` command makes the classpath the `bin` folder.

### Snippets

#### `List` operations

`::` is a prepend operator; it adds the argument to the front of the `List`

```scala
List("suffix").::("prefix")
```
```
List("prefix", "suffix")
```

When using any method that ends in `:` without the `.` diretive, it is right associative.

```scala
List("suffix") :: "prefix"  // WRONG: :: is not an operator of the String class
"prefix" :: List("suffix")  // RIGHT
```

```
List("prefix", "suffix")    // Yes, this is equivialent to the above!
```

#### `List`, `ListBuffer`

`List` is immutable, while `ListBuffer` is mutable.


#### `var` vs. `val`

The different is that objects assigned to a `var` can be replaced; objects assigned to a `val` can not.


```scala
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
    // personA.age = 30;       // WRONG: Can't modify someone's age (val)
    
    // Can we modify a grade report's score?
    // testScoreB.score = 100;    // WRONG: Can't modify a score, that's cheating! (val)
    
    // But we can change B's grade-report and swap it with A's!
    personB.gradeReport = personA.gradeReport;
    
    println("Finally:");
    printGradeReports();
   
    /**=
     * Retrieves the grade report for each person and prints it out.
     * Method trusts that each person is holding their own grade report 
     * in the <code>Person.gradeReport</code>.
     */
    def printGradeReports() = {
         println("Person A, aged:" + personA.age + ", got a score of:" + personA.gradeReport.score);
         println("Person B, aged:" + personB.age + ", got a score of:" + personB.gradeReport.score);
    }
}

```
Output:
```
Initially:
Person A, aged:25, got a score of:100
Person B, aged:30, got a score of:45
Finally:
Person A, aged:25, got a score of:100
Person B, aged:30, got a score of:100
```

#### Arrays

The default constructor of `Array` takes in an argument:

```scala
var array = new Array(10); // creates an Array of size 10
```

However, if an empty `Array` is required, omit the `new` command:

```scala
var array = Array();       // Correct:  creates an empty Array
var array = new Array();   // WRONG:    won't compile
```

#### Classes

All class variables need to be initialized, otherwise Scala will assume class is abstract.


```scala
class Engine {
    var entities : List[Entity];              // won't work
    var entities : List[Entity] = new List(); // works 
}
```

## References

Some useful resources.

+ ["Why Scala?" (2014) Clint's Software Development Corner](https://softwarecorner.wordpress.com/2014/12/31/why-scala/)

