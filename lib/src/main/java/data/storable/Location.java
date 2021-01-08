/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable;

public interface Location {
    boolean setAddress(String address);

    String getAddress();

    boolean setHouseNumber(String houseNumber);

    String getHouseNumber();

    boolean setPostCode(String postCode);

    String getPostCode();

    boolean setCity(String city);

    String getCity();

    boolean setCountry(String country);

    String getCountry();
}
