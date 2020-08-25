/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minewine.taxishareity.persistance.dbo;

import java.time.LocalDateTime;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static java.time.LocalDateTime.now;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

/**
 *
 * @author xerous
 */
public class BookRide {

    private final Long seq;
    private String pickupLoc;
    private String dropLoc;
    private Integer peopleNum;
    private final LocalDateTime createAt;

    // specify the minimum number of people to book ride
    public static final Integer MIN_NUMBER_OF_PEOPLE = 2;

    public BookRide(Long seq, String pickupLoc, String dropLoc, Integer peopleNum, LocalDateTime createAt) {
        checkNotNull(seq, "seq must be provided.");
        checkNotNull(pickupLoc, "pickupLoc must be provided.");
        checkNotNull(dropLoc, "dropLoc must be provided.");
        checkArgument(peopleNum > MIN_NUMBER_OF_PEOPLE,
                String.format("peopleNum must be over %d.", MIN_NUMBER_OF_PEOPLE));

        this.seq = seq;
        this.pickupLoc = pickupLoc;
        this.dropLoc = dropLoc;
        this.peopleNum = peopleNum;
        this.createAt = defaultIfNull(createAt, now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRide bookRide = (BookRide) o;
        return seq.equals(bookRide.seq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seq);
    }

    @Override
    public String toString() {
        return "BookRide{" +
                "seq=" + seq +
                ", pickupLoc='" + pickupLoc + '\'' +
                ", dropLoc='" + dropLoc + '\'' +
                ", peopleNum=" + peopleNum +
                ", createAt=" + createAt +
                '}';
    }

    public Long getSeq() {
        return seq;
    }

    public String getPickupLoc() {
        return pickupLoc;
    }

    public String getDropLoc() {
        return dropLoc;
    }

    public Integer getpeopleNum() {
        return peopleNum;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public static class Builder {
        private Long seq;
        private String pickupLoc;
        private String dropLoc;
        private Integer peopleNum;
        private LocalDateTime createAt;

        public Builder() {}

        public Builder(BookRide bookRide) {
            this.seq = bookRide.seq;
            this.pickupLoc = bookRide.pickupLoc;
            this.dropLoc = bookRide.dropLoc;
            this.peopleNum = bookRide.peopleNum;
            this.createAt = bookRide.createAt;
        }

        public Builder seq(Long seq) {
            this.seq = seq;
            return this;
        }

        public Builder pickupLoc(String pickupLoc) {
            this.pickupLoc = pickupLoc;
            return this;
        }

        public Builder dropLog(String dropLoc) {
            this.dropLoc = dropLoc;
            return this;
        }

        public Builder peopleNum(Integer peopleNum) {
            this.peopleNum = peopleNum;
            return this;
        }

        public Builder createAt(LocalDateTime createAt) {
            this.createAt = createAt;
            return this;
        }

        public BookRide build(){
            return new BookRide(seq, pickupLoc, dropLoc, peopleNum, createAt);
        }
    }
}