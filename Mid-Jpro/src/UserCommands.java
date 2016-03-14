
public interface UserCommands {
			
			
				void NextRoom();
				void Speak();
				void blockUser(); // when user highlights 
				public String getInfo();
				void addUsers(Room room, User use);
				String getInfo(User user);
				void viewUsers(Room room, User user);
	
				 String getNickName();

				 void setNickName(String nickName);
				 int getId();
				 void setId(int id);

}
