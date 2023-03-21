public class NotFoundException extends RuntimeException {
    public NotFoundException(String name){
        super("Player" + name + "not found");
    }

}
