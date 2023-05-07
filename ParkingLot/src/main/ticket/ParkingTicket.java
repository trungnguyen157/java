package main.ticket;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

import main.enums.ParkingTicketStatus;

public class ParkingTicket {
	private String ticketNumber;
	private ParkingTicketStatus status;
	private LocalDateTime issuedAt;
	private LocalDateTime expiredAt;
	
	public ParkingTicket(String ticketNumber) {
		this.ticketNumber = ticketNumber;
		this.status = ParkingTicketStatus.ACTIVE;
		this.issuedAt = LocalDateTime.now();
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public ParkingTicketStatus getStatus() {
		return status;
	}

	public void setStatus(ParkingTicketStatus status) {
		this.status = status;
	}

	public LocalDateTime getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(LocalDateTime issuedAt) {
		this.issuedAt = issuedAt;
	}
	
	public LocalDateTime getExpiredAt() {
		return expiredAt;
	}
	
	public void setExpiredAt(LocalDateTime expiredAt) {
		this.expiredAt=expiredAt;
	}
	
	
}
