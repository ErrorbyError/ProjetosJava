package com.TpHost.repository;

import com.TpHost.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repository extends JpaRepository<Users, Integer> {


}
