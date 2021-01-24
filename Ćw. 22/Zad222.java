public class Zad222{
    public static void main(String[] args) {
        Person a = new Person("Jurek", 1245);
        Person b = new Person("Agata", 2001);
        Person c = new Person("Marcin", 1995);
        Person d = new Person("Zosia", 1222);

        Person[] arr = {a,b,c,d};

        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(Person.getOlder(a,b));
        System.out.println(Person.getOldest(arr));
    }
}

class Person{
    String name;
    int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.birthYear;
    }
    
    public static Person getOlder(Person a, Person b){
        if (a.birthYear >= b.birthYear)
            return a;
        else
            return b;
    }

    public static Person getOldest(Person[] arr){
        int temp = Integer.MAX_VALUE;
        Person oldest = null;
        for (Person person : arr) {
            if (person.birthYear < temp)
                oldest = person;
        }
        return oldest;
    }
}
