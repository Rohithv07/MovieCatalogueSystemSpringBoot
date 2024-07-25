/**
 * 
 */
package com.catalogue.moviecatalogueauthenticator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.moviecatalogueauthenticator.entity.Country;

/**
 * @author rohithvazhathody
 *
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}