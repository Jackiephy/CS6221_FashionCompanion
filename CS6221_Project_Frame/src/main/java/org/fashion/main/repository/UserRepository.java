package org.fashion.main.repository;

import java.util.List;
import java.util.Map;

import org.fashion.main.domain.User;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, String> {

}
