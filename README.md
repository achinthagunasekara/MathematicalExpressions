##Java Library to Evaluate String Mathematical Expressions

Import the library into your Java application

```Java
import com.achinthagunasekara.mathematical.MathExpressions;
```

You can create a new instance of MathExpressions object by

```java
MathExpressions me = new MathExpressions();
```

## Calculations

To evaluate a string mathematical expression,

```java
System.out.println(me.evaluate("3*4"));
System.out.println(me.evaluate("4+5"));
```

##History

To get a history of previous mathematical expressions,

```java
me.getHistory(); //returns a ArrayList<String> with past expressions
```

You can also get a specific past expression by entering a expression number

```java
me.getHistory(3); //returns a String with # 3 expressions
```

To clear history,

```java
me.clearHistory(); //returns a String with # 3 expressions
```

##Printting

To print history of input mathematical expressions,

```java
printHistory(); //prints history on  screen
```

To print history and solutions to input mathematical expressions

```java
printHistoryAndSolutions(); //prints history and solutuins on  screen
```
