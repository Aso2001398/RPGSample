package rpgcreature;

import java.util.Random;

/**
 * スライムクラス
 */
public class Slime extends Monster{
    private final static int HP=12;
    private final static int GOLD=5;
    private final static int DEFENSIVE=0;
    /**
     * スライムクラスのコンストラクタ
     */
    public Slime(){
        super("スライム",HP,GOLD,DEFENSIVE);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        int damage = r.nextInt(5);
        System.out.printf("%sの攻撃！\n",getName());
        
        opponent.damaged(damage);
        
        displayMessage(opponent,damage);
        
    }
    
}
