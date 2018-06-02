package pregunta3;

public class TwitterSharer implements Sharing {
    @Override   
    public Sharer getSharer(String message) {
		return new Sharer("Message '" + message + "' shared on Twitter");
	}
}
