package imageviewer.ui;

import imageviewer.model.Image;

/**
 * @author julioblanco
 */
public interface ImageDisplay {
    
    Image currentImage();
    void display(Image image); 
    
}
