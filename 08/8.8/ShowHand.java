import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
public class ShowHand
{
    // 定义该游戏最多支持多少个玩家
    private final int PLAY_NUM = 5;
    // 定义扑克牌的所有花色和数值
    private String[] types = {"方块","草花","红心","黑桃"};
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    // cards 是一局游戏中剩下的扑克牌
    private List<String> cards = new LinkedList<>();
    // 定义所有的玩家
    private String[] players = new String[PLAY_NUM];
    // 所有玩家手上的扑克牌
    private List<String>[] playersCards = new List[PLAY_NUM];
    /**
     * 初始化扑克牌，放入52张扑克牌
     * 并且使用shuffle方法将它们按随机顺序排列
     */
    public void initCards()
    {
        for(var i = 0; i < types.length; i++)
        {
            for(var j = 0; j < values.length; j++)
            {
                cards.add(types[i] + values[j]);
            }
        }
        Collections.shuffle(cards);
    }
    /**
     * 初始化玩家，为每个玩家分派用户名
     */
    public void initPlayer(String... names)
    {
        if(names.length > PLAY_NUM || names.length < 2)
        {
            // 校验玩家数量，此处使用异常机制更合理
            System.out.println("玩家数量不对");
            return;
        }
        else
        {
            // 初始化玩家用户名
            for(var i = 0; i < names.length; i++ )
            {
                players[i] = names[i];
            }
        }
    }
    /**
     * 初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
     * 程序使用一个长度为0的LinkedList来表示
     **/
    public void initPlayerCards()
    {
        for(var i = 0; i < players.length; i++)
        {
            if(players[i] != null && !players[i].equals(""))
            {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }
    /**
     * 输出全部扑克牌，该方法没有实际作用
     **/
    public void showAllCards()
    {
        for(var card : cards)
        {
            System.out.println(card);
        }
    }
    /**
     * 派扑克牌
     * @param first 最先派给谁
     **/
    public void deliverCard(String first)
    {
        int firstPos = ArrayUtils.search(players, first);
        for(var i = firstPos; i < PLAY_NUM; i++)
        {
            if(players[i] != null)
            {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        for(var i = 0; i < firstPos; i++)
        {
            if(players[i] != null)
            {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }
    /**
     * 输出玩家手上的扑克牌
     * 实现该方法时，应该控制每个玩家看不到别人的第一张牌，但此处没有增加该功能
     **/
    public void showPlayerCards()
    {
        for(var i = 0; i < PLAY_NUM; i++)
        {
            if(players[i] != null)
            {
                System.out.println(players[i] + "：");
                for(var card : playersCards[i])
                {
                    System.out.println(card + "\t");
                }
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)
    {
        var sh = new ShowHand();
        sh.initPlayer("电脑玩家","孙悟空");
        sh.initCards();
        sh.initPlayerCards();
        // 下面测试所有扑克牌，没有实际作用
        sh.showAllCards();
        System.out.println("---------------");
        sh.deliverCard("孙悟空");
        sh.showPlayerCards();
        sh.deliverCard("电脑玩家");
        sh.showPlayerCards();
    }
}
