package pregunta3;

public class SharerFactory {
    
    public static Sharing getSharer(SharerType sharerType) {
        switch (sharerType) {
            case Facebook: return new FacebookSharer();
            case Twitter: return new TwitterSharer();
            case Reddit: return new RedditPoster(); 
            case Pinterest: return new PinterestSharer();
            default : return new RedditPoster();
        }
    }
}
