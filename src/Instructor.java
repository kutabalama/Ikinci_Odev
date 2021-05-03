public class Instructor {
    private String nickname;
    private String courseName;

    public Instructor(String nickname, String courseName) {
        this.courseName=courseName;
        this.nickname=nickname;


            }

    public String getName() {return nickname; }

    public void setName(String name) {
        this.nickname = name;
    }

    public String getAge() {
        return courseName;
    }

    public void setAge(String age) { this.courseName = age; }


}
