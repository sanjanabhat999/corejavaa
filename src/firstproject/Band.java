package firstproject;

public class Band {
	private String bandName;
	private String singers[];
	private String guitarists[];
	private String drummer;
	private String keyboardPlayer;
	
	public void setBandDetails(String bandName,String singers[],String guitarists[],String drummer,String keyboardPlayer )
	{
		this.bandName=bandName;
		this.singers=singers;
		this.guitarists=guitarists;
		this.drummer=drummer;
		this.keyboardPlayer=keyboardPlayer;
		
		
	}
	
	public void printBandDetails()
	{
		System.out.println(bandName);
		for(int i=0;i<singers.length;i++)
		{
		System.out.println(singers[i]);
		}
		for(int i=0;i<guitarists.length;i++)
		{
		System.out.println(guitarists[i]);
		}
		System.out.println(drummer);
		System.out.println(keyboardPlayer);
		
		System.out.println();
		
	}
	
	public int countMembers()
	{
		return 2+singers.length+guitarists.length;
	}
	
	
	
	
	
	
	

}
