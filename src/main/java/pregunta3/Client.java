package pregunta3;

public class Client {

    public static void main(String[] args) {
    	Sharing sharing = SharerFactory.getSharer(SharerType.Reddit);    	
    	System.out.println(sharing.getSharer("Mastering design patterns").getMessage());
    	System.out.println("\n**********************\n");
    	for (SharerType sharerType : SharerType.values()) {
    		Sharing sharingEveryWhere = SharerFactory.getSharer(sharerType);
    		System.out.println(sharingEveryWhere.getSharer("I'll receive my Master's degree from UNMSM very soon").getMessage());
        }        
    }
}
