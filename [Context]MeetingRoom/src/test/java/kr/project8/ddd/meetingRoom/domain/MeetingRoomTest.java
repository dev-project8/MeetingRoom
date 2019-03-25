package kr.project8.ddd.meetingRoom.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;


public class MeetingRoomTest {

    @Test
    public void reserveTest() {
        MeetingRoom meetingRoom = new MeetingRoom();
        Booker booker = new Booker();
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(1);

        Reservation reserve = meetingRoom.reserve(booker, startTime, endTime);

        assertThat(reserve.getBooker()).isEqualTo(booker);
        assertThat(reserve.getMeetingRoom()).isEqualTo(meetingRoom);
        assertThat(reserve.getStartTime()).isEqualTo(startTime);
        assertThat(reserve.getEndTime()).isEqualTo(endTime);
    }
}