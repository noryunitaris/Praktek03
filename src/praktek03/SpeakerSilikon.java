package praktek03;

public class SpeakerSilikon extends Speaker{
    private String jenisSpeaker;
    
    void throttle(){
        System.out.println("--Audio--");
    }

    public String getJenisSpeaker() {
        return jenisSpeaker;
    }

    public void setJenisSpeaker(String jenisSpeaker) {
        this.jenisSpeaker = jenisSpeaker;
    }
    
    
}
