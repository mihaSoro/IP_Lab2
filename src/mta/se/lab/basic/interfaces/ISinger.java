package mta.se.lab.basic.interfaces;

import mta.se.lab.basic.exceptions.SingException;

/**
 * Created by John on 27/10/2014.
 *
 * This is the interface for all the people that are going to sing the anthem
 */
public interface ISinger {

    /**
     * This is the singing method
     */
    public void sing() throws SingException;
}
