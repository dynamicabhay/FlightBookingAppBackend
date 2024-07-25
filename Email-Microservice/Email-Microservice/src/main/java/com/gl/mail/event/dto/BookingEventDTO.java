package com.gl.mail.event.dto;

import lombok.Data;

@Data
public class BookingEventDTO {

	private Long bookingId;
	private String bookingDate;
	private FlightEventDTO flight;
	private PassengerEventDTO passenger;
}
