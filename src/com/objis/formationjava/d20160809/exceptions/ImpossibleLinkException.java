package com.objis.formationjava.d20160809.exceptions;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class ImpossibleLinkException extends Exception {

    public ImpossibleLinkException() {
        super();
    }

    public ImpossibleLinkException(String message) {
        super(message);
    }

    public ImpossibleLinkException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpossibleLinkException(Throwable cause) {
        super(cause);
    }

    public ImpossibleLinkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
