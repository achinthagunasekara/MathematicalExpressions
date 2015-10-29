package com.achinthagunasekara.mathematical;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author archieg
 * @data 2015.10.23
 * 
 */

public class MathExpressions {
    
    private ArrayList<String> history;
    
    public MathExpressions() {
    
        history = new ArrayList<>();
    }
    
    private String evaluateToString(String expression) throws ScriptException {
        
        history.add(expression);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return engine.eval(expression).toString();
    }
    
    public Double evaluate(String expression) throws BadMathematicalExpressionException {
        
        try {
            
            return Double.parseDouble(evaluateToString(expression));
        }
        catch (ScriptException ex) {
            
            Logger.getLogger(MathExpressions.class.getName()).log(Level.SEVERE, null, ex);
            throw new BadMathematicalExpressionException("Unable to evaluate the expression - " + expression + ". Info: " + ex.toString());
        }
    }
    
    public ArrayList<String> getHistory() {
        
        return this.history;
    }
    
    public String getHistory(int itemNumber) {
        
        return history.get(itemNumber - 1);
    }
    
    public void clearHistory() {
        
        history = new ArrayList();
    }
    
    public void historyToString() {
        
        //implementation
    }
}