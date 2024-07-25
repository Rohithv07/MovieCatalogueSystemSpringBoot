/**
 * 
 */
package com.catalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.entity.Country;

/**
 * @author rohithvazhathody
 *
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}
