package com.achinthagunasekara.mathematical;

/**
 *
 * @author Achintha Gunasekara
 * @data 2015.10.23
 * 
 */
public class BadMathematicalExpressionException extends Exception {
    
    //this variable to be used in the future
    private final String error;
    private final String expression;
    
    public BadMathematicalExpressionException(String error, String expression) {
        
        super(error);
        this.error = error;
        this.expression = expression;
    }
    
    @Override
    public String toString() {
        
        String message = "Unable to evaluate the expression : " + this.expression + ". Info: " + this.error;
        return message;
    }
}
