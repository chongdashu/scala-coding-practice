## Setup

### Homebrew

```
$ brew install scala
$ brew install sbt
```

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

