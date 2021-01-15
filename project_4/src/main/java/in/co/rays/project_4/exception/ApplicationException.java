package in.co.rays.project_4.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * @author vipin
 *
 */
public class ApplicationException extends Exception {
	
	/**
	 * @param msg
	 *      : Error message
	 */
	public ApplicationException(String msg){
		super(msg);
	}
	
}
