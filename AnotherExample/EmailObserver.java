package AnotherExample;

public class EmailObserver implements Subscriber {
    public String email;

    public EmailObserver(String email){
        this.email = email;
    }

    @Override
    public void update(String videoTitle){
        System.out.println(email + " new video is uploaded : " + videoTitle);
    }
}
