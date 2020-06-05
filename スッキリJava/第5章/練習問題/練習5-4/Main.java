public class Main{

 public static void main(String[] args){
//変数を用意して、その中にメソッドの呼び出したものを入れようとしている。
  double triangleArea =calcTriangleArea(10.0,5.0);
  System.out.println("三角形の面積:"+triangleArea+"㎡");
//上記と同じ
  double circleArea = calcCircleArea(5.0);
  System.out.println("円の面積:"+circleArea+"㎡");

 }
 //戻り値を使用したいときは、戻る値の型　メソッド名といった書き方になる。
 public static double calcTriangleArea(double bottom,double height){
//ここではmainから取ってきた値を使って計算している
  double area =(bottom*height)/2;
  //計算したものを変数に入れてmainに戻す動作をしている。
  return area;
}

 public static double calcCircleArea(double radius){
  double area = radius*radius*3.14;
  return area;
}

}
