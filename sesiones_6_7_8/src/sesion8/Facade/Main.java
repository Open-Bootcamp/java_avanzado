// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0

package sesion8.Facade;

import java.io.File;

public class Main {
    public static void main(String []args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
