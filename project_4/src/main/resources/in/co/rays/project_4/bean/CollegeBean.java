package in.co.rays.project_4.bean;

/**
 * College JavaBean encapsulates College attributes
 * @author ajay
 *
 */
public class CollegeBean extends BaseBean{

	/**
	 * Name of college
	 */
	private String name;
	
	/**
	 * address of college
	 */
	private String address;
	
	/**
	 * state of college
	 */
	private String state;
	
	/**
	 * city of college
	 */
	private String city;
	
	/**
	 * phoneNO of college
	 */
	private String phoneNo;
	
	/**
     * accessor
     */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getKey() {
		return id+"";
	}
	public String getValue() {
		return name;
	}
	
	
}
