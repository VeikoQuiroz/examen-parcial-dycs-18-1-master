package pregunta3;

public class PinterestSharer implements Sharing {
    @Override
    public Sharer getSharer(String message) {
		return new Sharer("Message '" + message + "' shared on Pinterest");
	}
    
}
