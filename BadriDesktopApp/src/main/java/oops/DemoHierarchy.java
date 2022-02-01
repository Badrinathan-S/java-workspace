package oops;

public class DemoHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playStore play=new playStore("badrigugai@gmail.com","badrinath","badri",1234567890L);
		play.download("VLC", "badri@gmail.com", "badri");
		play.download("Instagram", "badrigugai@gmail.com", "badri");
		play.download("Orkut", "badrigugai@gmail.com", "badri");
		System.out.println(play);
		
		Drive dv=new Drive("vishnu@gmail.com", "Vishnu", "vishnu", 987654321L);
		dv.share("UML", "viki@gmail.com");
		dv.share("SRS", "raja@yahoo.com");
		dv.share("Scrum", "muthu@gmail.com");
		System.out.println(dv);
		
		// Parent obj=new DeriveClass();
		Google g=new playStore("anupama@gmail.com", "anupama", "anupama", 87656789876L);
		System.out.println(g);
		
		g=new Drive("razakmohamed@gmail.com", "Razak Mohamed", "razak", 87656789876L);
		System.out.println(g);

	}

}


class playStore extends Google{
	
//	public playStore() {
//		System.out.println("Playstore opened");
//	}
//	
	public playStore(String username, String fullname, String password, Long contact) {
		super(username, fullname, password, contact);
	}
	
	public Boolean validate(String user, String password) {
		if(user.equals(this.getUsername()) && password.equals(this.getPassword())) {
			return true;
		}
		return false;
	}
	
	
	static String[] available= {"PUBG","Free Fire","VLC","MX Player","Instagram",
			"Whatsapp","Telegram","Facebook","Youtube",
			"Hotstar","Flipkart","Amazon","Netflix","LinkedIn"};
	
	String[] installed = new String[10];
	
	public void download(String app, String username, String password) {
		if(validate(username, password)) {
			for(int i=0;i<available.length;i++) {
				if(available[i].equals(app)) {
					for(int pos=0;pos<installed.length;pos++)
					{
						if(installed[pos]==null)
						{
							installed[pos]=available[i];
							System.out.println(available[i]+" installed successfully by "+getFullname()+" via "+getUsername());
							return;
						}
					}
					System.out.println("Internal space full");
					return;
				}
			}
			System.out.println(app+" app not in our playstore");
		}
		else
			System.out.println("Invalid credentials");
	}
	
}

class Drive extends Google{
	
	String[] files= {"Daily Report","FRS","SRS","UML","Test Plan","Test Design","Test Report","User Story","Epic","Bug Report","Test Summary"};

	public Drive(String username, String fullname, String password, Long conatct) {
		super(username, fullname, password, conatct);
		// TODO Auto-generated constructor stub
	}
	
	public void share(String specific, String to) {
		for(int index=0;index<files.length;index++)
		{
			if(specific.equalsIgnoreCase(files[index]))
			{
				System.out.println(files[index]+" found ");
				if(to.endsWith("@gmail.com"))
				{
					System.out.println(files[index]+" shared to "+to+" by "+getUsername());
					return;
				}
				else
				{
					System.out.println(to+" address is invalid");
					return;
				}
			}
		}
		System.out.println(specific+" not found in "+ getUsername() +" drive");
	}
	
}
