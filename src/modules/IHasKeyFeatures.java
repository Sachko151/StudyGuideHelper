package modules;

import java.nio.file.Path;

public interface IHasKeyFeatures {

    void create(Path path, String content);

    void read(Path path);

    void update();

    void delete();
}
