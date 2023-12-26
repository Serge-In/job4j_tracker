package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestGetMethod() {
        PassportOffice office = new PassportOffice();
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        office.add(citizen);
        citizen = new Citizen("2f44a", "Petr Arsentev");
        assertFalse(office.add(citizen));
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }
}
