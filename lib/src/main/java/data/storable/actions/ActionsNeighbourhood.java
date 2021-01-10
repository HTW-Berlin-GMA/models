/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.user.User;
import data.storage.Storage;

import java.util.UUID;

public interface ActionsNeighbourhood extends Actions {
    boolean setCompleted(Boolean statusComplete);

    boolean setHelper(User helper);

    boolean setHelper(Storage user_storage, String userID);

    boolean isCompleted();

    User getHelper();

    UUID getHelperID();
}
