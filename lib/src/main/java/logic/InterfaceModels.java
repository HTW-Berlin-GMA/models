package logic;

import data.storable.Storable;
import data.storable.actions.Actions;
import data.storable.actions.Activities;
import data.storable.user.User;
import data.storage.Storage;
import logic.exceptions.StorageIsEmptyException;
import logic.exceptions.StorageIsNotAvailable;
import logic.exceptions.WrongStorageTypeException;
import logic.mode.StorageType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */


public interface InterfaceModels {
    //
    // STORAGE
    //

    public boolean createStorage(String name, StorageType storageType, BigDecimal capacityTotal) throws WrongStorageTypeException;

    public Storage readStorage(String name) throws StorageIsEmptyException, StorageIsNotAvailable;

    public boolean updateStorage(String updateCommand);

    public boolean deleteStorage(String name);

    //
    // USER
    //

    public boolean createUser(String storageName, BigDecimal id, String username, String firstname, String surname, Date birthdate, String eMailAddress, String address, String houseNumber, String postCode, String city, String country, List<Activities> listInterests, List<Actions> listFavorites, List<Actions> listParticipatedActions, Map<String, List<User>> mapContacts);

    public User readUser(BigDecimal id);

    public User readUser(String storageName, Integer index);

    public boolean updateUser(String storageName, String updateCommand);

    public boolean updateUser(BigDecimal id, String updateCommand);

    public boolean updateUser(String storageName, Integer indexy, String updateCommand);

    public boolean deleteUser(BigDecimal id);

    public boolean deleteUser(Integer index);

    //
    // ACTIONS
    //

    public boolean createActions(String storageName, String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, Period duration, User owner, BigDecimal id, Integer numberOfParticipants, Integer maximalNumberOfParticipants, List<Storable> listParticipants, Map<Storable, List<Storable>> mapParticipants);

    public Actions readActions(BigDecimal id);

    public Actions readActions(String storageName, Integer index);

    public boolean updateActions(BigDecimal id, String updateCommand);

    public boolean updateActions(String storageName, String updateCommand);

    public boolean updateActions(String storageName, Integer index, String updateCommand);

    public boolean deleteActions(BigDecimal id);

    public boolean deleteActions(String storageName, Integer index);
}