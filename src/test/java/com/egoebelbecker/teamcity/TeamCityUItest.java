public class TeamCityUItest {

    private TeamCity teamCity = new TeamCity();

    @Test
    public void getStatus() {
        assertTrue(teamCity.getStatus());
    }
}
