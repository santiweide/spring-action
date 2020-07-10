package local.dev.springaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("playing cd my dear porn star");
    }
}
