package com.atarah.flightreservation.Repositories;

import com.atarah.flightreservation.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}