import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestHashTables {
	@Test
	public void testHashtable1() {
		// Test #1 (number of probes)
        int size = 10007; // prime number
        int numValues = 1000;

        LinearHashtable<String> linearTable = new LinearHashtable<>(size);
        QuadraticHashtable<String> quadraticTable = new QuadraticHashtable<>(size);

        // generate random strings and insert them into both tables
        for (int i = 0; i < numValues; i++) {
            String newValue = Lab10.generateRandomString(25);
            linearTable.insert(newValue, newValue);
            quadraticTable.insert(newValue, newValue);
        }

        assertTrue(linearTable.getProbeCount() > quadraticTable.getProbeCount(), "Linear probing should result in a lot more probes.");
	}

	@Test
	public void testHashtable2() {
		// Test #2 (linear probing without any collision)
        int size = 13;

        LinearHashtable<String> linearTable = new LinearHashtable<>(size);
        String val1 = "Fred";
        linearTable.insert(val1, val1);
        assertEquals(linearTable.getProbeCount(), 1, "Linear probing without collisions should result in 1 probe.");
	}

	@Test
	public void testHashtable3() {
		// Test #3 (linear probing with a single collision)
        int size = 13;

        LinearHashtable<String> linearTable = new LinearHashtable<>(size);
        String val1 = "Fred";
        linearTable.insert(val1, val1);
        linearTable.insert(val1, val1);
        assertEquals(linearTable.getProbeCount(), 3, "Linear probing with one collision should result in 3 probes.");
	}

	@Test
	public void testHashtable4() {
		// Test #4 (linear probing with a double collision)
        int size = 13;

        LinearHashtable<String> linearTable = new LinearHashtable<>(size);
        String val1 = "Fred";
        linearTable.insert(val1, val1);
        linearTable.insert(val1, val1);
        linearTable.insert(val1, val1);
        assertEquals(linearTable.getProbeCount(), 6, "Linear probing with two collisions should result in 6 probes.");
	}

	@Test
	public void testHashtable5() {
		// Test #5 (quadratic probing without any collision)
        int size = 13;

        QuadraticHashtable<String> quadraticTable = new QuadraticHashtable<>(size);
        String val1 = "Fred";
        quadraticTable.insert(val1, val1);
        assertEquals(quadraticTable.getProbeCount(), 1, "Quadratic probing without collisions should result in 1 probe.");
	}

	@Test
	public void testHashtable6() {
		// Test #6 (quadratic probing with a single collision)
        int size = 13;

        QuadraticHashtable<String> quadraticTable = new QuadraticHashtable<>(size);
        String val1 = "Fred";
        quadraticTable.insert(val1, val1);
        quadraticTable.insert(val1, val1);
        assertEquals(quadraticTable.getProbeCount(), 3, "Quadratic probing with one collision should result in 3 probes.");
	}

	@Test
	public void testHashtable7() {
		// Test #7 (quadratic probing with a double collision)
        int size = 13;

        QuadraticHashtable<String> quadraticTable = new QuadraticHashtable<>(size);
        String val1 = "Fred";
        quadraticTable.insert(val1, val1);
        quadraticTable.insert(val1, val1);
        quadraticTable.insert(val1, val1);
        assertEquals(quadraticTable.getProbeCount(), 6, "Quadratic probing with two collisions should result in 6 probes.");
	}
}
