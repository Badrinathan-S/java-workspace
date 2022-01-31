package oops;

public class Google {

	private String username, fullname, password;
	private Long conatct;
	
	@Override
	public String toString() {
		return "Google [username=" + username + ", fullname=" + fullname + ", password=" + password + ", conatct="
				+ conatct + "]";
	}

	/**
	 * @param username
	 * @param fullname
	 * @param password
	 * @param conatct
	 */
	public Google(String username, String fullname, String password, Long conatct) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.conatct = conatct;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getConatct() {
		return conatct;
	}

	public void setConatct(Long conatct) {
		this.conatct = conatct;
	}
	
}
