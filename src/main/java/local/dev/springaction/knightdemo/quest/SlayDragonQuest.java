package local.dev.springaction.knightdemo.quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
    private final PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }


    @Override
    public void embark() {
        printStream.println("Embarking quest on slay dragon quest");
    }
}



/**
    如何把pringStream交给SlayDragonQuest?
    如何把SlayDragonQuest交给BraveKnight?
    ==> wiring 装配
        * xml装配
        * Java Configuration配
 **/