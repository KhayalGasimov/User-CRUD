package com.company.UserCrud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostitory extends JpaRepository<User,Long> {

}
