package com.ramusthastudio.authserver.repo;

import com.ramusthastudio.authserver.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String> {
  User findByUsername(String aUsername);
  User findByEmail(String aEmail);
}
