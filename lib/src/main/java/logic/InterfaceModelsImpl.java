package logic; /**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

import data.storable.Storable;
import data.storable.actions.Actions;
import data.storable.actions.Activities;
import data.storable.user.User;
import data.storable.user.UserImpl;
import data.storage.ActionsStorage;
import data.storage.Storage;
import logic.exceptions.StorageIsEmptyException;
import logic.exceptions.StorageIsNotAvailable;
import logic.exceptions.WrongStorageTypeException;
import logic.mode.StorageType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InterfaceModelsImpl implements InterfaceModels {
    private Map<String, Storage> mapStorage;
    private BigDecimal idActions;
    private BigDecimal idUser;

    public InterfaceModelsImpl() {
        mapStorage = new LinkedHashMap<>();
    }

    @Override
    public boolean createStorage(String name, StorageType storageType, BigDecimal capacityTotal) throws WrongStorageTypeException {
        Storage storage;

        if (storageType.equals(StorageType.ACTIONS)) {
            storage = new ActionsStorage(capacityTotal);
        } else if (storageType.equals(StorageType.USER)) {
            storage = new ActionsStorage(capacityTotal);
        } else {
            throw new WrongStorageTypeException();
        }

        mapStorage.put(name, storage);

        return true;
    }

    @Override
    public Storage readStorage(String name) throws StorageIsEmptyException, StorageIsNotAvailable {
        if ((mapStorage == null)
                || mapStorage.isEmpty()
                || (mapStorage.size() >= 0)
        ) {
            throw new StorageIsEmptyException();
        }

        if (!(mapStorage.containsKey(name))) {
            throw new StorageIsNotAvailable();
        }

        return mapStorage.get(name);
    }

    @Override
    public boolean updateStorage(String updateCommand) {
        String[] updateStrings = updateCommand.trim().split(" ");
        if (updateStrings[0].startsWith(":")) {
            switch (updateStrings[0].trim()) {
                
            }
        }
        return true;
    }

    @Override
    public boolean deleteStorage(String name) {
        return false;
    }

    @Override
    public boolean createUser(String storageName, BigDecimal id, String username, String firstname, String surname, Date birthdate, String eMailAddress, String address, String houseNumber, String postCode, String city, String country, List<Activities> listInterests, List<Actions> listFavorites, List<Actions> listParticipatedActions, Map<String, List<User>> mapContacts) {
        //User user = new UserImpl(id, username, firstname, surname, birthdate, eMailAddress, address, houseNumber, postCode, city, country, listInterests, listFavorites, listParticipatedActions, mapContacts);
        return true;
    }

    @Override
    public User readUser(BigDecimal id) {
        return null;
    }

    @Override
    public User readUser(String storageName, Integer index) {
        return null;
    }

    @Override
    public boolean updateUser(String storageName, String updateCommand) {
        return false;
    }

    @Override
    public boolean updateUser(BigDecimal id, String updateCommand) {
        return false;
    }

    @Override
    public boolean updateUser(String storageName, Integer indexy, String updateCommand) {
        return false;
    }

    @Override
    public boolean deleteUser(BigDecimal id) {
        return false;
    }

    @Override
    public boolean deleteUser(Integer index) {
        return false;
    }

    @Override
    public boolean createActions(String storageName, String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, Period duration, User owner, BigDecimal id, Integer numberOfParticipants, Integer maximalNumberOfParticipants, List<Storable> listParticipants, Map<Storable, List<Storable>> mapParticipants) {
        return false;
    }

    @Override
    public Actions readActions(BigDecimal id) {
        return null;
    }

    @Override
    public Actions readActions(String storageName, Integer index) {
        return null;
    }

    @Override
    public boolean updateActions(BigDecimal id, String updateCommand) {
        return false;
    }

    @Override
    public boolean updateActions(String storageName, String updateCommand) {
        return false;
    }

    @Override
    public boolean updateActions(String storageName, Integer index, String updateCommand) {
        return false;
    }

    @Override
    public boolean deleteActions(BigDecimal id) {
        return false;
    }

    @Override
    public boolean deleteActions(String storageName, Integer index) {
        return false;
    }
}