package ru.vkirilchuk.examples.spring.hessian.api;

import javax.script.ScriptException;

/**
 * Abstract script service interface.  
 **/
public interface ScriptService {
    
    /**
     * Executes script and returns result.
     *
     * @param script object which represents script
     **/
    Object execute(ScriptDTO script) throws ScriptException;
}
