package local.dev.springaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private final CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}

/**
 * 除了在构造器上Autowired注入，还可以在setter/insert的参数上注入
 * @Autowired(required = false) 的话
 *      Spring仍然会自动执行装配，但是如果没有匹配的bean的话，Spring会允许这个bean是没有wired的状态。
 *      这样做的问题是，如果代码里面没有Null检查的话，可能会有NullPointerException
 **/