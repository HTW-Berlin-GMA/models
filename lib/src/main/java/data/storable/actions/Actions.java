/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.*;
import data.storable.user.*;

import java.time.LocalDate;
import java.time.Period;

public interface Actions extends Storable, Location {
    boolean setActionname(String name);

    boolean setActivity(String activity);

    boolean updateBeginDate(LocalDate dateBegin);

    boolean updateEndDate(LocalDate dateEnd);

    boolean updateDuration(Period duration);

    String getActionname();

    Activities getActivity();

    User getOwner();

    LocalDate getBeginDate();

    LocalDate getEndDate();

    Period getDuration();
}
