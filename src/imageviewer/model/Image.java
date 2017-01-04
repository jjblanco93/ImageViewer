package imageviewer.model;

/**
 * @author julioblanco
 */
public interface Image {
    
    byte[] bitmap();

    Image next();
    Image prev();
    
}
