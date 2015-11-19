package cn.com.shuduwang.utils;

import java.util.ArrayList;

/**
 * 得到Sudoku的容器，分为题和答案
 * */
public class GetSudoku {

	private ArrayList<String[]> defaultList ;
	private String[] itemList ;
	private int stage ;
	
	public ArrayList<String[]> getSudoku(int stage){
		this.stage = stage ;
		defaultList = new ArrayList<String[]>() ;
		defaultList.add(new String[10]) ;
		return getArray() ;
	}
	
	//将sudoku转化为符合要求的形式
	private ArrayList<String[]> getArray(){
		for(int i=0;i<9;i++){
			itemList = new String[10] ;
			itemList[0] = "0" ;
			for(int j=0;j<9;j++){
				itemList[j+1] = "" + sudoku1[stage][i][j] ;
			}
			defaultList.add(itemList) ;
		}
		return defaultList ;
	}
	
	//所有的sudoku题目
	private final int[][][] sudoku1=
	{
		{	//0
			{2,5,0,0,0,9,0,4,0},
			{4,0,7,1,0,3,0,0,6},
			{8,0,3,4,0,7,5,9,0},
			{3,0,8,0,7,0,0,6,9},
			{0,1,0,3,0,2,4,0,0},
			{5,0,4,9,0,6,0,8,3},
			{9,0,6,0,3,0,7,0,8},
			{0,3,0,6,0,8,0,1,0},
			{1,0,2,0,9,0,6,0,4}
		},
		{	//1
			{1,0,0,8,3,0,0,0,2},
			{5,7,0,0,0,1,0,0,0},
			{0,0,0,5,0,9,0,6,4},
			{7,0,4,0,0,8,5,9,0},
			{0,0,3,0,1,0,4,0,0},
			{0,5,1,4,0,0,3,0,6},
			{3,6,0,7,0,4,0,0,0},
			{0,0,0,6,0,0,0,7,9},
			{8,0,0,0,5,2,0,0,3}
		},
		{	//2
			{0,9,3,0,5,2,0,1,0},
			{0,0,1,0,0,0,0,0,5},
			{0,0,0,0,1,4,3,0,0},
			{0,3,4,0,0,7,0,6,8},
			{1,8,0,6,0,5,0,3,9},
			{9,5,0,4,0,0,7,2,0},
			{0,0,2,5,7,0,0,0,0},
			{3,0,0,0,0,0,6,0,0},
			{0,4,0,3,6,0,1,5,0}
			
		},
		{	//3
			{1,0,8,7,3,6,5,0,0},
			{0,7,0,0,1,5,0,3,0},
			{0,3,6,0,9,8,7,1,4},
			{2,0,7,5,6,3,0,8,0},
			{0,0,1,8,0,7,3,0,9},
			{3,8,5,9,4,1,0,6,0},
			{0,5,0,6,0,9,1,2,0},
			{7,0,9,0,5,0,6,0,0},
			{6,2,0,1,8,0,9,7,5}
		},
		{	//4
			{5,7,0,1,2,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,6,7,0,0,0,8,0},
			{3,0,4,0,0,9,0,7,0},
			{0,2,0,0,7,0,0,5,0},
			{0,1,0,3,0,0,9,0,2},
			{0,8,0,0,0,2,1,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,5,4,0,6,3}
		},
		{	//5
			{1,4,0,7,5,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,5,1,0,0,0,3,0},
			{9,0,1,0,0,5,0,8,0},
			{0,7,0,0,1,0,0,5,0},
			{0,8,0,3,0,0,4,0,6},
			{0,6,0,0,0,2,7,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,8,4,0,2,9}
		},
		{	//6
			{2,9,0,6,8,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,7,9,0,0,0,1,0},
			{5,0,9,0,0,3,0,8,0},
			{0,8,0,0,7,0,0,6,0},
			{0,3,0,4,0,0,2,0,1},
			{0,4,0,0,0,5,6,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,4,1,0,7,8}
		},
		{	//7
			{0,0,5,3,0,0,0,0,0},
			{8,0,0,0,0,0,0,2,0},
			{0,7,0,0,1,0,5,0,0},
			{4,0,0,0,0,5,3,0,0},
			{0,1,0,0,7,0,0,0,6},
			{0,0,3,2,0,0,0,8,0},
			{0,6,0,5,0,0,0,0,9},
			{0,0,4,0,0,0,0,3,0},
			{0,0,0,0,0,9,7,0,0}
		},
		{	//8
			{8,1,0,5,4,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,9,1,0,0,0,7,0},
			{2,0,4,0,0,9,0,3,0},
			{0,6,0,0,3,0,0,9,0},
			{0,3,0,8,0,0,7,0,1},
			{0,5,0,0,0,3,8,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,5,2,0,4,9}
		},
		{	//9
			{0,0,8,0,9,0,0,0,0},
			{0,7,0,0,0,0,2,8,0},
			{0,6,4,1,0,0,3,0,0},
			{0,0,0,8,0,5,9,0,0},
			{5,0,0,0,0,0,0,0,0},
			{0,0,9,3,0,4,0,0,0},
			{8,0,2,0,0,7,5,6,0},
			{0,9,7,0,0,0,0,1,0},
			{0,0,0,0,6,0,7,0,0}
		},
		{	//10
			{0,0,0,7,0,2,0,0,0},
			{1,0,0,0,4,0,0,0,7},
			{6,5,0,0,0,0,0,9,4},
			{4,7,0,8,0,1,0,6,2},
			{0,0,0,0,0,0,0,0,0},
			{5,8,0,2,0,9,0,1,3},
			{8,6,0,0,0,0,0,7,5},
			{9,0,0,0,6,0,0,0,8},
			{0,0,0,9,0,8,0,0,0}
		},
		{	//11
			{0,0,7,2,3,8,0,0,0},
			{0,6,0,7,0,0,0,5,0},
			{0,0,0,4,0,0,0,0,2},
			{9,0,0,0,0,0,8,6,7},
			{1,0,0,0,0,0,0,0,3},
			{6,4,8,0,0,0,0,0,5},
			{7,0,0,0,0,3,0,0,0},
			{0,2,0,0,0,5,0,3,0},
			{0,0,0,1,7,4,9,0,0}
		},
		{	//12
			{7,0,0,0,1,0,0,5,4},
			{0,9,0,0,0,0,0,0,1},
			{0,0,5,8,0,0,0,6,0},
			{4,0,0,6,8,0,0,0,0},
			{1,0,0,0,4,0,3,0,0},
			{0,0,0,0,3,9,0,0,2},
			{0,2,0,0,0,6,1,0,0},
			{3,0,0,0,0,0,0,2,0},
			{5,7,0,0,2,0,0,0,8}
		},
		{	//13
			{1,8,0,0,0,0,4,0,0},
			{0,0,0,8,0,0,0,0,0},
			{0,0,9,0,3,4,5,0,0},
			{0,4,0,9,6,0,0,0,0},
			{5,2,0,0,8,0,0,7,6},
			{0,0,0,0,5,3,0,1,0},
			{0,0,2,5,1,0,7,0,0},
			{0,0,0,0,0,2,0,0,0},
			{0,0,7,0,0,0,0,9,2}
		},
		{	//14
			{0,6,0,0,3,0,0,0,0},
			{0,4,5,9,0,0,0,2,8},
			{9,0,8,0,0,0,7,3,0},
			{0,0,0,0,9,0,0,5,0},
			{0,0,0,8,0,6,0,0,7},
			{0,8,0,0,5,0,0,0,0},
			{0,3,6,0,0,0,9,0,0},
			{4,2,0,0,0,9,3,8,0},
			{0,0,0,0,2,0,0,1,0}
		},
		{	//15
			{0,9,0,5,6,8,0,2,0},
			{0,0,0,0,0,0,0,0,0},
			{0,5,6,0,0,0,7,9,0},
			{3,0,0,4,0,9,0,0,7},
			{0,0,0,0,0,0,0,0,0},
			{4,0,0,2,0,1,0,0,8},
			{0,7,4,0,0,0,5,1,0},
			{0,0,0,0,0,0,0,0,0},
			{0,2,0,1,3,4,0,7,0}
		},
		{	//16
			{1,0,0,0,0,0,0,0,4},
			{2,4,5,0,0,0,7,0,8},
			{0,3,0,5,0,0,0,0,0},
			{9,0,0,0,0,3,1,0,0},
			{0,0,0,8,0,7,0,0,0},
			{0,0,7,6,0,0,0,0,2},
			{0,0,0,0,0,9,0,4,0},
			{4,0,2,0,0,0,6,5,3},
			{3,0,0,0,0,0,0,0,9}
		},
		{	//17
			{0,0,1,4,0,0,0,0,0},
			{0,0,0,0,7,8,6,0,1},
			{0,0,0,0,5,0,9,0,0},
			{0,8,0,0,0,0,0,2,3},
			{0,1,3,0,0,0,5,6,0},
			{9,5,0,0,0,0,0,7,0},
			{0,0,5,0,4,0,0,0,0},
			{3,0,9,1,8,0,0,0,0},
			{0,0,0,0,0,7,3,0,0}
		},
		{	//18
			{1,0,0,0,0,0,0,0,9},
			{0,6,0,8,0,7,0,5,0},
			{1,0,7,0,0,0,2,0,0},
			{2,1,0,0,5,0,0,9,3},
			{0,0,0,4,0,8,0,0,0},
			{4,3,0,0,2,0,0,8,7},
			{0,0,1,0,0,0,9,0,0},
			{0,5,0,6,0,9,0,4,0},
			{6,0,0,0,0,0,0,0,8}
		},
		{	//19
			{0,0,6,8,0,0,9,0,0},
			{0,0,7,0,3,0,6,0,5},
			{0,0,9,1,0,0,0,3,0},
			{0,0,3,0,0,0,2,1,0},
			{0,0,0,9,0,1,0,0,0},
			{0,1,8,0,0,0,6,0,0},
			{0,6,0,0,0,9,7,0,0},
			{7,0,3,0,2,0,8,0,0},
			{0,0,1,0,0,4,5,0,0}
		},
		{	//20
			{0,0,0,0,8,0,0,2,0},
			{4,0,0,0,0,7,9,0,0},
			{8,0,3,4,0,0,0,0,0},
			{0,0,0,0,0,5,0,0,1},
			{9,4,0,0,1,0,0,5,2},
			{5,0,0,3,0,0,0,0,0},
			{0,0,0,0,0,9,7,0,3},
			{0,0,9,8,0,0,0,0,4},
			{0,3,0,0,6,0,0,0,0}
		},
		{	//21
			{4,0,0,0,0,0,1,0,0},
			{0,0,2,6,0,0,4,0,0},
			{6,7,0,0,0,0,0,9,2},
			{0,2,0,0,0,4,0,0,0},
			{0,1,0,7,0,9,0,6,0},
			{0,0,0,3,0,0,0,2,0},
			{1,3,0,0,0,0,0,7,9},
			{0,0,7,0,0,5,3,0,0},
			{0,0,8,0,0,0,0,0,1}
		},
		{	//22
			{0,0,9,0,0,0,0,0,2},
			{0,0,0,3,1,0,8,0,0},
			{2,0,8,6,0,0,0,0,0},
			{0,5,0,0,2,0,0,0,1},
			{0,0,0,4,0,8,0,0,0},
			{6,0,0,0,9,0,0,4,0},
			{0,0,0,0,0,6,4,0,3},
			{0,0,7,0,8,5,0,0,0},
			{1,0,0,0,0,0,2,0,0}
		},
		{	//23
			{0,0,0,0,0,2,9,0,0},
			{0,0,8,0,4,0,0,7,0},
			{0,0,0,6,0,7,0,3,0},
			{0,4,0,0,0,0,0,0,0},
			{0,5,3,8,0,9,2,6,0},
			{0,1,0,0,0,0,0,9,0},
			{0,3,0,2,0,4,0,0,0},
			{0,7,0,0,5,0,6,0,0},
			{0,0,5,7,0,0,0,0,0}
		},
		{	//24
			{0,5,0,0,3,0,0,0,0},
			{0,0,1,6,0,0,9,0,8},
			{3,4,0,7,0,1,0,0,0},
			{0,0,0,0,0,7,0,0,5},
			{0,9,0,0,5,0,0,8,0},
			{7,0,0,2,0,0,0,0,0},
			{0,0,0,3,0,9,0,6,1},
			{6,0,4,0,0,8,3,0,0},
			{0,0,0,0,6,0,0,7,0}
		},
		{	//25
			{8,0,0,0,4,0,1,0,3},
			{0,0,0,5,0,0,7,0,0},
			{1,3,0,0,0,0,0,0,0},
			{0,0,0,2,0,6,0,8,0},
			{5,0,0,0,0,0,0,0,4},
			{0,2,0,4,0,7,0,0,0},
			{0,0,0,0,0,0,0,3,1},
			{0,0,2,0,0,4,0,0,0},
			{0,0,4,0,7,0,0,0,5}
		},
		{	//26
			{7,1,0,0,0,0,0,0,0},
			{2,0,9,0,5,0,6,0,0},
			{0,0,0,0,0,8,0,9,0},
			{0,0,6,0,3,2,0,0,0},
			{0,0,8,0,1,0,4,0,0},
			{0,0,0,1,8,0,9,0,0},
			{0,3,0,7,0,0,0,0,0},
			{0,0,4,0,1,0,7,0,8},
			{0,0,0,0,0,0,0,5,3}
		},
		{	//27
			{0,0,4,8,7,0,0,3,0},
			{2,1,0,0,0,9,0,0,0},
			{0,0,3,0,0,0,0,0,0},
			{0,6,0,5,0,0,0,0,0},
			{4,0,1,0,0,0,9,0,5},
			{0,3,0,0,0,7,0,2,0},
			{0,0,0,0,0,0,1,0,0},
			{0,0,0,2,0,0,0,7,8},
			{0,5,0,0,8,6,4,0,0}
		},
		{	//28
			{3,0,5,0,0,1,0,0,4},
			{0,0,2,0,0,8,0,0,0},
			{0,0,0,0,6,0,0,8,2},
			{9,4,0,0,0,0,0,0,0},
			{0,0,3,0,0,0,7,0,0},
			{0,0,0,0,0,0,0,4,3},
			{2,5,0,0,1,0,0,0,0},
			{0,0,0,5,0,0,9,0,0},
			{1,0,0,4,0,0,3,0,7}
		},
		{	//29
			{0,2,0,4,0,3,7,0,0},
			{0,0,0,0,0,0,0,3,2},
			{0,0,0,0,0,0,0,0,4},
			{0,4,0,2,0,0,0,7,0},
			{8,0,0,0,5,0,0,0,0},
			{0,0,0,0,0,1,0,0,0},
			{5,0,0,0,0,0,9,0,0},
			{0,3,0,9,0,0,0,0,7},
			{0,0,1,0,0,8,6,0,0}
		}
	};
}
