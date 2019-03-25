package kr.project8.ddd.meetingRoom.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Entity
public class Reservation {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="meetingRoomId")
    private MeetingRoom meetingRoom;
    @OneToOne
    @JoinColumn(name="bookerId")
    private Booker booker;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Reservation(MeetingRoom meetingRoom, Booker booker, LocalDateTime startTime, LocalDateTime endTime) {
        this.meetingRoom = meetingRoom;
        this.booker = booker;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
