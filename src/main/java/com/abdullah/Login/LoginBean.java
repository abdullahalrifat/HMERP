package com.abdullah.Login;

public class LoginBean
{
		private int id;
		private String fullname;
		private String username;
		private String password;

	public LoginBean()
	{

	}
	public LoginBean(int id, String fullname, String username, String password) {
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword()
		{
				return this.password;
		}

		public String getUsername()
		{
				return this.username;
		}

		public void setUsername(String username)
		{
				this.username = username;
		}

		public void setPassword(String password)
		{
				this.password = password;
		}
}
