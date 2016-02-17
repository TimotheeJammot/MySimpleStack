package dcll.tjam;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetContent() throws Exception {
        String str = "OK";
        Item it = new Item(str);
        assertTrue(it.getContent().equals(str));
    }
}