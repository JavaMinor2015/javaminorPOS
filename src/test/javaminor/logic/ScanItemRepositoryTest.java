package javaminor.logic;

import javaminor.domain.abs.ScanItem;
import junit.framework.TestCase;
import org.junit.Ignore;

import java.util.List;

/**
 * Created by alex on 9/23/15.
 */
@Ignore("DB products don't match with used populator products")
public class ScanItemRepositoryTest extends TestCase {

    public void testGetProducts() throws Exception {
        List<ScanItem> items = ScanItemRepository.getProducts(0,1);
        assertEquals(1,items.size());

        items = ScanItemRepository.getProducts(0,5);
        assertEquals(5,items.size());

        items = ScanItemRepository.getProducts(1,5);
        assertEquals(5,items.size());

        items = ScanItemRepository.getProducts(5,5);
        assertEquals(5,items.size());


    }
}