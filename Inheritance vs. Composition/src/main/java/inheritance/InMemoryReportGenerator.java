package inheritance;

import PersonClass.Person;

import java.util.List;

public class InMemoryReportGenerator extends PersonReportGenerator {

    @Override
    public List<Person> readPeople() {
        return List.of(
                new Person("Georgescu", "Calin", 30),
                new Person("Enescu", "Ioana", 51),
                new Person("Popescu", "Ion", 31),
                new Person("Tudorescu", "Paul", 45)
        );
    }

}