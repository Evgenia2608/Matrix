package org.itstep;

public class Matrix {
	
	private int[][]matrix;

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrixLength) {
		this.matrix=new int[matrixLength][matrixLength];
		for(int i=0; i<matrixLength; i++){
			for(int j=0; j<matrixLength; j++){
				matrix[i][j]=(int)(2+(Math.random()*(16-2)));
							
			}
			
		}
		
	}
	
	

}
