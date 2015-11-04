package com.achinthagunasekara.mathematical;

import javax.script.ScriptException;

/**
 *
 * @author Achintha Gunasekara
 * @data 2015.10.23
 * 
 */
public class BadMathematicalExpressionException extends Exception {
    
    private final ScriptException scriptEx;
    private final String expression;
    
    public BadMathematicalExpressionException(ScriptException scriptEx, String expression) {
        
        super(scriptEx.getMessage());
        this.scriptEx = scriptEx;
        this.expression = expression;
    }
    
    @Override
    public String toString() {
        
        String message = "Unable to evaluate the expression : " + this.expression;
        return message;
    }
    
    public String getErrorDetails() {
        
        return this.scriptEx.getMessage();
    }
}