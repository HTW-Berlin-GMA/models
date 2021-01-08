/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package logic.exceptions;

public class NoParticipantsCapacityException extends Exception {
    public NoParticipantsCapacityException() {
    }

    public NoParticipantsCapacityException(String message) {
        super(message);
    }

    public NoParticipantsCapacityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoParticipantsCapacityException(Throwable cause) {
        super(cause);
    }

    public NoParticipantsCapacityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
