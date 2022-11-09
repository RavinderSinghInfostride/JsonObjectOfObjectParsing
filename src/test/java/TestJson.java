import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestJson {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("src/test/java/Data.json"));
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(jsonData, Person.class);

        System.out.println(person.getEmail());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAddress().getCountry());
        System.out.println(person.getAddress().getState());
        System.out.println(person.getAddress().getInformation().getCity());
        System.out.println(person.getAddress().getInformation().getPin());
    }
}
