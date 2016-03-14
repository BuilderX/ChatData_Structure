
import java.nio.channels.SocketChannel;

class User implements UserCommands{
			 		 String NickName ="";
			 		  int id = 0;
			 		 String userDescription;
			 		 boolean isConnected = false;
			 		 boolean isSpeaking = false;
					 boolean isAdmin = false;
					 boolean isPowerUser = false;
					 boolean isTyping = false;
					 SocketChannel channel;
					 User use;
					 //FriendsList friendsList;
					 
					 public User(User use){
						 		use.getNickName();
						 		use.getInfo();
						 
					 }
					 
			 		 public User(String nickName, int id, String userDescription,boolean PowerUser) {
							NickName = nickName;
							this.id = id;
							this.userDescription = userDescription;
							try {
								channel.connect(null);
								if(channel.isConnected()){
									isConnected = true;
									
								}
							} catch (Exception e) {
								// TODO: handle exception
							}
							
					}
			 		 public User(){
			 			 /* id++;
			 			  this.NickName = "Demo";
			 			 */ 
			 		} 
			 		 public User userActions(){
			 			 
			 			 use.getNickName();
			 			 use.getInfo();
			 			 use.hashCode();
			 			 
			 			 return use;
			 		 }
			 		 
			 		@Override
					public String getNickName() {
						return NickName;
					}
			 		@Override
					public void setNickName(String nickName) {
						NickName = nickName;
					}
			 		@Override
					public int getId() {
						return id;
					}
			 		@Override
					public void setId(int id) {
						this.id = id;
					}
			 		
					private boolean isConnected() {
						return isConnected;
					}

					private void setConnected(boolean isConnected) {
						this.isConnected = isConnected;
					}

					private boolean isSpeaking() {
						return isSpeaking;
					}

					private void setSpeaking(boolean isSpeaking) {
						this.isSpeaking = isSpeaking;
					}

					private boolean isAdmin() {
						return isAdmin;
					}

					private void setAdmin(boolean isAdmin) {
						this.isAdmin = isAdmin;
					}

					private boolean isPowerUser() {
						return isPowerUser;
					}

					private void setPowerUser(boolean isPowerUser) {
						this.isPowerUser = isPowerUser;
					}

					private boolean isTyping() {
						return isTyping;
					}

					private void setTyping(boolean isTyping) {
						this.isTyping = isTyping;
					}
					
					@Override
					public void NextRoom() {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void Speak() {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void blockUser() {
						// TODO Auto-generated method stub
						
					}
				
					@Override
					public String getInfo() {
						// TODO Auto-generated method stub
						return userDescription;
					}
					@Override
					public void addUsers(Room room, User use) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void viewUsers(Room room, User user) {
					
						
						
						
					}
					
			 	
					

					/* (non-Javadoc)
					 * @see java.lang.Object#hashCode()
					 */
					@Override
					public int hashCode() {
						final int prime = 31;
						int result = 1;
						result = prime * result + ((NickName == null) ? 0 : NickName.hashCode());
						result = prime * result + ((channel == null) ? 0 : channel.hashCode());
						result = prime * result + (isAdmin ? 1231 : 1237);
						result = prime * result + (isConnected ? 1231 : 1237);
						result = prime * result + (isPowerUser ? 1231 : 1237);
						result = prime * result + (isSpeaking ? 1231 : 1237);
						result = prime * result + (isTyping ? 1231 : 1237);
						result = prime * result + ((userDescription == null) ? 0 : userDescription.hashCode());
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
						if (!(obj instanceof User)) {
							return false;
						}
						User other = (User) obj;
						if (NickName == null) {
							if (other.NickName != null) {
								return false;
							}
						} else if (!NickName.equals(other.NickName)) {
							return false;
						}
						if (channel == null) {
							if (other.channel != null) {
								return false;
							}
						} else if (!channel.equals(other.channel)) {
							return false;
						}
						if (isAdmin != other.isAdmin) {
							return false;
						}
						if (isConnected != other.isConnected) {
							return false;
						}
						if (isPowerUser != other.isPowerUser) {
							return false;
						}
						if (isSpeaking != other.isSpeaking) {
							return false;
						}
						if (isTyping != other.isTyping) {
							return false;
						}
						if (userDescription == null) {
							if (other.userDescription != null) {
								return false;
							}
						} else if (!userDescription.equals(other.userDescription)) {
							return false;
						}
						return true;
					}

					@Override
					public String getInfo(User user) {
						// TODO Auto-generated method stub
						return user.userDescription;
					}	
			 	}