package si_lab2;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void everyBranchTest(){
        // 1
        int paymentOne = 0;
        List<Item> listOne = null;
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listOne, paymentOne));

        // 2
        List<Item> listTwo = new ArrayList<>();
        listTwo.add(new Item("eggs", "o210", 68, 0.2));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listTwo, paymentOne));

        // 3
        List<Item> listThree = new ArrayList<>();
        listThree.add(new Item("eggs", null, 68, 0.2));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(listThree, paymentOne));

        // 4
        List<Item> listFour = new ArrayList<>();
        listFour.add(new Item("", "0210", 68, 0.2));
        SILab2.checkCart(listFour, paymentOne);
        assertEquals("unknown", listFour.get(0).getName());

        // 5
        int paymentTwo = 200;
        List<Item> ListFive = new ArrayList<>();
        ListFive.add(new Item("eggs", "0210", 68, 0));
        ListFive.add(new Item("tuna", "2108", 72, 0));
        assertTrue(SILab2.checkCart(ListFive, paymentTwo));

        // 6
        List<Item> listSix = new ArrayList<>();
        listSix.add(new Item("eggs", "0210", 68, 0));
        listSix.add(new Item("tuna", "2108", 72, 0));
        listSix.add(new Item("bananas", "3105", 78, 0));
        assertFalse(SILab2.checkCart(listSix, paymentTwo));

        // 7
        List<Item> listSeven = new ArrayList<>();
        listSeven.add(new Item("eggs", "0210", 68, 0.2));
        listSeven.add(new Item("tuna", "2108", 72, 0.1));
        assertTrue(SILab2.checkCart(listSeven, paymentTwo));

        // 8
        List<Item> listEight = new ArrayList<>();
        listEight.add(new Item("eggs", "0210", 68, 0.2));
        listEight.add(new Item("tuna", "2108", 72, 0.1));
        listEight.add(new Item("bananas", "3105", 78, 0.3));
        assertFalse(SILab2.checkCart(listEight, paymentTwo));
    }

    @Test
    public void multipleConditionTest(){
        // 1
        List<Item> listOne = new ArrayList<>();
        listOne.add(new Item("eggs","3105", 210, 0.2));
        assertFalse(SILab2.checkCart(listOne,500));

        // 2
        List<Item> listTwo = new ArrayList<>();
        listTwo.add(new Item("eggs","3105",350,0));
        assertFalse(SILab2.checkCart(listTwo,500));

        // 3
        List<Item> listThree = new ArrayList<>();
        listThree.add(new Item("eggs","0210",350,0.2));
        assertFalse(SILab2.checkCart(listThree,500));

        // 4
        List<Item> listFour = new ArrayList<>();
        listFour.add(new Item("eggs","3105",350,0.2));
        assertTrue(SILab2.checkCart(listFour,599));
    }
}