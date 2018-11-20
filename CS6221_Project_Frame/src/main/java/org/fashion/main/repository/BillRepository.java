package org.fashion.main.repository;

import java.util.List;
import java.util.Map;

import org.fashion.main.domain.Bill;
import org.springframework.data.jpa.repository.*;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
