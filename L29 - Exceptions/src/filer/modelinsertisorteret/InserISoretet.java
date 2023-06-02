package modelinsertisorteret;

import java.util.ArrayList;
import java.util.Arrays;

public class InserISoretet {
	
	public static void insert(int[] tabel, int e) {
		int j = tabel.length-1;
		while(j>=0 && tabel[j]==0) {
			j--;
		}
		j++;
		boolean found = false;
		while (!found && j>0) {
			if (e>tabel[j-1]) {
				found = true;
			}
			else {
				tabel[j] = tabel[j-1];
				j--;
			}
		}
		tabel[j]= e;
		
	}
	
	public static void insert (ArrayList<Integer> list, int e) {
		boolean found = false;
		int i = 0;;
		while (!found && i<list.size()) {
			if (list.get(i)>e) {
				found = true;
			}
			else {
				i++;
			}
		}
		list.add(i,e);
	}

	public static void main(String[] args) {
		int[] tabel = new int[10];
		insert(tabel,5);
		insert(tabel,2);
		insert(tabel,9);
		insert(tabel,4);
		insert(tabel,1);
		insert(tabel,7);
		insert(tabel,10);
		insert(tabel,12);
		insert(tabel,6);
		insert(tabel,3);
		System.out.println(Arrays.toString(tabel));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		insert(list,5);
		insert(list,2);
		insert(list,9);
		insert(list,4);
		insert(list,1);
		insert(list,7);
		insert(list,10);
		insert(list,12);
		insert(list,6);
		insert(list,3);
		System.out.println(list);

	}

}
