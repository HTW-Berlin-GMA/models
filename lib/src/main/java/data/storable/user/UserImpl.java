/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.user;

import data.storable.actions.Actions;
import data.storable.actions.Activities;

import java.util.*;

public class UserImpl implements User {
    private UUID id;
    private String username;
    private String prename;
    private String surname;
    private Date birthdate;
    private String eMailAddress;
    private String address;
    private String houseNumber;
    private String postCode;
    private String city;
    private String country;
    private Date registryDate;
    private List<Activities> listInterests;
    private List<Actions> listFavorites;
    private List<Actions> listParticipatedActions;
    private Map<String, List<User>> mapContacts;

    public UserImpl(UUID id, String username) {
        this.id = id;
        this.username = username;
        this.registryDate = new java.sql.Date((new Date()).getTime());
        this.listParticipatedActions = new ArrayList<>();
        this.listInterests = new ArrayList<>();
        this.listFavorites = new ArrayList<>();
        this.mapContacts = new HashMap<>();
    }

    public UserImpl(UUID id, String username, Date birthdate, String eMailAddress) {
        this.id = id;
        this.username = username;
        this.birthdate = birthdate;
        this.eMailAddress = eMailAddress;
        this.registryDate = new java.sql.Date((new Date()).getTime());
        this.listParticipatedActions = new ArrayList<>();
        this.listInterests = new ArrayList<>();
        this.listFavorites = new ArrayList<>();
        this.mapContacts = new HashMap<>();
    }

    public UserImpl(UUID id, String username, String prename, String surname, Date birthdate, String eMailAddress, String address, String houseNumber, String postCode, String city, String country, List<Activities> listInterests, List<Actions> listFavorites, List<Actions> listParticipatedActions, Map<String, List<User>> mapContacts) {
        this.id = id;
        this.username = username;
        this.prename = prename;
        this.surname = surname;
        this.birthdate = birthdate;
        this.eMailAddress = eMailAddress;
        this.address = address;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
        this.listInterests = listInterests;
        this.listFavorites = listFavorites;
        this.listParticipatedActions = listParticipatedActions;
        this.mapContacts = mapContacts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistryDate() {
        return registryDate;
    }

    public List<Activities> getListInterests() {
        return listInterests;
    }

    public List<Actions> getListFavorites() {
        return listFavorites;
    }

    public List<Actions> getListParticipatedActions() {
        return listParticipatedActions;
    }

    public Map<String, List<User>> getMapContacts() {
        return mapContacts;
    }

    @Override
    public boolean setUsername(String username) {
        this.username = username;
        return true;
    }

    @Override
    public boolean setPrename(String prename) {
        this.prename = prename;
        return true;
    }

    @Override
    public boolean setSurname(String surname) {
        this.surname = surname;
        return true;
    }

    @Override
    public boolean setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
        return true;
    }

    @Override
    public boolean setMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
        return true;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPrename() {
        return this.prename;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public Date getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String getMailAddress() {
        return this.eMailAddress;
    }

    @Override
    public List<Activities> listInterests() {
        return this.listInterests;
    }

    @Override
    public List<Actions> listFavorites() {
        return this.listFavorites;
    }

    @Override
    public List<Actions> listParticipatedActions() {
        return this.listParticipatedActions;
    }

    @Override
    public Map<String, List<User>> mapContacts() {
        return this.mapContacts;
    }

    @Override
    public UUID getID() {
        return id;
    }

    @Override
    public boolean setStreet(String street) {
        this.address = street;
        return true;
    }

    @Override
    public String getStreet() {
        return this.address;
    }

    @Override
    public boolean setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return true;
    }

    @Override
    public String getHouseNumber() {
        return this.houseNumber;
    }

    @Override
    public boolean setPostCode(String postCode) {
        this.postCode = postCode;
        return true;
    }

    @Override
    public String getPostCode() {
        return this.postCode;
    }

    @Override
    public boolean setCity(String city) {
        this.city = city;
        return true;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public boolean setCountry(String country) {
        this.country = country;
        return true;
    }

    @Override
    public String getCountry() {
        return country;
    }
}
