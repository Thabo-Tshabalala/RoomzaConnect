package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.model.*;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;
class UserFactoryTest {

    @Test
    void buildUser() {
        Room room = RoomFactory.buildRoom("212",3,new Residence.ResidenceBuilder().setResidenceName("New Market Junctions").setGenderRestriction(GenderRestriction.ANY).build());
         User user = UserFactory.buildUser("Thabo", "Tshabalala","0788578803","roomzaConnect@gmail.com","roomza", LocalDate.of(2003, Month.SEPTEMBER,3),Gender.MALE,room);
         assertNotNull(user);
        System.out.println(user);
    }

    @Test
    //Modify here to test all the remaining scenarios
    void buildUserWithEmptyFirstName() {
        Room room = RoomFactory.buildRoom("212",3,new Residence.ResidenceBuilder().setResidenceName("New Market Junctions").setGenderRestriction(GenderRestriction.ANY).build());
     User user = UserFactory.buildUser("", "Tshabalala","0788578803","roomzaConnect@gmail.com","roomza",LocalDate.of(2003, Month.SEPTEMBER,3),Gender.MALE,room);
        assertNull(user);
    }

}