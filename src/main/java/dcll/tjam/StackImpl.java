package dcll.tjam;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackImpl implements SimpleStack {

//    private int size;
    private ArrayList<Item> stack = new ArrayList<Item>();

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty() {
       return stack.size()== 0;
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return stack.size();
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        stack.add(item);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {
       return stack.get(stack.size()-1);
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException {
       final Item it = stack.get(stack.size()-1);
       stack.remove(stack.size()-1);
       return it;
    }
}
