package com.catalogue.moviecatalogueauthenticator.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogue.moviecatalogueauthenticator.entity.State;

/**
 * @author priya prasad
 */
public interface StateRepository extends JpaRepository<State, Long> {

//    @Query("SELECT DISTINCT st FROM State st join Country cntry where st.countryId=cntry.countryId and st.COUNTRY_ID=:countryId")
	//public List<State> findByountryId(Long countryId);

	//public List<State> findByCountryName(String countryName);
}
