public class Main {

    public static void main(String[] args) {

        cours course1 = new cours(1, "C#", 15, "C# yazilim geliştirici yetiştirme kampi");
        cours course2 = new cours(2, "JAVA", 30, "JAVA yazilim gelistirici yetistirme kampi");

        cours course3=new cours(3,"c++,",45,"her yerde yazilimci");

     //   cours[] courses = new cours[] {course1, course2,course3} ;

       /* for (cours course : courses) {
            System.out.println(course.getId());
            System.out.println(course.getName());
            System.out.println(course.getProgress());
            System.out.println(course.getContent());
            System.out.println("********");
        }*/


        System.out.println(course1.getName());
        System.out.println(course3.getName());
        courseManager coursemanager=new courseManager();
        coursemanager.add(course1);
        coursemanager.delete(course2);
        coursemanager.update(course3);
        System.out.println("**********************************");


        Instructor instructor1 =new Instructor("kutabalama","C#");
        Instructor instructor2 = new Instructor("fearlest","java");
        instructorManager instructorManager =new instructorManager();
        instructorManager.login(instructor1);
        instructorManager.logout(instructor2);






    }
}
