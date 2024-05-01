/**
 * 
 */
package com.catalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.entity.User;

/**
 * @author rohithvazhathody
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
