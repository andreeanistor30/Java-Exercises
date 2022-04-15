package isp.lab5.exercise2;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}

class ProxyVideo implements Playable {

    private ColorVideo video;
    private BlackAndWhiteVideo video2;
    private String fileName;

    public ProxyVideo(String fileName, boolean isColor){
        this.fileName = fileName;
        if(isColor==true)
           video=new ColorVideo(fileName);
        else
            video2=new BlackAndWhiteVideo(fileName);
            
    }

    @Override
    public void play() {
        if(video == null){
            video = new ColorVideo(fileName);
        }
        video.play();
    }
}
class BlackAndWhiteVideo implements Playable{
     private String fileName;

    public BlackAndWhiteVideo(String fileName) {
        this.fileName = fileName;
    }
     
    @Override
    public void play() {
        System.out.println("Play black and white video {" + fileName+"}");
    }
}


