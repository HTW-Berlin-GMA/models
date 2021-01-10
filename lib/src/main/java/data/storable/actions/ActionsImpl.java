/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.user.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class ActionsImpl implements Actions {
    private String address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activities getActivities() {
        return activities;
    }

    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setDuration(Period duration) {
        this.duration = duration;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean setActionname(String name) {
        this.name = name;
        return true;
    }

    @Override
    public boolean setActivity(String activity) {
        return false;
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
    public boolean setAddress(String address) {
        return false;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public boolean setHouseNumber(String houseNumber) {
        return false;
    }

    @Override
    public String getHouseNumber() {
        return null;
    }

    @Override
    public boolean setPostCode(String postCode) {
        return false;
    }

    @Override
    public String getPostCode() {
        return null;
    }

    @Override
    public boolean setCity(String city) {
        return false;
    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public boolean setCountry(String country) {
        return false;
    }

    @Override
    public String getCountry() {
        return this.country;
    }
}
