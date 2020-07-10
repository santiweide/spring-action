package local.dev.springaction.knightdemo.minstrel;

import java.io.PrintStream;

public class Minstrel {

    private final PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }


    public void singBeforeQuest() {
        printStream.println("Fa la la sing before quest");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee sing After quest");
    }

}

/**
 * 注意使用Aop要加入maven依赖AspectJ Weaver
 *
 */
