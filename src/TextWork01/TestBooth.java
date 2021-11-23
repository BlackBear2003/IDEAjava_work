package TextWork01;

public class TestBooth {


    public static void main(String[] args) {

        Booth zhengtao = new Booth(114514111, "郑涛", 80, true);

        Booth huaqiang = new Booth(348358584, "华强", 80, false);
        //toString方法
        huaqiang.setId(233333333);
        huaqiang.setName("强子");
        System.out.println(huaqiang);
        System.out.println(zhengtao);
        //买瓜方法（全买了）
        Booth.purchase(huaqiang, huaqiang.getTotal());
        //进货方法
        huaqiang.restock(100);
        //关店方法，并输出所有店的状态
        Booth[] booths = {zhengtao, huaqiang};
        Booth.closeBooths(booths);
        //输入创建西瓜摊的方法（含id查重方法）
        System.out.println("下面是输入一个商贩的方法");
        Booth.inputBooth();
        System.out.println(Booth.IDlist);
        //可创建两个西瓜摊
        Booth.inputBooth();
    }

}
