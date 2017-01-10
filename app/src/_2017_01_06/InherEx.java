package _2017_01_06;

/*
<<<<<<< HEAD
 * 상속(inheritance)
  - 상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미.
  - 특정(자식) 클래스는 다른(부모) 클래스가 가지고 있는 모든 멤버변수나 멤버메소드를 사용할 수 있음.
  - 상속 관계에서 자식클래스의 객체를 생성 하였을 때 부모 클래스의 객체도 생성되어 짐.
  - 상속 관계 표현으로 extends keyword를 사용함.
  - 상속 관계 용어로 super, 상위, 부모 class 와 sub, 하위, 자식 class로 사용 함.
  - 상속의 개념에서 super와 this를 구분함.
  - 메서드를 재사용 할 수 있음. ( method override)
  - 단일 상속(자바에서는 다중 상속x)
  - extends 와 implements를 함께 사용할 수 있음.
=======
 * �긽�냽(inheritance)
  - �긽�냽�씠��� �옄�떇�씠 遺�紐④�� 媛�吏�怨� �엳�뒗 �옱�궛�씠�굹 沅뚮젰�쓣 臾쇰젮諛쏅뒗�떎�뒗 �쓽誘�.
  - �듅�젙(�옄�떇) �겢�옒�뒪�뒗 �떎瑜�(遺�紐�) �겢�옒�뒪媛� 媛�吏�怨� �엳�뒗 紐⑤뱺 硫ㅻ쾭蹂��닔�굹 硫ㅻ쾭硫붿냼�뱶瑜� �궗�슜�븷 �닔 �엳�쓬.
  - �긽�냽 愿�怨꾩뿉�꽌 �옄�떇�겢�옒�뒪�쓽 媛앹껜瑜� �깮�꽦 �븯����쓣 �븣 遺�紐� �겢�옒�뒪�쓽 媛앹껜�룄 �깮�꽦�릺�뼱 吏�.
  - �긽�냽 愿�怨� �몴�쁽�쑝濡� extends keyword瑜� �궗�슜�븿.
  - �긽�냽 愿�怨� �슜�뼱濡� super, �긽�쐞, 遺�紐� class ��� sub, �븯�쐞, �옄�떇 class濡� �궗�슜 �븿.
  - �긽�냽�쓽 媛쒕뀗�뿉�꽌 super��� this瑜� 援щ텇�븿.
  - 硫붿꽌�뱶瑜� �옱�궗�슜 �븷 �닔 �엳�쓬. ( method override)
  - �떒�씪 �긽�냽(�옄諛붿뿉�꽌�뒗 �떎以� �긽�냽x)
  - extends ��� implements瑜� �븿猿� �궗�슜�븷 �닔 �엳�쓬.
>>>>>>> origin/master
  
  �삎�떇)
  class A extends B {
  	臾몄옣援ы쁽;
  }
 */

// �삤踰꾨줈�뱶瑜� �벐�뒗 �씠�쑀�뒗 
// ex) �옄�룞李⑤�� �삁濡쒕뱾�뼱 �옄�룞李⑤뱾�쓣 �겢�옒�뒪濡� �몴�쁽�븷 �븣, 洹� 李⑤뱾�씠 媛숈�� 遺��뭹�쓣 �벝�닔�룄�엳怨�, �떎瑜� 遺��뭹�쓣 �벝 �닔�룄 �엳�뒗�뜲,
// ����씠�뼱瑜� �삁濡쒕뱾�뼱 �삤踰꾨줈�뱶瑜� �궗�슜�븯�뿬, 媛숈�� 遺��뭹�쓣 洹몃��濡� �긽�냽諛쏆븘 �벐嫄곕굹, �떎瑜몃���뭹��� 湲곗〈 遺��뭹�쓽 �옱�궗�슜�쓣 �넻�빐 留뚮뱾硫� �맂�떎. 洹몃옒�꽌 �삤踰꾨줈�뱶瑜� ���.

// �긽�냽 �궗�슜
public class InherEx extends SuperClass {	// extends SuperClass 瑜� �넻�빐 SuperClass �쓽 �엳�뒗嫄� �궡爰쇱쿂�읆 �벖�떎.
	//�깮�꽦�옄
	int age = 1;
	int age2;
	public InherEx() {
		super(); // �씠寃� �닲寃⑥졇 �엳�떎.  <- super �뒗 援щЦ�뿉�꽌 理쒖긽�떒�뿉 �쐞移� �빐�빞�븳�떎.
		System.out.println("subClass " + this.age);	// �긽�냽�맂 �긽�깭�뿉�꽌 this.媛앹껜�슂�냼�뒗 媛�源뚯슫 �궡爰쇰���꽣 李얘퀬 �뾾�쑝硫� 遺�紐④퍍 �궗�슜
		System.out.println("subClass " + super.age);
	}
	
	public InherEx(int age) {
		System.out.println("subClass2");
	}
	
	public void methodA() {
		System.out.println("methodA");
	}
	
	public static void main(String[] args) {
		InherEx inder = new InherEx(); // �쇅遺� SuperClass �긽�냽
		//SuperClass sc = new SuperClass();
		System.out.println("age : " +inder.age);	// ����땳蹂��닔�떎. inder.age�뒗 遺�紐⑥쓽 age瑜� 媛�由ш퀬 �궡 age瑜� ���.
		System.out.println("name : " +inder.name);
		
		//4) �삤踰꾨씪�씠�뱶 �궗�슜
		//sc.methodA();
		inder.methodA();
		
		
		// �삎蹂��솚�쓽 寃쎌슦  湲곕낯����엯�쓽 �삎蹂��솚��� �뜲�씠�꽣 �넀�떎�씠 �엳�쓣 �닔 �엳湲� �븣臾몄뿉 �옒 �븞�벐吏�留�, !! 媛앹껜����엯�뿉�꽌�뒗 �뜲�씠�꽣 �넀�떎�씠 �뾾湲� �븣臾몄뿉 �븘二� 留롮씠 �벖�떎.
		// �삎 蹂��솚	// �긽�냽愿�怨꾩뿉 �엳�쓣 �븣留� 媛��뒫�븯�떎.
		SuperClass supercalss = inder;	// �옄�떇 ����엯�뿉�꽌 �겙 ����엯�쑝濡� �옄�룞�쑝濡� �삎 蹂��솚.
		//System.out.println(supercalss.age2); // 遺�紐⑦���엯�쑝濡� 蹂��솚 �맆 �닔�뒗 �엳�뒗�뜲 age2�뒗 遺�紐⑥뿉 �뾾湲� �븣臾몄뿉 �벝 �닔�뾾�떎.
		
		// 媛뺤젣 �삎 蹂��솴 ( 紐낆떆�쟻 �삎 蹂��솚 )
		InherEx inder2 = (InherEx) supercalss;	// 洹몃옒�꽌 遺�紐⑦���엯�쑝濡� 蹂��븳 age2 瑜� �벐湲� �쐞�빐�꽌�뒗 �떎�떆 �옄�떇 ����엯�쑝濡� 紐낆떆�쟻 �삎 蹂��솚�씠 �븘�슂�븯�떎.
		System.out.println(inder2.age);	// �궡爰쇨�� 遺�紐⑦���엯�씠�꽕.. 洹몃읆 �떎�떆 �궡 ����엯�쓣 諛붽퓭�꽌 �씫�뼱�빞吏뺤쭠�씠
		
		// super() �궗�슜
		// this() �궗�슜
		// super.媛앹껜�슂�냼
		// this.媛앹껜�슂�냼
		
		/*
		 	1) �삎 蹂��솚
		 	2) 罹먯뒪�똿
		 	3) Object �삎 蹂��솚
		 	4) �삤踰꾨씪�씠�뱶 �궗�슜
		 	5) ����땳蹂��닔 �궗�슜
		 */
	}
}
class SuperClass {
	int age;
	String name;
	
	public void methodB() {
		System.out.println("methodA");
	}
	
	public SuperClass() {	// SuperClass 珥덇린�솕
		System.out.println("superClass");
		age = 10;
		name = "�솉湲몃룞";
	}
}	// �떎�뻾 �닚�꽌 : SuperClass -> �깮�꽦�옄 -> main硫붿냼�뱶


// 湲곗〈 嫄�

/*public class IngerEx extends SuperClass {
	public static void main(String[] args) {
		SuperClass superclass = new SuperClass(); // �쇅遺� SuperClass �뿰寃�
		System.out.println("age : " +superclass.age);
		System.out.println("name : " +superclass.name);
	}
}

class SuperClass {
	int age;
	String name;
	
	public SuperClass() {	// SuperClass 珥덇린�솕
		age = 10;
		name = "�솉湲몃룞";
	}
}*/
