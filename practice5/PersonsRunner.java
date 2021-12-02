package practice5;
import java.util.*;
public class PersonsRunner {
    public static void main(String[] args) {
        
        //The names, lastnames and ages of 6 persons
        Person person1 = new Person("Osman", "Yamata", 55);
        Person person2 = new Person("Ahmet", "Yurt", 4);
        Person person3 = new Person("Nihal", "Elmas", 23);
        Person person4 = new Person("Osman", "Yavan", 15);
        Person person5 = new Person("Selcuk", "Kar", 65);
        Person person6 = new Person("Nedime", "Ozgur", 24);
        System.out.println(person1);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        System.out.println(persons);
        System.out.println(persons.get(1).getAge());
        
                
        //Create a POJO class "Person" to access and use objects from this runner class "PersonsRunner"
        //1) Type the names on the console with their frequencies
        System.out.println("==========Task1===========");
        Map<String, Integer> namesWithFrequencies = new HashMap<>();//empty
        for(Person p:persons) {
            if(!namesWithFrequencies.containsKey(p.getName())) {
                namesWithFrequencies.put(p.getName(), 1);
            }else {
                namesWithFrequencies.put(p.getName(),namesWithFrequencies.get(p.getName()) +1);
            }
        }
        System.out.println(namesWithFrequencies);
        
        
        //2) Type all the names on the console without repetition
        System.out.println("==========Task2===========");
        System.out.println(namesWithFrequencies.keySet());
        
        //3) Create a method to return the oldest person
        System.out.println("==========Task3===========");
        System.out.println(oldestPerson(persons));
        
        //4) Sort all ages
        System.out.println("==========Task4===========");
        //Way 1)
        List<Integer> agesSorted = new ArrayList<>();
        for(Person p:persons) {
            agesSorted.add(p.getAge());
        }
        System.out.println(agesSorted);
        Collections.sort(agesSorted);
        System.out.println(agesSorted);
        
        //Way 2)
        int[] agesSorted2 = new int[persons.size()];
        for(int i=0; i<agesSorted2.length; i++) {
            agesSorted2[i]=persons.get(i).getAge();
        }
        Arrays.sort(agesSorted2);
        System.out.println(Arrays.toString(agesSorted2));
        
        //Way 3) if ages are unique, we can use TreeSet
        Set<Integer> agesSorted3 = new TreeSet<>();
        for(Person p:persons) {
            agesSorted3.add(p.getAge());
        }
        System.out.println(agesSorted3);
        
        //5) Create a method to generate a g-mail for each person using the initial of name
        //and the lastname and then type all emails on the console in different lines
        //Osman Yamata ==> OYamata@gmail.com
        System.out.println("==========Task5===========");
        System.out.println(allGmails(persons));
        for(Person p:persons) {
            System.out.println(p.getEmail());
        }
        
        //6) What is the name of the person who is 24 years old?
        System.out.println("==========Task6===========");
        for(Person p : persons) {
            if(p.getAge()==24) {
                System.out.println(p.getName());
            }
        }
        
        //7) What are the names-lastnames of the persons who are older than 20?
        System.out.println("==========Task7===========");
        for(Person p:persons) {
            if(p.getAge()>20) {
                System.out.println(p.getName()+" "+p.getLastname());
        }
        }
        
        //8) What is the age of the first person in the alphabetical order of lastnames?
        
        //9) Type the lastnames with their lengths
        //Yamata=6, Yurt=4, Elmas=5, Ozgur=5, Kar=3, Yavan=5
        
        //10) Type the names and lastnames with the total length of name and lastname
        //{Osman Yamata=11, Nedime Ozgur=11, Osman Yavan=10, Nihal Elmas=10, Selcuk Kar=9, Ahmet Yurt=9}
        
    }
    
    public static List<Person> allGmails(List<Person> persons) {
        for(Person p:persons) {
            p.setEmail(p.getName().charAt(0) + p.getLastname() + "@gmail.com");
        }
        
        return persons;
    }
    
    public static Person oldestPerson(List<Person> persons) {
        Person oldestPerson = new Person();
        int maxAge = persons.get(0).getAge();
        for(Person p:persons) {
            if(p.getAge()>maxAge) {
                maxAge = p.getAge();
                oldestPerson.setName(p.getName());
                oldestPerson.setLastname(p.getLastname());
                oldestPerson.setAge(maxAge);
            }
        }
        return oldestPerson;
    }
}
