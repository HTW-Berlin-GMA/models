/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storage;

import data.storable.Storable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * The interface Storage.
 */
public interface Storage {
    /**
     * Gets list.
     *
     * @return the list
     */
    List<Storable> getList();

    /**
     * Gets map.
     *
     * @return the map
     */
    Map<Storable, List<Storable>> getMap();

    /**
     * Gets size.
     *
     * @return the size
     */
    BigDecimal getSize();
}
