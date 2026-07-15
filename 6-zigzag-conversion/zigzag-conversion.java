class Solution {
    public String convert(String s, int numRows) {
        // Base case: if rows count is 1 or string length is less than rows, no change needed
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Initialize a array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Turn around when hitting the top (0) or bottom (numRows - 1) row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down based on the flag
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single final StringBuilder
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
