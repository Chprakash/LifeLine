package research;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingANumericString {
	
	public static void main(String cp[])
	{
		List<String> rowsPerPage=new ArrayList<String>();
		rowsPerPage.add("10");
		rowsPerPage.add("100");
		rowsPerPage.add("200");
		rowsPerPage.add("25");
		rowsPerPage.add("50");
		
		System.out.println(rowsPerPage);
		Collections.sort(rowsPerPage);
		System.out.println(rowsPerPage);
		
		List<Integer> rowsPerPageNo=new ArrayList<Integer>();
		rowsPerPageNo.add(10);
		rowsPerPageNo.add(100);
		rowsPerPageNo.add(200);
		rowsPerPageNo.add(25);
		rowsPerPageNo.add(50);
		
		System.out.println(rowsPerPageNo);
		Collections.sort(rowsPerPageNo);
		System.out.println(rowsPerPageNo);
		
	}

}
