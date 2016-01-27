package com.userAction.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.userAction.Bo.util.CountryAndState;

@Repository("utilDao")
public class UtilDao extends AbstractDao {

    @Autowired
    private SessionFactory sf;

    public CountryAndState getStatesFromCountry(String country) {
        CountryAndState stats = (CountryAndState) this
                .getResultsFromQuerrywithEquals
                        (null, CountryAndState.class, (Map<String, String>) new HashMap<>().put("countryName", country)).get(0);
        return stats;
    }

    public List<CountryAndState> getCountryAndStats() {

        List<CountryAndState> stats =
                (List<CountryAndState>) this.getResultsFromQuerrywithEquals(null, CountryAndState.class, null);
        return stats;


    }

}
