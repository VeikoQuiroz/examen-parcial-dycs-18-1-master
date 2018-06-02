package pregunta5;

public class PartesAbstractfactory {
	public static final String WHITEFINISH = "WhiteFinish";
    public static final String FASTPROCESSOR = "FastProcessor";
    public static PartesAbstractfactory ParteFactory(String type) {
        if (type.equals(PartesAbstractfactory.WHITEFINISH)) {
            return new WhiteFinishFactory();
        }
        if (type.equals(PartesAbstractfactory.FASTPROCESSOR)) {
            return new fastProcessorFactory();
        }
        return new fastProcessorFactory();
    }
}
