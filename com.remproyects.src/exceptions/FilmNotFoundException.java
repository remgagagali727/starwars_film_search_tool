package exceptions;

public class FilmNotFoundException extends RuntimeException{

    public FilmNotFoundException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}
