/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.Storable;
import data.storable.user.User;
import data.storage.Storage;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class ActionsNeighbourhoodImpl implements ActionsNeighbourhood {
    private String street;
    private String houseNumber;
    private String postCode;
    private String city;
    private String country;
    private String name;
    private Activities activities;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private Period duration;
    private User owner;
    private UUID id;
    private Boolean isCompleted;
    private User helper;

    public ActionsNeighbourhoodImpl(String name, User owner, UUID id) {
        this.name = name;
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, String activities, LocalDate dateBegin, User owner, UUID id) {
        this.name = name;
        this.activities = Activities.valueOf(activities);
        this.dateBegin = dateBegin;
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, String activities, LocalDate dateBegin, LocalDate dateEnd, User owner, UUID id) {
        this.name = name;
        this.activities = Activities.valueOf(activities);
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.duration = Period.between(dateBegin, dateEnd);
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, String activities, LocalDate dateBegin, Period duration, User owner, UUID id) {
        this.name = name;
        this.activities = Activities.valueOf(activities);
        this.dateBegin = dateBegin;
        this.duration = duration;
        this.dateEnd = dateBegin.plus(duration);
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, String activities, LocalDate dateBegin, LocalDate dateEnd, Period duration, User owner, UUID id, Boolean isCompleted, User helper) {
        this.name = name;
        this.activities = Activities.valueOf(activities);
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.duration = duration;
        this.owner = owner;
        this.id = id;
        this.isCompleted = isCompleted;
        this.helper = helper;
    }

    @Override
    public boolean setActionname(String name) {
        this.name = name;
        return true;
    }

    @Override
    public boolean setActivity(String activity) {
        this.activities = Activities.valueOf(activity);
        return true;
    }

    @Override
    public boolean updateBeginDate(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
        return true;
    }

    @Override
    public boolean updateEndDate(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
        return true;
    }

    @Override
    public boolean updateDuration(Period duration) {
        this.duration = duration;
        return true;
    }

    @Override
    public String getActionname() {
        return this.name;
    }

    @Override
    public Activities getActivity() {
        return this.activities;
    }

    @Override
    public User getOwner() {
        return this.owner;
    }

    @Override
    public LocalDate getBeginDate() {
        return this.dateBegin;
    }

    @Override
    public LocalDate getEndDate() {
        return this.dateEnd;
    }

    @Override
    public Period getDuration() {
        return this.duration;
    }

    @Override
    public UUID getID() {
        return this.id;
    }

    @Override
    public boolean setCompleted(Boolean statusComplete) {
        this.isCompleted = statusComplete;
        return true;
    }

    @Override
    public boolean setHelper(User helper) {
        this.helper = helper;
        return true;
    }

    @Override
    public boolean setHelper(Storage user_storage, UUID userID) {
        for (Storable k : user_storage.getList()) {
            if (k.getID().equals(userID)) {
                this.helper = (User) k;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isCompleted() {
        return this.isCompleted;
    }

    @Override
    public User getHelper() {
        return this.helper;
    }

    @Override
    public UUID getHelperID() {
        return this.helper.getID();
    }

    @Override
    public boolean setStreet(String street) {
        this.street = street;
        return true;
    }

    @Override
    public String getStreet() {
        return this.street;
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
        return this.city;
    }

    @Override
    public boolean setCountry(String country) {
        this.country = country;
        return true;
    }

    @Override
    public String getCountry() {
        return this.country;
    }
}
