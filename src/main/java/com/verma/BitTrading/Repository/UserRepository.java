package com.verma.BitTrading.Repository;

import com.verma.BitTrading.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
