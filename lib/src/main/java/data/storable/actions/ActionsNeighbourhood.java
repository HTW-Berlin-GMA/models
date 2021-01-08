/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.user.User;

public interface ActionsNeighbourhood extends Actions {
    boolean setCompleted(Boolean statusComplete);

    boolean setHelper(User helper);

    boolean isCompleted();

    User getHelper();
}
