package dcll.tjam;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackImplTest {

    @Test
    public void testIsEmptyTrue() throws Exception {
        SimpleStack s = new StackImpl();
        assertTrue(s.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() throws Exception {
        SimpleStack s = new StackImpl();
        s.push(new Item("OK"));
        assertFalse(s.isEmpty());

    }

    @Test
    public void testGetSize() throws Exception {
        SimpleStack s = new StackImpl();
        assertTrue(s.getSize() == 0);
        s.push(new Item("OK"));
        assertTrue(s.getSize() > 0);
    }

    @Test
    public void testPush() throws Exception {
        SimpleStack s = new StackImpl();
        Item it = new Item("OK");
        int taille = s.getSize();
        s.push(it);
        assertTrue(s.peek().equals(it));
        assertTrue(s.getSize() > taille);
    }

    @Test
    public void testPeek() throws Exception {
        SimpleStack s = new StackImpl();
        Item it = new Item("OK");
        s.push(it);
        int taille = s.getSize();
        assertTrue(s.peek().equals(it));
        assertTrue(s.getSize() == taille);
    }

    @Test
    public void testPop() throws Exception {
        SimpleStack s = new StackImpl();
        Item it = new Item("OK");
        s.push(it);
        int taille = s.getSize();
        assertTrue(s.pop().equals(it));
        assertTrue(s.getSize() == taille-1);
    }
}