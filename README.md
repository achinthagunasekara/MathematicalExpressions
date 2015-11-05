#Java Library to Evaluate String Mathematical Expressions

This is a smiple Java library that can be used to solve mathematical expressions. You can input your mathematical expressions as a string variable and this library convert them to mathematical expressions and solves them.

For bad expressions that can't be solved, the library will throw

```java
src.com.achinthagunasekara.mathematical.BadMathematicalExpressionException
```

##Import the library into your Java application

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
me.getHistory(3); //returns a String with # 3 expression
```

To clear history,

```java
me.clearHistory(); //clear all past expressions in the history
```

##Printing

To print history of input mathematical expressions,

```java
me.printHistory(); //prints history on screen
```

You can call below function with a boolean parameter called printFullErrors. This will print a stck trace for any errors if the passed in parameter is true. Otherwise it'll print minimal erros.

```java
me.printHistoryAndSolutions(true); //prints history and solutuins on screen with full details of any errors.
```

```java
me.printHistoryAndSolutions(false); //prints history and solutuins on screen with full details of any errors.
```

To print history and solutions to input mathematical expressions use the below function. It's a overloaded function and it'll call the ablove function with 'false' as parameter under the hood.

```java
me.printHistoryAndSolutions(); //prints history and solutuins on screen
```
