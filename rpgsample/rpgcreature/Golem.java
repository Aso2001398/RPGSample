package rpgcreature;

import java.util.Random;

/**
 * ゴーレムクラス
 */
public class Golem extends Monster{
    private final static int CRITICAL_HIT_RATE = 5;
    private final static int HP=100;
    private final static int GOLD=300;
    private final static int DEFENSIVE=3;
    /**
     * ゴーレムクラスのコンストラクタ
     */
    public Golem(){
        super("ゴーレム",HP,GOLD,DEFENSIVE);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        int damage = 0;
        System.out.printf("%sの攻撃！\n",getName());

        //クリティカルヒットかのチェック
        if( r.nextInt(100) < CRITICAL_HIT_RATE ){
            //クリティカルヒット
            damage = 30;
            System.out.printf("%sのクリティカルヒット！\n",getName());
        }else{
            damage = r.nextInt(6)+5;
            
        }
        opponent.damaged(damage);
        
        displayMessage(opponent,damage);
        
    }
    
}
