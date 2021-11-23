package TextWork01;

import java.util.Scanner;
import java.util.ArrayList;

public class Booth {
    private long id;
    private String name;
    private int total;
    private boolean isClosed;
    static  ArrayList<Long> IDlist = new ArrayList<>();

    //构造方法
    public Booth(long id, String name, int total, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
        IDlist.add(id);
    }

    //用户输入创建西瓜摊的方法
     public static void inputBooth() {
        Scanner input = new Scanner(System.in);
        System.out.println("下面开始创建一个西瓜摊\n请输入ID");
        long testid = input.nextLong();
        long id;
         //判断ID的重复性
         while (true){
             if (Booth.IDlist.contains(testid)) {
                 System.out.println("ID重复！请重新输入");
                 testid = input.nextLong();
             }
             else {
                 System.out.println("ID输入成功！");
                 id = testid;
                 break;
             }
         }

        System.out.println("请输入摊主的名字");
        String name = input.next();

        System.out.println("请输入西瓜摊上西瓜的数量");
        int total = input.nextInt();

        System.out.println("请输入西瓜摊是否整改的");
        boolean isClosed = input.nextBoolean();

        Booth newbooth = new Booth(id,name,total,isClosed);

        System.out.println(newbooth);
    }

    //关闭西瓜摊的方法
    static void closeBooths(Booth[] booths){
        for (Booth booth : booths) {
            if (!booth.isClosed) {
                booth.setIsClosed(true);
            }
            System.out.println(booth);
        }
    }

    //进货方法
    public void restock(int quantity){
        if (quantity>200){
            System.out.println("进货数量过多，瓜被神秘骑车男子劈了");
        }
        else if (quantity<0){
            System.out.println("Restock failed !");
        }
        else {
            this.setTotal(this.getTotal()+quantity);
            System.out.println("Restock done ! Now the total : " + this.getTotal());
            System.out.println(this);
        }
    }

    //购买方法
    static void purchase(Booth booth, int quantity){
        if (booth.isClosed){
            System.out.println("The booth has closed !");
        }
        else{
            if (quantity<0){
                System.out.println("The quantity must be greater than zero ！");
            }
            else if (quantity==0){
                System.out.println("你故意找茬的吧，你要不要吧！");
            }
            else {
                if (quantity> booth.getTotal()){
                    System.out.println("Shortage of stock !");
                }
                else {
                    booth.setTotal(booth.getTotal()-quantity);
                    System.out.println("Done deal ! The rest : " + booth.total);
                    System.out.println(booth);
                }
            }
        }
    }

    //重写的toString方法
    @Override
    public String toString(){
        return  name + "的西瓜摊！\n" + "id : " + getId() + "\nname : " + getName()
                + "\nthe number of watermelon : " + getTotal()
                + "\nis the booth closed ? " + getIsClosed() + "\n";
    }

    //数值的set，get方法
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return total;
    }

    public void setIsClosed(boolean isClosed){
        this.isClosed = isClosed;
    }
    public boolean getIsClosed(){
        return isClosed;
    }
}

