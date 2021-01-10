/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable;

public interface Location {
    boolean setStreet(String street);

    String getStreet();

    boolean setHouseNumber(String houseNumber);

    String getHouseNumber();

    boolean setPostCode(String postCode);

    String getPostCode();

    boolean setCity(String city);

    String getCity();

    boolean setCountry(String country);

    String getCountry();
}
