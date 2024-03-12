package com.dividend.persist;

import com.dividend.persist.entity.DividendEntiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DividendRepository extends JpaRepository<DividendEntiry, Long> {
}
