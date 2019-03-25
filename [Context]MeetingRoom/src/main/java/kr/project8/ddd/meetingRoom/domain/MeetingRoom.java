package kr.project8.ddd.meetingRoom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class MeetingRoom {

    @Id @GeneratedValue
    private Long id;

    public Reservation reserve(Booker booker, LocalDateTime startTime, LocalDateTime endTime) {
        return new Reservation(this, booker, startTime, endTime);
    }
}
