package com.egoebelbecker.teamcity;

import org.junit.Test;
import static org.junit.Assert.*;

public class TeamCityTest {

    private TeamCity teamCity = new TeamCity();

    @Test
    public void getStatus() {
        assertTrue(teamCity.getStatus());
    }
}

public class TeamCityUItest {

    private TeamCity teamCity = new TeamCity();

    @Test
    public void getStatus() {
        assertTrue(teamCity.getStatus());
    }
}
