package day36animalproject;

public class Cat extends Animal {
	
	public Cat(String name, int age, String habitat, boolean isDomestic) {
		super(name, age, habitat, isDomestic);
	}

	@Override
	String animalName() {
		return this.name;
	}

	@Override
	int animalAge() {
		return this.age;
	}

	@Override
	String habitat() {
		return this.habitat;
	}

	@Override
	boolean isDomestic() {
		return this.isDomestic;
	}

}
