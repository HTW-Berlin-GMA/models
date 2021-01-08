/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.Storable;

import java.util.List;
import java.util.Map;

public interface ActionsFreedom extends Actions {
    boolean setNumberOfParticipants(Integer numberOfParticipants);

    Integer getNumberOfParticipants();

    boolean setMaximalNumberOfParticipants(Integer maximalNumberOfParticipants);

    Integer getMaximalNumberOfParticipants();

    List<Storable> getListParticipants();

    Map<Storable, List<Storable>> getMapParticipants();
}
