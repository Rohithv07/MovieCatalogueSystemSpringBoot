package com.catalogue.moviecatalogueauthenticator.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.moviecatalogueauthenticator.entity.State;
import org.springframework.data.jpa.repository.Query;

/**
 * @author priya prasad
 */
public interface StateRepository extends JpaRepository<State, Long> {

	public List<State> findByCountry_CountryId(Long countryId);

}
