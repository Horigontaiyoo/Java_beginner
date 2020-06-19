public class PoisonMatango extends Matango{
  int poisonCount = 5;
  public PoisonMatango(char suffix){
    //superで親コンストラクタ呼び出し。引数が一つのコンストラクタを呼び足している。
    super(suffix);
  }
  public void attack(Hero h){
    //親インスタンスのattackメソッドを利用している。
    super.attack(h);
    if(this.poisonCount > 0){
      System.out.println("さらに毒の胞子が襲う！！！");
      int dmg = h.hp / 5;
      System.out.println(dmg+"ポイントのダメージ");
      this.poisonCount--;
    }
  }
}
