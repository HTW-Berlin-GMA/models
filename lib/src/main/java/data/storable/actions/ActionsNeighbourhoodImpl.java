/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class ActionsNeighbourhoodImpl implements ActionsNeighbourhood {
    private String name;
    private Activities activities;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private Period duration;
    private User owner;
    private UUID id;
    private Boolean isCompleted;
    private User helper;

    public ActionsNeighbourhoodImpl(String name, Activities activities, LocalDate dateBegin, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.duration = Period.between(dateBegin, dateEnd);
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, Activities activities, LocalDate dateBegin, Period duration, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.duration = duration;
        this.dateEnd = dateBegin.plus(duration);
        this.owner = owner;
        this.id = id;
    }

    public ActionsNeighbourhoodImpl(String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, Period duration, User owner, UUID id, Boolean isCompleted, User helper) {
        this.name = name;
        this.activities = activities;
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
    public boolean setActivity(Activities activity) {
        this.activities = activity;
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
    public boolean isCompleted() {
        return this.isCompleted;
    }

    @Override
    public User getHelper() {
        return this.helper;
    }
}
