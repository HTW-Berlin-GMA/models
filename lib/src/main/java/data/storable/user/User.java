/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.user;

import data.storable.Location;
import data.storable.Storable;
import data.storable.actions.Actions;
import data.storable.actions.Activities;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface User extends Storable, Location {
    boolean setUsername(String username);

    boolean setPrename(String prename);

    boolean setSurname(String surname);

    boolean setBirthdate(Date birthdate);

    boolean setMailAddress(String eMailAddress);

    String getUsername();

    String getPrename();

    String getSurname();

    Date getBirthdate();

    String getMailAddress();

    List<Activities> listInterests();

    List<Actions> listFavorites();

    List<Actions> listParticipatedActions();

    Map<String, List<User>> mapContacts();
}
