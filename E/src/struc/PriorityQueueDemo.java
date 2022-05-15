package struc;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<>();
		pq.add(new Student("B", 18));
		pq.add(new Student("C", 28));
		pq.add(new Student("D", 38));
		pq.add(new Student("A", 8));
		pq.add(new Student("F", 58));
		pq.add(new Student("E", 48));
		pq.add(new Student("G", 68));
		
		
		pq.stream().forEach(System.out::println);
//		Iterator<Student> iterator = pq.iterator();
//		while(iterator.hasNext()) {
//			iterator.next();
//		}
//		
		
		while(true) 
		{System.out.println();
			Student e = pq.poll();
		    System.out.println(e);
		     
		    if(e == null) break;
		}
	}
}


class Student implements Comparable<Student> {
	
	private int rank;
	private String name;
	
	public Student (String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Student s) {
		if (this.rank < s.rank) {
			return 1;
		} else if (this.rank > s.rank) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "rank: " + this.rank + ", name: " + this.name;
	}
}