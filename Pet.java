package come.jerry.fengzhuang;

public class Pet {
	private String name;
	public Pet(){}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void follow() {
		System.out.println(name+"¸ú×ÅÅÜ");
	}
}
