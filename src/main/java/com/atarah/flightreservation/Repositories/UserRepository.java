package com.atarah.flightreservation.Repositories;

import com.atarah.flightreservation.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}