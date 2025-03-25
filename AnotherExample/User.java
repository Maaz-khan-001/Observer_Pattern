package AnotherExample;

 class User implements Subscriber {
    public String name;

    public User(String name){
        this.name = name;
    }


    @Override
    public void update(String videoTitle) {
        System.out.println(name + " new video is uploaded : " + videoTitle );
    }
    
}
