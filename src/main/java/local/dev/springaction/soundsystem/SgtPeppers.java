package local.dev.springaction.soundsystem;

import org.springframework.stereotype.Component;

@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("playing cd my dear porn star");
    }
}

/**
 * 没有明确给Component Bean命名的时候，默认id是首字母小写的版本
 *
 */
