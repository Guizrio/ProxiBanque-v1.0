package com.objis.formationjava.d20160809.exceptions;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class CreateVirementException extends Exception {

    public CreateVirementException() {
        super();
    }

    public CreateVirementException(String message) {
        super(message);
    }

    public CreateVirementException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateVirementException(Throwable cause) {
        super(cause);
    }

    public CreateVirementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
