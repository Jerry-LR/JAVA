package come.jerry.fengzhuang;

public class Hero {
	private String name;
	private Pet pet;
	public Hero() {}
	public void setName(String name) {
		this.name=name;
	}
	public void setPet(Pet pet) {
		this.pet=pet;
		}
	public String getName()
	{
		return name;
	}
	public Pet getPet()
	{
		return pet;
	}
	public void setHero(String name,Pet pet)
	{
		this.name=name;
		this.pet=pet;
		
	}
	public void run()
	{
		System.out.print(name+"Εά"+",");
	}
}
