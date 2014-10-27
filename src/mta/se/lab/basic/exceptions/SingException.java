package mta.se.lab.basic.exceptions;

/**
 * Created by John on 27/10/2014.
 *
 * This is the exception thrown by the {@link mta.se.lab.basic.interfaces.ISinger} interface
 */
public class SingException extends Exception {

    public SingException(String message) {
        super(message);
    }
}
