# api-communicator

---------------------Created By Marco Tahat----------------------------------------------------
This is Simple Java application shows how to communicate and consume rest service.
this application has been develop for interview perp.


---------------------Main Classes---------------------------------------------------------------
RestApplication.java: Main Method, run this project as Java Application 

@param RestClient -- the client to consume the API
	 * @param input -- User input from console, this is case 
	 * Accepted Inputs: <Case Sensitive>
	 * 		1- state code: two letters Upper Case for example; NY
	 * 		2- state name: first letter should be upper case, for example: New York
	 *      3- all : shows you total number of states hosted by the service.
	 * @return results taken from the response.

RestApplicationTest.java : Main Integration Test

Parameterized test, this covers all happy scenarios for the 55
	* states that the service support, plus the 'all' option.
	* also this class cover the integration part between the Application, Domain and Util classes.
	*/
-------------------------------------------------------------------------------------------------