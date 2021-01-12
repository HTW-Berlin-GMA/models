/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storage;

import data.storable.Storable;

import java.math.BigDecimal;
import java.util.*;

/**
 * The type Storage.
 */
public class StorageImpl implements Storage {
    private BigDecimal size;
    private List<Storable> list;
    private Map<UUID, Storable> map;

    /**
     * Instantiates a new Storage.
     *
     * @param size the size
     */
    public StorageImpl(BigDecimal size) {
        this.size = size;
        list = new LinkedList<>();
        map = new LinkedHashMap<>();
    }


    /**
     * Instantiates a new Storage.
     *
     * @param storage the data.storage
     * @param size    the size
     */
    public StorageImpl(Storage storage, BigDecimal size) {
        this.size = size;
        this.list = storage.getList();
        this.map = storage.getMap();
    }


    //TODO: Observer für Kapazitaetenpruefung bei Aktualisierung von List und Map

    @Override
    public List<Storable> getList() {
        return list;
    }

    @Override
    public Map<UUID, Storable> getMap() {
        return map;
    }

    @Override
    public BigDecimal getSize() {
        return size;
    }
}
