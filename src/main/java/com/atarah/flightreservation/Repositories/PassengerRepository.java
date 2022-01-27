package com.atarah.flightreservation.Repositories;

import com.atarah.flightreservation.Entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}