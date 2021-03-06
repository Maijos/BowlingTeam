
// Exericise from pages 386 - 391

public class BowlingTeam
{
	// instance varibles for this class
	private String teamName;
	private String[] members = new String[4];

	// setter / mutator method for the teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}

	// getter / accessor method for the teamName
	public String getTeamName()
	{
		return teamName;
	}

	// setter / mutator for the member array
	public void setMember(int number, String name)
	{
		members[number] = name;
	}

	// getter / accessor for the members array
	public String getMember(int number)
	{
		return members[number];
	}

}