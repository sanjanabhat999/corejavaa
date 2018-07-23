package firstproject;

 interface SocialFeedReader1 {
	
	public Message pollForNewMessage();
	

}
 class Message {
	int messageId;
	String messageSource;
	String messageType;
	String message;
	String senderName;
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
 
 class TwitterFeedReader implements SocialFeedReader1{

	@Override
	public Message pollForNewMessage() {
		// TODO Auto-generated method stub
		Message m1=new Message();
		m1.setMessageId(1);
		m1.setMessageSource("Twitter");
		m1.setMessage("Tweeting...!");
		m1.setMessageType("String");
		m1.setSenderName("Captain America");
		return m1;
	}
	
	 
 }
 
 class facebookReader implements SocialFeedReader1 {

	@Override
	public Message pollForNewMessage() {
		// TODO Auto-generated method stub
		Message m2=new Message();
		m2.setMessageId(2);
		m2.setMessageSource("Facebook");
		m2.setMessage("Poking...!");
		m2.setMessageType("String");
		m2.setSenderName("Hulk");
		return m2;
	}
	 
	 
 }
 class SocialFeedReader {
	 public static void main(String[] args)
	 {   
		 facebookReader fc= new facebookReader();
		 Message m2= fc.pollForNewMessage();
		 System.out.println(m2.getMessageId());
		 System.out.println(m2.getMessage());
		 System.out.println(m2.getMessageType());
		 System.out.println(m2.getMessageSource());
		 System.out.println(m2.getSenderName());
		 System.out.println();
		 TwitterFeedReader trf= new TwitterFeedReader();
		 Message m= trf.pollForNewMessage();
		 System.out.println(m.getMessageId());
		 System.out.println(m.getMessage());
		 System.out.println(m.getMessageType());
		 System.out.println(m.getMessageSource());
		 System.out.println(m.getSenderName());
	 }
 }
