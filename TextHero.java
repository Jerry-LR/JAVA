package come.jerry.fengzhuang;

public class TextHero {
	public static void main(String[] args) {
		Hero hero=new Hero();
		Pet pet=new Pet();
		Cat cat=new Cat();
		pet.setName("Ð¡¼¦");
		hero.setHero("Ð¡Ã÷",pet);
		hero.run();
		
		cat.follow();
		
	}

}
