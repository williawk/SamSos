package main;

public class Player {
	private String name;
	private int age;
	private String uname;
	
	public Player(String name, int age, String uname){
		setName(name);
		setAge(age);
		setUname(uname);
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return this.age;
	}
	public void setUname(String uname){
		this.uname=uname;
	}

	public String getUname(){
		return this.uname;
	}
}
