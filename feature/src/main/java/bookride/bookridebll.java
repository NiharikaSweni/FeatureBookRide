package bookride;

public class bookridebll {
	public static String ValidateRide(bookride ride)
	{
		if(ride.source.equals(""))
			return "invalid";
		//if(ride.source.equals("") && ride.dest.equals("") )
			//return "invalid data";
		if(ride.dest.equals(""))
			return "invalid";
		
		if(ride.source.equals("") && ride.dest.equals("") && ride.date.equals(""))
			return "invalid";
		else 
		return "successful";
	}


}
