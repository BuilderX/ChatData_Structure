import java.util.Iterator;
import java.util.WeakHashMap;

public class RoomMapStorage {

			WeakHashMap<Integer, Room> Web = null;
			int currentPosition = 0;
			{
				//Syncronized (true){}
				}
			{
			 int count = 0;
			 boolean locked = false;
			 while(locked){
				// wait();
				 
			 }
			 locked = true;
			 
			 
			 }
			 public synchronized void unlock(){ boolean locked = false;}
			 int inc(){
				 synchronized (this) {
					return ++currentPosition;
				}
				
				
				
			}
				public RoomMapStorage(){
					Web = new WeakHashMap<>();
					
				}
				
				public RoomMapStorage(int key, Room room){
					
					this();
					boolean RoomPlaced = checkIfExist(key);
					if(RoomPlaced){
						createRoom(key,room);
						currentPosition++;
					}
				}
				public boolean checkIfExist(int key){
					if(Web.size() < 0 || Web.containsKey(key))
						
						return false; 	
					
					else{
						return true;
						
					}
				
				}		
				void createRoom(int key, Room room){
							Web.put(key, room);
							
				}
				void RoomandClear(int key){
							Web.remove(key);
					
					
				}
				Room find(Room room){
					room = Web.get(room);
					
					
					return room;
				}
				void currentKey(){}
				void nextRoom(){
					if(!Web.isEmpty()){
					//this.Web;
					/*Iterator<Room> NextRoom =null ;
					//this.currentPosition;	
				
					NextRoom.next();*/
					}
				}
				void roomControl(Room room){
					
				/*	Room AlteredRoom = find(room);
					
					*/
					
				}

				/* (non-Javadoc)
				 * @see java.lang.Object#hashCode()
				 */
				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((Web == null) ? 0 : Web.hashCode());
					result = prime * result + currentPosition;
					return result;
				}

				/* (non-Javadoc)
				 * @see java.lang.Object#equals(java.lang.Object)
				 */
				@Override
				public boolean equals(Object obj) {
					if (this == obj) {
						return true;
					}
					if (obj == null) {
						return false;
					}
					if (!(obj instanceof RoomMapStorage)) {
						return false;
					}
					RoomMapStorage other = (RoomMapStorage) obj;
					if (Web == null) {
						if (other.Web != null) {
							return false;
						}
					} else if (!Web.equals(other.Web)) {
						return false;
					}
					if (currentPosition != other.currentPosition) {
						return false;
					}
					return true;
				}
				
				
	
	
}
