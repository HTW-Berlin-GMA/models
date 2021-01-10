/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.Location;
import data.storable.Storable;
import data.storable.user.User;

import java.time.LocalDate;
import java.time.Period;

public interface Actions extends Storable, Location {
    boolean setActionName(String name);

    boolean setActivity(String activity);

    boolean setOwner(User owner);

    boolean updateBeginDate(LocalDate dateBegin);

    boolean updateEndDate(LocalDate dateEnd);

    boolean updateDuration(Period duration);

    String getActionName();

    Activities getActivity();

    User getOwner();

    LocalDate getBeginDate();

    LocalDate getEndDate();

    Period getDuration();
}
