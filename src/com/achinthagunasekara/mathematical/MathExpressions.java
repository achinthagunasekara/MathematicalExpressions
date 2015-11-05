package com.achinthagunasekara.mathematical;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Achintha Gunasekara
 * @data 2015.10.23
 * 
 */

public class MathExpressions {
    
    private ArrayList<String> history;
    private final ScriptEngineManager mgr;
    private final ScriptEngine engine;
    
    public MathExpressions() {
    
        this.history = new ArrayList<>();
        this.mgr = new ScriptEngineManager();
        this.engine = mgr.getEngineByName("JavaScript");
    }
    
    private String evaluateToString(String expression) throws ScriptException {
        
        this.history.add(expression);
        return this.engine.eval(expression).toString();
    }
    
    public Double evaluate(String expression) throws BadMathematicalExpressionException {
        
        try {
            
            return Double.parseDouble(evaluateToString(expression));
        }
        catch (ScriptException scriptEx) {
            
            Logger.getLogger(MathExpressions.class.getName()).log(Level.SEVERE, null, scriptEx);
            throw new BadMathematicalExpressionException(scriptEx, expression);
        }
    }
    
    public ArrayList<String> getHistory() {
        
        return this.history;
    }
    
    public String getHistory(int itemNumber) {
        
        return this.history.get(itemNumber - 1);
    }
    
    public void clearHistory() {
        
        this.history = new ArrayList();
    }
    
    public void printHistory() {
        
        this.history.stream().forEach((s) -> {
            
            System.out.println(s);
        });
    }
    
    public void printHistoryAndSolutions() {
        
        printHistoryAndSolutions(false);
    }
    
    public void printHistoryAndSolutions(boolean printFullErrors) {
        
        this.history.stream().forEach((s) -> {
            
            try {
                
                System.out.println(s + " = " + this.evaluate(s));
            }
            catch(BadMathematicalExpressionException badMEx) {
                
                if(printFullErrors) {
                    
                    System.out.println(s + " = " + badMEx.getMessage() + ". Info : " + badMEx.getErrorDetails());
                }
                else {
                    
                    System.out.println(s + " = " + badMEx.getMessage());
                }
            }
        });
    }
}
