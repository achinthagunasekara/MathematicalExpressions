package com.achinthagunasekara.mathematical;

import java.util.ArrayList;

/**
 *
 * @author archieg
 * @data 2015.10.23
 * 
 */

public class MathExpressions {
    
    private final ArrayList<String> history;
    
    public MathExpressions() {
    
        history = new ArrayList<>();
    }
    
    public double evaluate(String expression) {
        
        double solution = 0;
        //calculate logic
        history.add(expression);
        return solution;
    }
    
    public ArrayList<String> getHistory() {
        
        return this.history;
    }
}