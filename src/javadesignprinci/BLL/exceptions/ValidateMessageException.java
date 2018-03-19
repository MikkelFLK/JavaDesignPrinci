/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL.exceptions;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author morte
 */

public class ValidateMessageException
{
    
    
    private final String[] BAD_WORD = 
    {
        "fuck"
    };
    /*
    public boolean validateInputs(String input)
    {
      Boolean isValid = true;
isValid = !input.isEmpty();

Int c = 0;
While (isValid && c <BAD_WORD.length)
{
isValid = !input.toLowerCase().contains(BAD_WORD[c++].toString);
}
validationMessage = isValid ? "Word is valid" : "Word is not valid";

Return isValid;
  
    }
    
    */
}
