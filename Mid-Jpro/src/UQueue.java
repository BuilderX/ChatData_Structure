
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.CSS;


import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class UQueue {
	private int enqIndex;
	private int deqIndex;
	static private UQueue example;
	private User[] roomContents;
	private static int count = 0;
	

	public UQueue(int size){
		enqIndex = 0;
		deqIndex = 0;
		setRoomContents(new User [size]);
	}
	public UQueue(){
		this(count);
		enqIndex = 0;
		deqIndex = 0;
		
	
	}
	
	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	private static void setCount(int count) {
		UQueue.count = count;
	
}
	
	public void enqueue(User user){
		if(count == getRoomContents().length){
				return;
		}else{
			getRoomContents()[enqIndex] = user;
			enqIndex = ++enqIndex == getRoomContents().length ? 0: enqIndex;
			++count;
		}
	}
	
	public User dequeue(){
		User item = null;
		if(count == 0){
			throw new IllegalStateException();
			}	
		if(count > 7)
		 	Room.remove(item); // fix it 
		 	deqIndex = ++deqIndex == getRoomContents().length ? 0 : deqIndex;
		 	--count;
		 // make duplicate for if user leaves	
		return item;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	example = example.roomContents;
		UQueue test = new UQueue(3);
		User jim = new User();
		User Kim = new User();
		User Bim = new User();
		boolean h;
		test.enqueue(jim);
		test.enqueue(Kim);
		test.enqueue(Bim);
		test.toString();
	}
		
	@Override
	public String toString(){
			return Arrays.toString(getRoomContents());
		
	}
	private void getUserCount() {
		for(User user: roomContents){
			System.out.println(user);
		}
	}

	public void print(String[] arr){
		for(String Obj: arr){
			System.out.println(Obj);
		}
		
	}
    
/*public static int takeValues( int inputs){
			int [] disTrav = new int[inputs];
			int distanceSet[]  = new int[inputs];
			int sum = 0;
			int newVal =0; 
			
			for(int i = 0; i < disTrav.length;i++){
			    for(int j= i +1 ;j < disTrav.length-1;j++){
			     
			for(int i = 0,j = i + 1; i < disTrav.length;i++,j++){
			  // for(int j= i +1 ;j < disTrav.length-1;j++){
			        int value = disTrav[i] -= disTrav[j];	
			        distanceSet[i] = value;
			        newVal = distanceSet[i] += sum;			
			        System.out.println(newVal);    
			  
			    }	
			
				return newVal;
}*/
public User[] getRoomContents() {
	return roomContents;
}
public void setRoomContents(User[] roomContents) {
	this.roomContents = roomContents;
}
/*enum Weekdays{
		Monday,Tuesday,Wedensday
}
		 class daysoff{
			 public daysoff(){
				 Set<Weekdays> s = new TreeSet<>();
				 s.add(Weekdays.Monday);
				 System.out.print(s);
			 }
			 
*/			 
		 
		

	
}
	

