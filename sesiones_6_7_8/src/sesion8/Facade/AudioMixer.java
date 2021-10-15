// Creditos: https://refactoring.guru/es/design-patterns/facade/java/example#example-0

package sesion8.Facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}