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

public class ActionsStorage implements Storage {
    private BigDecimal size;
    private List<Storable> listActions;
    private Map<Storable, List<Storable>> mapActions;

    public ActionsStorage(BigDecimal size) {
        this.size = size;
        listActions = new LinkedList<>();
        mapActions = new LinkedHashMap<>();
    }

    //TODO: Observer für Kapazitaetenpruefung bei Aktualisierung von List und Map

    @Override
    public List<Storable> getList() {
        return listActions;
    }

    @Override
    public Map<Storable, List<Storable>> getMap() {
        return mapActions;
    }

    @Override
    public BigDecimal getSize() {
        return size;
    }
}
