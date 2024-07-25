/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.moviecatalogueauthenticator.entity.User;

/**
 * @author rohithvazhathody
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
