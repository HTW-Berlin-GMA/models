/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storage;

import data.storable.Storable;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The type User data.storage.
 */
public class UserStorage implements Storage {
    private BigDecimal size;
    private List<Storable> listUsers;
    private Map<Storable, List<Storable>> mapUsers;

    /**
     * Instantiates a new User data.storage.
     *
     * @param size the size
     */
    public UserStorage(BigDecimal size) {
        this.size = size;
        listUsers = new LinkedList<>();
        mapUsers = new LinkedHashMap<>();
    }


    public UserStorage(UserStorage userStorage, BigDecimal size) {
        this.size = size;
        this.listUsers = userStorage.getList();
        this.mapUsers = userStorage.getMap();
    }


    //TODO: Observer für Kapazitaetenpruefung bei Aktualisierung von List und Map

    @Override
    public List<Storable> getList() {
        return listUsers;
    }

    @Override
    public Map<Storable, List<Storable>> getMap() {
        return mapUsers;
    }

    @Override
    public BigDecimal getSize() {
        return size;
    }
}
