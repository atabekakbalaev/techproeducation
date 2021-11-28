package day37practice;

import java.util.ArrayList;
import java.util.List;

public class PersonsRunner {

	public static void main(String[] args) {
		/*Create a POJO class "Person" to access and use objects from 
		 * this runner class "PersonsRunner"
		 * 1)Type the names on the console with their frequencies
			2)Type all the names on the console without repetition
			3) Create a method to return the oldest person
			4) Sort all ages
			5) Create a method to generate a g-mail for each person using 
				the initial of name and the lastname and then type all emails 
				on the console in different lines
		 */
		Person person1 = new Person("Osman", "Yamata", 55);
        Person person2 = new Person("Ahmet", "Yurt", 4);
        Person person3 = new Person("Nihal", "Elmas", 23);
        Person person4 = new Person("Osman", "Yavan", 15);
        Person person5 = new Person("Selcuk", "Kar", 65);
        Person person6 = new Person("Nedime", "Ozgur", 24);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        
        System.out.println(persons);
        
	}

}
