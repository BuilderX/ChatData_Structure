import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Room {//extends RoomMethods implements Runnable{
	
			User[] bannedUsers;
			Room room;
			UQueue userQueue;
			//RoomMethods RMeth;
			int numOfUsersInRoom = userQueue.getCount();
			SocketChannel channel;
			Socket sock;
			int currentRoom = 0;
			
		public Room(int port) {
					
			/*	super();
				 if(channel.isConnected()){
					createRoom(maxUsers);
					int maxUsers
				}*/
				 try{
					 sock = new Socket("host",port);
					// new Thread(this).start();
					 run();
					 
				 }catch(Exception e){
				   }
				}
		public Room (){
			int i = 0;
				
			userQueue = new UQueue();
			User user = userQueue.dequeue();
				
			if(UQueue.getCount() > 7){
					
			}else{
					//userQueue.
				//createRoom(num);
			while(UQueue.getCount() < 7){	
						
				User r = userQueue.getRoomContents()[i];
				r.isConnected = true;
				i++;//r.channel = 3030;
				r.userActions();
						}
					
				}
			
		}
		

		public void createRoom(int MaxUsers){
					 Room roomNode = new Room(3030);
					
					// roomNode.MaxSize = MaxUsers;
					 roomNode.numOfUsersInRoom = 0;
					 UQueue que = new UQueue(7);
					 //roomNode.UserStorage = new HashMap<Integer, User>(MaxUsers);
					 roomNode.bannedUsers = new User[15];
			 
				}



				private int getNumOfUsersInRoom() {
					return numOfUsersInRoom;
				
				}

				private void setNumOfUsersInRoom(int numOfUsersInRoom) {
					this.numOfUsersInRoom = numOfUsersInRoom;
			
				}

				private User[] getBannedUsers() {
					return bannedUsers;
				}

				private void setBannedUsers(User[] bannedUsers) {
					this.bannedUsers = bannedUsers;
				}

				private Room getRoom() {
					return room;
				}

				private void setRoom(Room room) {
					this.room = room;
				}

				private SocketChannel getChannel() {
					return channel;
				}

				private void setChannel(SocketChannel channel) {
					this.channel = channel;
				}

				private Socket getSock() {
					return sock;
				}

				private void setSock(Socket sock) {
					this.sock = sock;
				}

				//@Override
				public void run() {
					WeakReference<User> map;
					//
					createRoom(7);
					
				}
				public static void remove(User item,i) {
					
					// Select Slot
					// Mark Spot for next user 
					// Next User who enters room takes this spot
					
					
				}
				
				
			
			
}
