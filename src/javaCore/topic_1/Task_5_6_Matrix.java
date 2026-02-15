package javaCore.topic_1;

import java.util.Iterator;

public class Task_5_6_Matrix implements Iterator {
    private int[][] matrix;
    private int row = 0;
    private int col = 0;

    public Task_5_6_Matrix(int[][] matrix) {
        this.matrix = matrix;
    }


    @Override
    public boolean hasNext() {
        while (row < matrix.length && col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return row < matrix.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int element = matrix[row][col];

        col++;
        if (col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}
