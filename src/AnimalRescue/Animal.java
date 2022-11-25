package AnimalRescue;

public class Animal {
    private String name;

    private int age;
    private int weight;
    private String gender;
    private String color;
    private int thelevelofhealth;
    private int hungerlevel;
    private int moodlevel;
    private String thefoodname;
    private String thenameoftherecreationalactivity;


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }


    public void setHungerlevel(int hungerlevel) {
        this.hungerlevel = hungerlevel;
    }
    public int getHungerlevel(){
        return hungerlevel;
    }

    public void setMoodlevel(int moodlevel) {
        this.moodlevel = moodlevel;
    }
    public int getMoodlevel(){
        return moodlevel;
    }

    public void setThefoodname(String thefoodname) {
        this.thefoodname = thefoodname;

    }
    public String getThefoodname(){
        return thefoodname;
    }

    public void setThelevelofhealth(int thelevelofhealth) {
        this.thelevelofhealth = thelevelofhealth;
    }
    public int getThelevelofhealth(){
        return thelevelofhealth;
    }

    public void setThenameoftherecreationalactivity(String thenameoftherecreationalactivity) {
        this.thenameoftherecreationalactivity = thenameoftherecreationalactivity;
    }
    public String getThenameoftherecreationalactivity(){
        return thenameoftherecreationalactivity;
    }
}

