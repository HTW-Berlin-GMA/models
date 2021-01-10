/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.user;

import data.storable.*;
import data.storable.actions.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface User extends Storable, Location {
    boolean setUsername(String username);

    boolean setFirstname(String firstname);

    boolean setSurname(String surname);

    boolean setBirthdate(Date birthdate);

    boolean setMailAddress(String eMailAddress);

    String getUsername();

    String getFirstname();

    String getSurname();

    Date getBirthdate();

    String getMailAddress();

    List<Activities> listInterests();

    List<Actions> listFavorites();

    List<Actions> listParticipatedActions();

    Map<String, List<User>> mapContacts();
}
