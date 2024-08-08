class EnumExample
{
	public enum WeekDays {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Sturday};
	public static void main(String[] args)
	{
		for (WeekDays day : WeekDays.values())
		{
			System.out.println(day);
 		}
	}
}