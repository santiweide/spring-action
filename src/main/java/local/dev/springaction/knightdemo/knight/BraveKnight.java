package local.dev.springaction.knightdemo.knight;

import local.dev.springaction.knightdemo.quest.Quest;

public class BraveKnight implements Knight{

    private final Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
