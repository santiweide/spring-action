package local.dev.springaction.knightdemo.knight;


import local.dev.springaction.knightdemo.quest.Quest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BraveKnightTest {

    @Test
    void embarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        //用mock验证embark()方法仅仅被调用了一次
        verify(mockQuest,times(1)).embark();
    }
}