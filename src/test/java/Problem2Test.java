import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {0, 0, 0, 0,},
                {101, 101, 102, 103, 104, 104, 105},
                {56, 56, 56, 109, 2039, 2039, 5845, 5845, 5845, 5845},
                {1, 1, 1, 12, 12, 12, 123, 1234, 1234, 12345},
                {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9},
                {0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                {0},
                {101, 102, 103, 104, 105},
                {56, 109, 2039, 5845},
                {1, 12, 123, 1234, 12345},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
