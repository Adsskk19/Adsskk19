package com.test.cg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ContactMgeTest {
	@Test
	public void shouldCreateContact{
		ContactManager cm = new ContactManager();
		cm.addContact("Ram","Prasad","6789123094");
		assertFalse(cm.getAllContacts().isEmpty());
		//assertEquals(1, cm.getAllContacts().size());
	}

}
