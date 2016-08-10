package com.objis.formationjava.d20160809.exceptions;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class CreatePlacementException extends Exception {

    public CreatePlacementException() {
        super();
    }

    public CreatePlacementException(String message) {
        super(message);
    }

    public CreatePlacementException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreatePlacementException(Throwable cause) {
        super(cause);
    }

    public CreatePlacementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
