package com.avizva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Matrix<T extends Number> {
	private int rows;
	private int columns;
	Object[][] data;

	public Matrix(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.data = new Object[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public boolean addElements(List<T> elements) {
		if (elements.size() != rows * columns)
			return false;
		Iterator<T> iterator = elements.iterator();
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				data[i][j] = iterator.next();
		return true;
	}

	@SuppressWarnings("unchecked")
	public Matrix<T> addMatrix(Matrix<T> second) {
		if (this.getRows() != second.getRows() || this.getColumns() != second.getColumns())
			return null;
		Matrix<T> newMatrix = new Matrix<T>(getRows(), getColumns());
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				newMatrix.data[i][j] = ((T) data[i][j]).intValue() + ((T) second.data[i][j]).intValue();
		return newMatrix;
	}

	@SuppressWarnings("unchecked")
	public Matrix<T> multiplyMatrix(Matrix<T> second) {
		if (this.getColumns() != second.getRows())
			return null;
		Matrix<T> newMatrix = new Matrix<T>(getRows(), second.columns);
		for (int i = 0; i < newMatrix.getRows(); i++) {
			for (int j = 0; j < newMatrix.getColumns(); j++) {
				int result = 0;
				for (int k = 0; k < getColumns(); k++) {
					result += ((T) (this.data[i][k])).intValue() * ((T) (second.data[k][j])).intValue();
				}
				newMatrix.data[i][j] = result;
			}
		}

		return newMatrix;
	}

	public Matrix<T> transpose() {
		Matrix<T> newMatrix = new Matrix<T>(getRows(), getColumns());
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				newMatrix.data[j][i] = data[i][j];
		return newMatrix;
	}

	@SuppressWarnings("unchecked")
	public void printMatrix() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				System.out.print((T) data[i][j] + "\t");
			System.out.println();
		}
	}

}

public class Question5 {

	public static void main(String[] args) {
		Matrix<Integer> matrix = new Matrix<Integer>(2, 2);
		List<Integer> elements = new ArrayList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		elements.add(4);
		matrix.addElements(elements);
		matrix.printMatrix();
		Matrix<Integer> matrix2 = new Matrix<Integer>(2, 2);
		matrix2.addElements(elements);
		matrix.addMatrix(matrix2).printMatrix();
		matrix.multiplyMatrix(matrix2).printMatrix();
		matrix.transpose().printMatrix();
	}

}
