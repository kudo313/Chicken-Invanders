package code;

public class Missile2Break extends Sprite {
    private int checkBreak=0;
    private int selectImg=1;
    public Missile2Break(int x,int y){
        super(x,y);
        initBreak();
    }
    public void initBreak(){
        loadImage("src/images/missile2break1.png");
        getImageDimensions();
    }
    public void loadImage(){
        String s = "src/images/missile2break" + selectImg +".png";
        loadImage(s);
    }
    public void setSelectImg(int i ){
        selectImg = i;
    }
    public int getSelectImg(){
        return selectImg;
    }
    public int getCheckBreak(){
        return checkBreak;
    }
    public void setCheckBreak(int i){
        checkBreak  = i;
    }
}
