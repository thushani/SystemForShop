package com.tanda.shop.repository;

import com.tanda.shop.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Thushani on 10/16/2020.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
