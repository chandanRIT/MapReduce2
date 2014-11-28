package other;

/*
 * This class stores the constants used through out the project. 
 */
public class Utils {
	//public final static int DEF_EM_PORT = 2589; //Default port number of Event Manager
	//public final static String DEF_HNAME = "localhost"; // Default host Name
	
	public static final boolean DEBUG = true; // Flag to turn on/off debug messages (mostly logs) on the server
	
	//Command constants used in PubSubAgent and WorkerThread
	public static final String 
			MR_C = "MR_C", 
			MR_C_OKAY = "MR_C_OKAY",
			MR_W = "MR_W",
			MR_W_OKAY = "MR_W_OKAY";
			
	
	/*
	 * This method prints messages on to the console if DEBUG flag is on.
	 */
	public static void debug(String str){
		if(DEBUG)
			System.out.println(str);
	}
}
