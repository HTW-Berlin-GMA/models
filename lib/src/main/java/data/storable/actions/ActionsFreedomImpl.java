/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package data.storable.actions;

import data.storable.Storable;
import data.storable.user.User;
import logic.exceptions.NoParticipantsCapacityException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ActionsFreedomImpl implements ActionsFreedom {
    private Integer numberOfParticipants;
    private Integer maximalNumberOfParticipants;
    private List<Storable> listParticipants;
    private Map<Storable, List<Storable>> mapParticipants;
    private String name;
    private Activities activities;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private Period duration;
    private User owner;
    private UUID id;

    public ActionsFreedomImpl(String name, Activities activities, LocalDate dateBegin, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.owner = owner;
        this.id = id;
    }

    public ActionsFreedomImpl(String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.duration = Period.between(dateBegin, dateEnd);
        this.owner = owner;
        this.id = id;
    }

    public ActionsFreedomImpl(String name, Activities activities, LocalDate dateBegin, Period duration, User owner, UUID id) {
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.duration = duration;
        this.dateEnd = dateBegin.plus(duration);
        this.owner = owner;
        this.id = id;
    }

    public ActionsFreedomImpl(Integer numberOfParticipants, Integer maximalNumberOfParticipants, List<Storable> listParticipants, Map<Storable, List<Storable>> mapParticipants, String name, Activities activities, LocalDate dateBegin, LocalDate dateEnd, Period duration, User owner, UUID id) {
        this.numberOfParticipants = numberOfParticipants;
        this.maximalNumberOfParticipants = maximalNumberOfParticipants;
        this.listParticipants = listParticipants;
        this.mapParticipants = mapParticipants;
        this.name = name;
        this.activities = activities;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.duration = duration;
        this.owner = owner;
        this.id = id;
    }

    @Override
    public boolean setNumberOfParticipants(Integer numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
        return true;
    }

    @Override
    public Integer getNumberOfParticipants() {
        return this.numberOfParticipants;
    }

    @Override
    public boolean setMaximalNumberOfParticipants(Integer maximalNumberOfParticipants) {
        this.maximalNumberOfParticipants = maximalNumberOfParticipants;
        return true;
    }

    @Override
    public Integer getMaximalNumberOfParticipants() {
        return this.maximalNumberOfParticipants;
    }

    @Override
    public List<Storable> getListParticipants() {
        return this.listParticipants;
    }

    @Override
    public Map<Storable, List<Storable>> getMapParticipants() {
        return this.mapParticipants;
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

    private Integer giveParticipantsAmount() {
        //TODO: BusinessLogic Oberserver, wenn Liste aktualisiert wird
        Integer actuallyCapacity = listParticipants.size();
        numberOfParticipants = actuallyCapacity;
        return actuallyCapacity;
    }

    private boolean checkParticipantsCapacity() throws NoParticipantsCapacityException {
        this.giveParticipantsAmount();

        if (maximalNumberOfParticipants <= 0) {
            return false;
        } else if (maximalNumberOfParticipants > numberOfParticipants) {
            return true;
        } else {
            throw new NoParticipantsCapacityException();
        }
    }
}
