package pregunta3;

public class RedditPoster implements Sharing{
	@Override
	public Sharer getSharer(String message) {
		return new Sharer("Message '" + message + "' posted to Reddit");
	}
}
