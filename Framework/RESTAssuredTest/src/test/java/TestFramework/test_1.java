package TestFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class test_1 {
	@Test
	public void sortNums() {
		String[] nums= {"9986835101","9986835109","9986835104","9986835107","9986835102","9986835108","9988668899"};
		final Map<String,Integer> order = new HashMap<String,Integer>();
		order.put("101", 1);
		order.put("102", 2);
		order.put("103", 3);
		order.put("104", 4);
		order.put("105", 5);
		order.put("106", 6);
		order.put("107", 7);
		order.put("108", 8);
		order.put("109", 9);
		List<String> list=new LinkedList<String>();
		for(String s: nums) {
			list.add(s);
		}
		/*
		 * Collections.sort(list, new Comparator<String>(){ public int compare(String
		 * e1,String e2) { return
		 * order.get(e1.substring(0,3)).compareTo(order.get(e2.substring(0,3))); } });
		 */
		Collections.sort(list);
		System.out.println(list);
	}
	
	
}
