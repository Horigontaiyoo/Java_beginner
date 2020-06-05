public class Main{
  public static void main(String[] args){
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String yourName = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String yourAge = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(yourAge);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(age+"歳の"+yourName+"さん、あなたの運気番号は"+fortune+"です");
    System.out.println("1:大吉2:中吉3:吉4:凶");
  }

}
