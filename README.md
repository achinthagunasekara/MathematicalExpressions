##Java Library to Evaluate String Mathematical Expressions

Import the library into your Java application

''Java
import com.achinthagunasekara.mathematical.MathExpressions;
''

You can create a new instance of MathExpressions object by

''java
MathExpressions me = new MathExpressions();
''

To evaluate a string mathematical expression,

''java
System.out.println(me.evaluate("3*4));
System.out.println(me.evaluate("4+5));
''

To get a history of previous mathematical expressions,

''java
me.getHistory(); //returns a ArrayList<String> with past expressions
''