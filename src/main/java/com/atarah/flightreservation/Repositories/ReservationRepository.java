package com.atarah.flightreservation.Repositories;

import com.atarah.flightreservation.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}