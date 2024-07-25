package com.catalogue.repositories;

import com.catalogue.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author priya prasad
 */
public interface StateRepository extends JpaRepository<State,Long> {

    @Query("SELECT DISTINCT st FROM STATE st join COUNTRY cntry where st.COUNTRY_ID=cntry.COUNTRY_ID and st.COUNTRY_ID=:countryId")
    public List<State> getStatesByCountryId(@Param("countryId") Long countryId);
}
